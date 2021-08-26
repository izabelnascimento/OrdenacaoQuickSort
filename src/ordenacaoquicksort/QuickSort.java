package ordenacaoquicksort;

import java.util.Arrays;

public class QuickSort {
    
    public void quicksort(int[]v, int esq, int dir){
        if(esq < dir){
            int j = separar(v, esq, dir);
            quicksort(v, esq, j-1);
            quicksort(v, j+1, dir);
        }
    }
    
    private int separar(int[]v, int esq, int dir){
        int i = esq +1;
        int j = dir;
        int pivo = v[esq];
        while(i<= j){
            if(v[i] <= pivo) i++;
            else if(v[j] > pivo) j--;
            else if(i <= j){
                trocar(v, i, j);
                i++;
                j--;
            }
        }
        trocar(v, esq, j);
        return j;
    }
    
    private void trocar(int[] v, int i, int j){
        int aux = v[i]; 
        v[i] = v[j];
        v[j] = aux;
    }
    
}

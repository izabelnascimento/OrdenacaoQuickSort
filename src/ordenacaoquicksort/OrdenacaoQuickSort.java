package ordenacaoquicksort;

import java.util.Arrays;

public class OrdenacaoQuickSort {

    public static void main(String[] args) {
        
        QuickSort a = new QuickSort();
        
        int[]v = {6,3,4,5,2,7,1,9,8,0};
        a.quicksort(v, 0, v.length -1);
        System.out.println(Arrays.toString(v));
    }    
}

public class BubbleSort {

    public static void main(String[] args) {
        int[] array= {6,3,8,4,5,12,13,11,9,10};


        int temp;
         int i;int j; int k;

         // BubbleSort
        for (i = 0 ; i < array.length; i++){
            for (j=0; j < array.length-i-1; j++){      
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        for(i=0 ; i < array.length ; i++)
        {
            System.out.print(""+array[i]+",");
        }
    }
    
}

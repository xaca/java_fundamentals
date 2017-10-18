import java.util.*;
public class QuickSort {
	//Partition function, Here we are doing randomized partition
	public static int rand_partition(int arr[],int start,int end)
	{
	    int i = start-1,temp;
	    int random = start + (int)(Math.random() * (((end-1) - start)+ 1));	//Math.random() function generates random variable 
	    int piv;															//between start and end and this random number is 
	    temp = arr[end];													//chosen as pivot which optimizes quick sort.
	    arr[end] = arr[random];
	    arr[random] = temp;
	    piv = arr[end]; 
	    
	    for(int j = start; j < end; j++)
	    {
	        if(arr[j] <= piv)
	        {
	        	i++;
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            
	        }
	    }
	    temp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = temp;
	    return (i+1);
	}
	//Quick_Sort function
	public void QkSort(int[] arr,int start,int end)
	{
		
	    if(start < end)
	    {
	        int piv_pos = rand_partition(arr,start,end);
	        	
	        QkSort(arr,start,piv_pos-1);
	        QkSort(arr,piv_pos+1,end);
	    }
	}
	//Main Function
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size;		
		System.out.print("Enter size of array to be sorted: ");
		size = sc.nextInt();		
		int[] arr = new int[size];
		System.out.print("Enter element in array to be sorted: ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();		//Input elements in the array
		}
	
		
		QuickSort obj = new QuickSort();	//Object creation for calling methods
		
		obj.QkSort(arr,0,size-1);
		
		System.out.println("Sorted Array:-");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i]+" ");		
		}
		System.out.println();
	}

}

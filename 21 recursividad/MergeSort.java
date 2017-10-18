import java.util.Scanner;

class MergeSort
{
	// Merges two subarrays of arr[].
	void merge(int arr[], int left, int mid, int right)
	{
		// Find sizes of two subarrays to be merged
		int s1 = mid - left + 1;
		int s2 = right - mid;

		/* Create temporary arrays */
		int L[] = new int [s1];
		int R[] = new int [s2];

		/*Copy data to temp arrays*/
		for (int i=0; i<s1; ++i)
			L[i] = arr[left + i];
		for (int j=0; j<s2; ++j)
			R[j] = arr[mid + 1+ j];


		/* Merging of the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		
		int k = left;
		while (i < s1 && j < s2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < s1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < s2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main method that sorts arr[l..r] using  merge() method
	void sort(int arr[], int start, int end)
	{
		if (start < end)
		{
			// Find the middle point
			int mid = (start+end)/2;

			// Sort first and second parts
			sort(arr, start, mid);
			sort(arr , mid+1, end);

			// Merge the sorted parts of array
			merge(arr, start, mid, end);
		}
	}

	
	// Main method
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size;		
		System.out.print("Enter Size of array to be sorted: ");
		size = sc.nextInt();		
		int[] arr = new int[size];
		System.out.print("Enter element in array to be sorted: ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();		//Input elements in the array
		}
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, size-1);

		System.out.println("sorted array");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i]+" ");		
		}
		System.out.println();
	}
}

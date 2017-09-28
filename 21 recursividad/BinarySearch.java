public class BinarySearch {
    public static int search(int[] array, int n, int start, int end){
        if(start > end)
            return -1;
        else {
            int mid = (end + start) / 2;
            if(array[mid] == n)
                return mid;
            else if(array[mid] > n)
                return search(array, n, start, mid - 1);
            else
                return search(array, n, mid + 1, end);
        }
    }

    public static void main(String[] args){
        System.out.println(search(new int[]{ 1, 2, 3, 12, 16, 22, 44, 56 },
                                  22, 0, 7));

        System.out.println(search(new int[]{ 1, 45, 50, 62, 100 },
                                  51, 0, 4 ));
    }
}

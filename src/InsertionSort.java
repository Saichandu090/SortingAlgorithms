public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] ar={54,34,23,87,67,45,12,9};
        System.out.println("Before sorting");
        for(int i =0;i< ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        System.out.println("After sorting");
        insertionSort(ar);
        for(int i =0;i< ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void insertionSort(int[] ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            int key=ar[i];
            int j=i-1;
            while(j>=0&&ar[j]>key)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
    }
}

public class SelectionSort
{
    public static void main(String[] args) {

        int[] ar={54,34,23,87,67,45,12,9};
        System.out.println("Before sorting");
        for(int i =0;i< ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        System.out.println("After sorting");
        selectionSort(ar);
        for(int i =0;i< ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void selectionSort(int[] ar)
    {
        for(int i=0;i< ar.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j< ar.length;j++)
            {
                if(ar[minIndex]>ar[j])
                    minIndex=j;
            }
            int temp=ar[minIndex];
            ar[minIndex]=ar[i];
            ar[i]=temp;
        }
    }
}

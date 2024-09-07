public class BubbleSort
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
        bubbleSort(ar);
        for(int i =0;i< ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void bubbleSort(int[] ar)
    {
        for(int i=0;i< ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
}

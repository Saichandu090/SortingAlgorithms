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
        bubbleDownSort(ar);
        for(int i =0;i< ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void bubbleUpSort(int[] ar)
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

    public static void bubbleDownSort(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
}

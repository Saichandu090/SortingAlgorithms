public class MergeSort
{
    public static void main(String[] args) {

        int[] ar={5,2,6,1,9,4,3,7,5};

        for(int i : ar)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=========");

        mergeSort(ar,0,ar.length-1);
        for(int i : ar)
        {
            System.out.print(i+" ");
        }
    }

    public static void mergeSort(int[] ar,int left,int right)
    {
        if(left<right)
        {
            int mid = (left + right) / 2;
            mergeSort(ar,left,mid);
            mergeSort(ar,mid+1,right);
            merge(ar,left,right,mid);
        }
    }

    public static void merge(int[] ar,int left,int right,int mid)
    {
        int n1=mid-left+1;
        int n2=right-mid;

        int[] lArr=new int[n1];
        int[] rArr=new int[n2];

        for(int i=0;i<n1;i++)
        {
            lArr[i]=ar[left+i];
        }

        for(int j=0;j<n2;j++)
        {
            rArr[j]=ar[mid+1+j];
        }

        int i=0,j=0,k=left;

        while(i<lArr.length&&j<rArr.length)
        {
            if(lArr[i]<=rArr[j])
            {
                ar[k++]=lArr[i++];
            }
            else if(rArr[j]<lArr[i])
            {
                ar[k++]=rArr[j++];
            }
        }

        while(i<lArr.length)
        {
            ar[k++]=lArr[i++];
        }

        while(j<rArr.length)
        {
            ar[k++]=rArr[j++];
        }
    }
}

public class MERGE {
    public static void mergeSort(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void divide(int a[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        divide(a,start,mid);
        divide(a,mid+1,end);
        conquer(a,start,mid,end);
    }
    public static void conquer(int a[],int start, int mid, int end){
        int temp[]=new int[end-start+1];
        int x[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while (j <= end) {
            temp[k++] = a[j++];
        }
        for(i=start;i<=end;i++){
            a[i]=temp[i-start];
        }
    }

    public static void main(String[] args) {
        int a[]={12,11,13,5,6,7};
        System.out.println("Original array = ");
        mergeSort(a);
        divide(a,0,a.length-1);
        System.out.println("Sorted array = ");
        mergeSort(a);
    }
}

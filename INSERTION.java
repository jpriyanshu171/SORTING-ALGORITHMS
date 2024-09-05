// Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
public class INSERTION {
    public static void insertionSort(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={23,54,33,87,12};
        for(int i=0;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        insertionSort(a);
    }
}
/*
Time Complexity of Insertion Sort:

* The worst-case time complexity of the Insertion sort is O(N^2)
* The average case time complexity of the Insertion sort is O(N^2)
* The time complexity of the best case is O(N).

Space Complexity of Insertion Sort:

* The auxiliary space complexity of Insertion Sort is O(1)

Characteristics of Insertion Sort:

* This algorithm is one of the simplest algorithms with a simple implementation
* Basically, Insertion sort is efficient for small data values
* Insertion sort is adaptive in nature, i.e. it is appropriate for data sets that are already partially sorted.
*/
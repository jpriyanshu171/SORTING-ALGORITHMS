// Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.
public class SELECTION {
    public static void selectionSort(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={64,23,45,12,34};
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                    int temp=a[min];
                    a[min]=a[i];
                    a[i]=temp;
                }
            }
        }
        selectionSort(a);
    }
}
/*
Time Complexity:

* The time complexity of Selection Sort is O(N2) as there are two nested loops.
* One loop to select an element of Array one by one = O(N)
* Another loop to compare that element with every other Array element = O(N)
* Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)

Advantages of Selection Sort Algorithm:

* Simple and easy to understand.
* Works well with small datasets.

Disadvantages of the Selection Sort Algorithm:

* Selection sort has a time complexity of O(n^2) in the worst and average case.
* Does not work well on large datasets.
* Does not preserve the relative order of items with equal keys which means it is not stable.
*/
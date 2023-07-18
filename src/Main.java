import Hw2.PyramidSort;
public class Main {

    /* Вспомогательная функция для вывода на экран массива размера n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    // Управляющая программа
    public void main(String args[])
    {
        int arr[] = {8, 45, 13, 17, 6, 7};
        int n = arr.length;

        PyramidSort ob = new PyramidSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
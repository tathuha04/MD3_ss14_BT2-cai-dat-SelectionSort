public class SelectionSort {
    static int[] list = {8,4,2,7,3,5,9};

    public static void insertionSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            int j = i -1;
            while (j>=0 && list[j] > key){
                list[j +1] = list[j];
                j = j -1;
            }
            list[j +1] = key;
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");;
        }
    }
}
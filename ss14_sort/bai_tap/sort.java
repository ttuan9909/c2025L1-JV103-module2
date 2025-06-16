package ss14_sort.bai_tap;

public class sort {
    public static void main(String[] args) {
        sort ob = new sort();

        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ob.insertionSort1(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void insertionSort1(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && currentElement < list[k]; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;

            System.out.print("Bước " + i + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + " ");
            }
            System.out.println();
        }
    }
}


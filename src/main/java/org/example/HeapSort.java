package org.example;

public class HeapSort {

    // Метод для выполнения heapify на поддереве с корнем в i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;  // Инициализируем корень как самый большой элемент
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый дочерний элемент больше корня
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Если правый дочерний элемент больше самого большого элемента
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Если largest не является корнем, то меняем местами
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно вызываем heapify для поддерева, которое изменилось
            heapify(arr, n, largest);
        }
    }

    // Основной метод для сортировки массива с помощью heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Строим max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Один за другим извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем heapify для уменьшенной кучи
            heapify(arr, i, 0);
        }
    }

    // Метод для печати массива
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

    }
}

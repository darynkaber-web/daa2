
import org.example.HeapSort;
public class PerformanceTest {

    public static void main(String[] args) {
        // Пример разных размеров массивов
        int[] sizes = {100, 1000, 10000, 100000};

        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            long startTime = System.nanoTime();
            HeapSort.heapSort(arr);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Size: " + size + ", Time: " + duration + " nanoseconds");
        }
    }

    // Метод для генерации случайного массива
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 1000);  // Генерирует случайные числа от 0 до 999
        }
        return arr;
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.HeapSort;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {

    @Test
    public void testHeapSort() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {5};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
}

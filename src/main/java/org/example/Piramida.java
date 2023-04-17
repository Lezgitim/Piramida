package org.example;

public class Piramida {

    public static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if(leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        if(rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        if(largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }

    }
}

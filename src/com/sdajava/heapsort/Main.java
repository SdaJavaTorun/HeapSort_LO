package com.sdajava.heapsort;

public class Main {

    public static void main(String[] args) {


        int[] tablica = {7,8,2,5,6};

        HeapSort heapSort = new HeapSort();

        heapSort.sort(tablica);

        for(int value: tablica){
            System.out.printf(value + " ");
        }

    }
}

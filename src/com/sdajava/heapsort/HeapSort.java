package com.sdajava.heapsort;

/**
 * Created by lukas on 14.03.2017.
 */
public class HeapSort {

    private int[] tablica;
    private int size;
    private int left;
    private int right;
    private int largest;

    public void buildheap(int[] tablica){

        size = tablica.length-1;

        for(int i=size; i>=0; i--){

            maxheap(tablica, i);

        }

    }

    public void maxheap(int[] tablica, int i){

        left=2*i;
        right=2*i+1;

        if(left <= size && tablica[left] > tablica[i]){
            largest=left;
        }else {
            largest=i;
        }

        if(right <= size && tablica[right] > tablica[largest]){
            largest=right;
        }
        if(largest!=i){

            swap(i, largest);

            maxheap(tablica, largest);

        }

    }

    public void swap(int i, int j){

        int tmp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = tmp;

    }

    public void sort(int[] tablica_sort){

        tablica = tablica_sort;
        buildheap(tablica);

        for(int i=size; i>0; i--){

            swap(0, i);

            size = size - 1;
            maxheap(tablica, 0);


        }

    }

}

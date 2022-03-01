package com.javacore.hw21;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        for (int i = (intArrayList.size() - 1); i >= 0; i--){
            if(intArrayList.get(i)  < 0) {
                intArrayList.remove(i);
            }
            else if(intArrayList.get(i) % 2 == 1 || intArrayList.get(i) == 0) {
                intArrayList.remove(i);
            }
        }
        intArrayList.sort(Comparator.naturalOrder());
        System.out.println("Итоговый массив: ");
        for (int el : intArrayList) {
            System.out.print(el + " ");
        }

    }
}

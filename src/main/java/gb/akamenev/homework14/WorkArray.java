package gb.akamenev.homework14;

import java.util.ArrayList;

public class WorkArray {
    public static void main(String[] args) {
        final int num = 4;
        int [] array = {1,4,2,3,4,5,6,7,8,3,6,4,4,2,1,4,5,7,8};
        int[] resultArray = afterNum(array, num);
        printArray(resultArray);
        System.out.println(binaryTrue(array, 1, 4));
    }

    public static boolean binaryTrue (int[] array, int num1, int num2){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != num1 || array[i] != num2){
                return false;
            }
        }
        return true;
    }

    public static int[] afterNum (int[] array, int num) {
ArrayList<Integer> listAfterNum = new ArrayList<>();
        if (isNumIn(array, num)){
            for (int i = findLastIndex(array, num) + 1; i < array.length; i++) {
                listAfterNum.add(array[i]);
            }
        } else {
            throw new RuntimeException("Выкинуто исключение: в исследуемом массиве нет числа " + num);
        }
        int[] newArray = listToIntArray(listAfterNum);
        return newArray;
    }

    public static int[] listToIntArray (ArrayList<Integer> list){
        int length = list.size();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int findLastIndex (int[] array, int num) {
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static boolean isNumIn (int[] array, int num){
        int index = findLastIndex(array, num);
        if (index != -1){
            return true;
        }
        return false;
    }

    static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

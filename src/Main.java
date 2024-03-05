import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //ЗАДАЧА1
        System.out.println("ЗАДАЧА1");
        int[]arrOfInt = new int[]{1, 2, 3};
        double[]arrOfDouble = {1.57, 7.654, 9.986};
        int[]improArr = {4, 5, 6};
        //по дефолту массив заполнен нулями
        //ЗАДАЧА2
        System.out.println("ЗАДАЧА2");
        int arrSize = arrOfInt.length;
        int i = 0;
        while (i<arrSize){
            System.out.print(arrOfInt[i]);
            i += 1;
            if(i<arrSize) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        arrSize = arrOfDouble.length;
        i = 0;
        while (i<arrSize) {
            System.out.print(arrOfDouble[i]);
            i += 1;
            if (i < arrSize) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        arrSize = improArr.length;
        i = 0;
        while (i<arrSize) {
            System.out.print(improArr[i]);
            i += 1;
            if (i < arrSize) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        //ЗАДАЧА3
        System.out.println("ЗАДАЧА3");
        arrSize = arrOfInt.length-1;
        while (0<=arrSize) {
            System.out.print(arrOfInt[arrSize]);
            arrSize -= 1;
            if (0 <= arrSize) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        arrSize = arrOfDouble.length-1;
        while (0<=arrSize) {
            System.out.print(arrOfDouble[arrSize]);
            arrSize -= 1;
            if (0 <= arrSize) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        arrSize = improArr.length-1;
        while (0<=arrSize) {
            System.out.print(improArr[arrSize]);
            arrSize -= 1;
            if (0 <= arrSize) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        //ЗАДАЧА4
        System.out.println("ЗАДАЧА4");
        for(int index = 0; index<arrOfInt.length; index++){
            if(arrOfInt[index]%2==1){
                arrOfInt[index] += 1;
            }
        }
        String s1 = Arrays.toString(arrOfInt);
        System.out.println(s1);
    }
}
import java.awt.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {
        System.out.println(task4(2,-2));
    }

    static void task0() {
        System.out.println("Input your name:  ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) System.out.println("Good morning ," + name);
        else if (hour >= 11 && hour < 18) {
            System.out.println("Good day ," + name);
        } else if (hour < 23) {
            System.out.println("Good evening ," + name);
        } else {
            System.out.println("Good night ," + name);
        }
        scanner.close();
    }

    static void task1() {
        /** дан массив двоичних чисел например [ 1,1,0,1,1,1] вывести максимальное количество подряд идущих 1 */
        int[] arr = {1, 1, 0,1, 0, 1, 1, 1, 0, 1};
        int temp = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) temp++;
            else if (arr[i] == 0 || temp > maxOnes){

                maxOnes = temp;
                temp = 0;

            }
        }
        if(temp > maxOnes)
        maxOnes = temp;
        System.out.println(maxOnes);
    }
    static void task2(){
        /** дан массив nums =[3,2,2,3]  и число val=3 .
         *  если в массиве есть числа , равные заданому , нужно перенести эти элементы конец массива
         *  таким образом , первые несколько (или все) элементов массива должны быть отлычные от заданово или равны ему
         */

        int[] arr = {3,2,2,3};
        int val = 3;
        int[] tempArr = new int[arr.length];
        Arrays.fill(tempArr , val) ;
        int current = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != val) {
                tempArr[current ++] = arr[i];
            }
        }
System.out.println(Arrays.toString(tempArr));
    }
//static String task3(String str){
//
//
////        /**/* во фразе " добро пажаловать на курс JAVA " переставить слова в обратном порядке/*
//
//  String[] srtArr = str.split(regex: " ");
//  StringBuilder stringBuilder = new StringBuilder();
//    for (int i = 0; i < strArr.length; i++) {
//        stringBuilder.append(strArr[strArr.lenght - 1 - i]).append(" ");
//    }
//    return stringBuilder.toString();
// }
//public static double task4(int a , int b){
// double result = Math.Pow(a,b);
// return result;
    static double task3(double a,double b){
        double result = Math.pow(a,b);
        return result;
    }
static double task4(double a, double b){
        double result =1;
        if(a==1 || b== 0) return 1;
        for (int i = 0; i < Math.abs(b); i++) {
             result = result * a;
        
    }
        return  b > 0 ? result: 1/result ;
}
    }

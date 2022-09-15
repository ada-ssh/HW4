

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        main12();
    }

    public static void main1() {
        // Задание 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++){
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которое нужно найти: ");
        int y = scan.nextInt();
        int k = 0;
        for(int i = 0; i < randoms.length; i++){
            if (randoms[i] == y)
                k = 1;
            }
        if (k == 1) System.out.println("Данное число входит в массив");
        else
            System.out.println("Данное число не входит в массив");
    }

    public static void main2() {
        //Задание 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++){
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        int[] arr = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которое нужно удалить: ");
        int y = scan.nextInt();
        int k = 0;
        for (int i = 0; i < randoms.length ; i++) {
            if(randoms[i] == y){
                k = 1;
                arr = new int[randoms.length - 1];
                for(int index = 0; index < i; index++){
                    arr[index] = randoms[index];
                }
                for(int j = i; j < randoms.length - 1; j++){
                    arr[j] = randoms[j+1];
                }
                break;
            }
        }
        if (k == 0)
            System.out.println("Такого числа не существует");
        else
            System.out.println(Arrays.toString(arr));
    }

    public static void main3() {
        //Задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        int min = randoms[0];
        for (int i = 0; i < randoms.length; i++){
            if (randoms[i] < min) {
                min = randoms[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное число - " + min);
        int max = randoms[0];
        for (int i = 0; i < randoms.length; i++){
            if (randoms[i] > max) {
                max = randoms[i];
            }
        }
        System.out.println();
        System.out.println("Максимальное число - " + max);
        double sum = 0d;
        double srednee = 0d;
        for (int i = 0; i < randoms.length; i++){
            sum += randoms[i];
        }
        srednee = sum / x;
        System.out.println();
        System.out.println("Среднее - " + srednee);
    }

    public static void main4() {
        //Задание 3
        int[] ints = new int[]{4, 9, 6, 1, 45};
        int[] ints1 = new int[]{3, 56, 34, 14, 7};
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i] + "  ");
        }
        double sum = 0d;
        double srednee = 0d;
        for (int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        srednee = sum / 5;
        System.out.println();
        System.out.println("Среднее первого массива - " + srednee);
        double sum1 = 0d;
        double srednee1 = 0d;
        for (int i = 0; i < ints1.length; i++){
            sum1 += ints1[i];
        }
        srednee1 = sum1 / 5;
        System.out.println();
        System.out.println("Среднее второго массива - " + srednee1);
        if (srednee > srednee1)
            System.out.println("Среднее первого массива больше!");
        else if (srednee1 > srednee)
            System.out.println("Среднее второго массива больше!");
        else System.out.println("Средние значения двух массивов равны");
    }

    public static void main5() {
        //Задание 4
        int x = 0, c = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите кол-во элементов массива(от 5 до 10): ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            } else System.out.println("Ошибка. Вы ввели не число!");
        }
        while (x < 5 || x > 10);
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(100);
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        int count = 0;
        int[]mas = new int[x];
        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] % 2 == 0) {
                mas[count] = randoms[i];
                count++;
            }
        }
        mas = Arrays.copyOf(mas, count);
        System.out.println("Чётные: " + Arrays.toString(mas));
    }

    public static void main6() {
        //Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < randoms.length; i++) {
            if (i % 2 != 0) {
                randoms[i] = 0;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(randoms));
    }

    public static void main7() {
        //Задание 6
        String[] strings = new String[]{"Катя", "Маша", "Вика", "Петя", "Вася", "Толик"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void main8() {
        // Задание 7
        int[] ints = new int[]{1, 6, 10, 45, 11, 7, 99};
        boolean isSorted = false;
        int b;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    isSorted = false;
                    b = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = b;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void main9() {
        //Задание 8
        boolean r = false;
        int t = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < randoms.length - 2; i++) {
            if (randoms[i] == randoms[i + 1] && randoms[i] == randoms[i + 2]) {
                r = true;
                System.out.println(r);
                t++;
                break;
            }
        }
        if (t == 0) {
            System.out.println("Три одинаковых числа подряд нету");
        }
    }

    public static void main10() {
        //Задание 9
        boolean w = false;
        int t = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        int a = scann.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение b: ");
        int b = scan.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] % a == 0 && randoms[i] % b != 0){
                w = true;
                t++;
                System.out.println(w);
            }
        }
        if (t == 0){
            System.out.println("Такого числа в массиве не существует");
        }
    }

    public static void main11() {
        //Задание 10
        int w = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        int max = randoms[0];
        for (int i = 0; i < randoms.length - 2; i+=2){
            if (randoms[i] < randoms[i+2]){
                max = randoms[i+2];
            }
        }
        System.out.println(max);
        for (int i = 0; i < randoms.length - 2; i+=2){
            if (max == randoms[i]){
                w++;
            }
        }
        if (w >= 2){
            System.out.println("Максимальное не является единственным");
        }
        else System.out.println("Максимальное единственное");
    }

    public static void main12() {
        //Задание 11
        int w = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int x = scanner.nextInt();
        int[] randoms = new int[x];
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(100);
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "  ");
        }
        System.out.println();
        int max = randoms[0];
        for (int i = 0; i < randoms.length - 1; i++) {
            if (randoms[i] < randoms[i + 1]) {
                max = randoms[i + 1];
                w = i+1;
            }
        }
        System.out.println(max);
        System.out.println(w);
        int[] result = new int[w];
        int count = 0;
        for (int i = 0; i < w+1; i++) {
                result[count] = randoms[i];
                count++;
        }
        result = Arrays.copyOf(result, count);
        int[] result1 = new int[x-w+1];
        int coun = 0;
        for (int i = w+2; i < randoms.length; i++) {
            result[coun] = randoms[i];
            coun++;
        }
        result1 = Arrays.copyOf(result, coun);
        System.out.println(Arrays.toString(result) + w + Arrays.toString(result1) );
    }
}
//Остальные в процессе, пока не понимаю как делать, но хочу разобраться
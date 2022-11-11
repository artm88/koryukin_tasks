import java.util.Random;
import java.util.Scanner;

public class task_2 {
    public  static void main(String[] args){
        System.out.println("введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println();
        System.out.println("введите второе число: ");
        Scanner scanner1 = new Scanner(System.in);
        int m = scanner1.nextInt();
        printOfArray(makeOfArray(n,m),n,m);

    }
    public static int[][] makeOfArray (int x, int y){
        int[][] arrayTemp= new int[x][y];
        Random rnd = new Random();
        for (int i=0; i<x;i++){
            for (int j=0; j<y;j++){
                arrayTemp[i][j]= rnd.nextInt(100);
                if (arrayTemp[i][j]%2==0) {
                    arrayTemp[i][j]=arrayTemp[i][j]+1;
                }
            }
        }
        return arrayTemp;
    }
    public static void printOfArray(int[][] newArray, int x, int y) {
        for (int i = 0; i < x; i += 1) { // вывод массива случайных чисел
            for (int j = 0; j < y; j += 1){
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

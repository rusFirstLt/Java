import java.util.InputMismatchException;
import java.util.Scanner;

public class var9_ex4_2_2 {
    static  Scanner sc = new Scanner(System.in);
    public static void mtrx(){
        System.out.println("Количество строк");
        int str = sc.nextInt();
        System.out.println("Количество столбцов");
        int stol = sc.nextInt();
        int[][] mtrx = new int[str][stol];
        for(int i = 1; i <= str; i++){
            for (int j = 1; j <= stol; j++){
                System.out.println("mtrx["+i+"]["+j+"]");
                mtrx[i-1][j-1] = sc.nextInt();
            }
        }
        minStr(mtrx);
    }
    public static void minStr(int[][] mtrx){
        int min = 0;
        int minx = 0;
        for (int i = 0; i < mtrx.length; i++){
            for (int j = 0; j < mtrx[0].length; j++) {
                if((min > mtrx[i][j])&&(mtrx[i][j]) < 0){
                    min = mtrx[i][j];
                    minx = i;
                }
            }
        }
        if(min == 0){
            throw new RuntimeException();
        }else{
            System.out.println("Строка с минимальным отрицательным числом");
            for(int i = 0; i < mtrx[0].length; i++){
                System.out.print(mtrx[minx][i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        try{
            mtrx();
        }catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        }catch (RuntimeException e) {
            System.out.println("Hет отрицательных чисел");
        }
    }
}


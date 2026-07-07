import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double[][] maTran = new double[][]{
            {1, 2, 3},
            {3, 5, 2},
            {1, 0, 6}
        };      
        double sum = 0;
        for (int i = 0; i < maTran.length; i++){
            sum += maTran[i][i];
        }
        System.out.println("Tong duong cheo ma tran 1: "+sum);


        System.out.print("Nhap kich thuoc ma tran: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[][] array = new double[size][size];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = input.nextDouble();
            }
        }

        double total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i][i];
        }
        System.out.println("Tong duong cheo ma tran 2" + total);
        input.close();
        
        
    }
}

import java.util.Scanner;

public class ArrayHaiChieuTotalCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int total =0;
        int [][] array = new int[size][size];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                int N =scanner.nextInt();
                array[i][j]=N;
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(" ");
            for (int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+"\t");
            }
        }

        for (int i=0;i<array.length;i++){
                    total +=array[i][i];
                }
        System.out.println("tong duong cheo chinh la"+" "+total);
        }
    }


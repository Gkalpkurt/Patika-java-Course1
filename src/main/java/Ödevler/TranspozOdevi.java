package Ödevler;

import java.util.Scanner;

public class TranspozOdevi {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Matrisin satır sayısını giriniz: ");
            int satir = input.nextInt();

            System.out.print("Matrisin sütun sayısını giriniz: ");
            int sutun = input.nextInt();

            int[][] matris = new int[satir][sutun];
            int[][] transpoz = new int[sutun][satir];

            System.out.println("Matrisin elemanlarını giriniz:");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print((i + 1) + ". satır, " + (j + 1) + ". sütun: ");
                    matris[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    transpoz[j][i] = matris[i][j];
                }
            }
            System.out.println("\nMatris:");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print(matris[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nMatrisin Transpozu:");
            for (int i = 0; i < sutun; i++) {
                for (int j = 0; j < satir; j++) {
                    System.out.print(transpoz[i][j] + " ");
                }
                System.out.println();
            }

            input.close();
        }
    }


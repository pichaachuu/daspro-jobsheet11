import java.util.*;
public class KafeMarina {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int[][] penjualan = new int[5][7];
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        System.out.println("===== INPUT DATA PENJUALAN =====");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Data Penjualan Menu " + menu[i] + ":");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = input13.nextInt();
            }
        }
        input13.nextLine();

        System.out.println("\n========= DATA PENJUALAN =========");
        dataPenjualan("Penjualan Mingguan", penjualan);

        System.out.println("\n========== MENU PENJUALAN TERTINGGI =========");
        menuTerjualTerbanyak(penjualan);

        System.out.println("\n========= RATA RATA PENJUALAN =========");
        rata2Penjualan(penjualan);
        input13.close();
    }

    static void dataPenjualan (String judul, int[]... data){
        System.out.println(judul);
        System.out.printf("%-15s", "Menu/Hari");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("%-10s", "Hari-" + i);
        }
        System.out.println("\n" + "-".repeat(95));

        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s", menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%10d", data[i][j]);
            }
            System.out.println();
        }
    }

    static void menuTerjualTerbanyak(int[]... data){
        int[] totalPenjualan = new int[data.length]; 
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                totalPenjualan[i] += data[i][j];
            }
        }

        int menuTerbanyak = 0;

        for (int i = 0; i < totalPenjualan.length; i++) {
            if (totalPenjualan[i] > totalPenjualan[menuTerbanyak]) {
                menuTerbanyak = i;
            }
        }

        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        System.out.println(menu[menuTerbanyak] + " : " + totalPenjualan[menuTerbanyak]);
    }

    static void rata2Penjualan (int[][] data){
        int[] totalPenjualan = new int[data.length];
        String[] menu = {"Kopi","Teh","Es Degan","Roti Bakar", "Gorengan"};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                totalPenjualan[i] += data[i][j];
            }
            System.out.println("Rata rata penjualan " + menu[i] + ": " + (double) totalPenjualan[i]/7);
        }
    }
}

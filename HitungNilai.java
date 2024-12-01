import java.util.*;
public class HitungNilai {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMHS = input13.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jmlTugas = input13.nextInt();

        int[][] dataArray = isianArray(jmlMHS, jmlTugas);

        tampilArray(dataArray);

        hitTot(dataArray);

        input13.close();
    }
    
    public static int[][] isianArray(int jmlMHS, int jmlTugas){
        Scanner input13 = new Scanner(System.in);
        
        int[][] array = new int[jmlMHS][jmlTugas];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Masukkan nilai tugas ke-" + (j+1) + ":");
                array[i][j] = input13.nextInt();
            }
        }
        input13.close();
        return array;
    }

    public static int[][] tampilArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Berikut nilai mahasiswa ke-" + (i+1) + " : " + Arrays.toString(arr[i]));
        }
        return arr;
    }

    public static int[] hitTot (int[][] arr){
        int[] totArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totArray[i] += arr[i][j];
            }
            System.out.println("Total nilai mahasiswa ke-" + (i+1) + " : " + totArray[i]);
        }
        return totArray;
    }
}

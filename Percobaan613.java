import java.util.*;
public class Percobaan613 {
    // public static void main(String[] args) {
    //     Scanner input13 = new Scanner(System.in);

    //     int p,l,t,L,vol;

    //     System.out.println("Masukkan panjang");
    //     p = input13.nextInt();
    //     System.out.println("Masukkan lebar");
    //     l = input13.nextInt();
    //     System.out.println("Masukkan tinggi");
    //     t = input13.nextInt();

    //     L = p*l;
    //     System.out.println("Luas Persegi panjang adalah " + L);

    //     vol = p*l*t;
    //     System.out.println("Volume balok adalah " + vol);
    //     input13.close();
    // }

    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Masukkan panjang: ");
        p = input13.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input13.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input13.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume Balok adalah " + vol);
        input13.close();
    }
}

import java.util.*;
public class kubus13 {
    public static void main(String[] args) {
        int volKubus,luasPermukaan;
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan ukuran kubus: ");
        int s = input13.nextInt();

        volKubus = VolKubus(s);
        System.out.println("Volume kubus adalah " + volKubus);

        luasPermukaan = LPKubus(s);
        System.out.println("Luas Permukaan kubus adalah " + luasPermukaan);
    }

    static int VolKubus (int sisi){
        int v = sisi * sisi * sisi;
        return v;
    }

    static int LPKubus (int sisi){
        int lpKubus = 6 * sisi * sisi;
        return lpKubus;
    }
}

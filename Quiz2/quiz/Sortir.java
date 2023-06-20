package quiz;

import java.util.ArrayList;
import java.util.Comparator;

public class Sortir {
    public static void sortirMakanan(ArrayList<Makanan> daftarMakanan, String mode) {
        if (mode.equals("asc")) {
            daftarMakanan.sort(Comparator.comparing(Makanan::toString));
        } else if (mode.equals("desc")) {
            daftarMakanan.sort(Comparator.comparing(Makanan::toString).reversed());
        }

        for (Makanan makanan : daftarMakanan) {
            makanan.deskripsi();
            System.out.println();
        }
    }

    public static void sortirMinuman(ArrayList<Minuman> daftarMinuman, String mode) {
        if (mode.equals("asc")) {
            daftarMinuman.sort(Comparator.comparing(Minuman::toString));
        } else if (mode.equals("desc")) {
            daftarMinuman.sort(Comparator.comparing(Minuman::toString).reversed());
        }

        for (Minuman minuman : daftarMinuman) {
            minuman.deskripsi();
            System.out.println();
        }
    }
}

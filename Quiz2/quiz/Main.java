package quiz;

import quiz.menu_makanan.Mie;
import quiz.menu_makanan.Soto;
import quiz.menu_minuman.Panas;
import quiz.menu_minuman.Dingin;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Makanan> daftarMakanan = new ArrayList<>();
        ArrayList<Minuman> daftarMinuman = new ArrayList<>();

        daftarMakanan.add(new Mie("Mie Ayam"));
        daftarMakanan.add(new Soto("Soto Betawi"));

        daftarMinuman.add(new Panas("Kopi"));
        daftarMinuman.add(new Dingin("Es Teh"));

        System.out.println("Daftar Makanan (ASC):");
        Sortir.sortirMakanan(daftarMakanan, "asc");

        System.out.println("\nDaftar Makanan (DESC):");
        Sortir.sortirMakanan(daftarMakanan, "desc");

        System.out.println("\nDaftar Minuman (ASC):");
        Sortir.sortirMinuman(daftarMinuman, "asc");

        System.out.println("\nDaftar Minuman (DESC):");
        Sortir.sortirMinuman(daftarMinuman, "desc");
    }
}

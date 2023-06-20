package quiz.menu_makanan;

import quiz.Makanan;

public class Mie extends Makanan {
    public Mie(String nama) {
        super(nama);
    }

    @Override
    public void deskripsi() {
        System.out.println("Makanan: " + nama);
    }
}

package quiz.menu_makanan;

import quiz.Makanan;

public class Soto extends Makanan {
    public Soto(String nama) {
        super(nama);
    }

    @Override
    public void deskripsi() {
        System.out.println("Makanan: " + nama);
    }
}

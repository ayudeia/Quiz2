package quiz.menu_minuman;

import quiz.Minuman;

public class Dingin extends Minuman {
    public Dingin(String nama) {
        super(nama);
    }

    @Override
    public void deskripsi() {
        System.out.println("Minuman: " + nama);
    }
}

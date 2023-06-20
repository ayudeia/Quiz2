package quiz;

public abstract class Makanan {
    protected String nama;

    public Makanan(String nama) {
        this.nama = nama;
    }

    public abstract void deskripsi();
}

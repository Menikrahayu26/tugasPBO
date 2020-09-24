
package arsipku;


public class Arsipku implements Biodata, Nilai {

    
    public static void main(String[] args) {
       Arsipku ps = new Arsipku();
       ps.nama();
       ps.tempatLahir();
       ps.hobi();
       ps.agama();
       ps.BahasaIndonesia();
       ps.matematika();
        
    }

    @Override
    public void nama() {
        System.out.println("Nama                   : Menik Rahayu");
    }

    @Override
    public void tempatLahir() {
        System.out.println("Tempat Lahir           : Jember");
    }

    @Override
    public void hobi() {
        System.out.println("Hobiku                 : Menulis");
    }

    @Override
    public void agama() {
        System.out.println("Nilai Agama            : 60");
    }

    @Override
    public void BahasaIndonesia() {
        System.out.println("Nilai Bahasa Indonesia : 70");
    }

    @Override
    public void matematika() {
        System.out.println("Nilai Matematika       : 80");
    }
}

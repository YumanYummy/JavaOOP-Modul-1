class Pegawai{
    private String Nama;
    private String Jabatan;
    private int gaji;

    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }


    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}


public class contoh3 {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        Pegawai p2 = new Pegawai();
        Pegawai p3 = new Pegawai();

        p1.setNama("Zahra");
        p1.setJabatan("Web Developer");
        p1.setGaji(10000000);

        p2.setNama("Maura");
        p2.setJabatan("Data Analyst");
        p2.setGaji(12000000);

        p3.setNama("Aria");
        p3.setJabatan("Web Developer");
        p3.setGaji(10000000);


        System.out.println("=== Daftar Nama Pegawai ===\n");
        System.out.println("Nama    :"+ p1.getNama());
        System.out.println("Jabatan :"+ p1.getJabatan());
        System.out.println("Gaji    :"+ p1.getGaji());
        System.out.println("______________________________\n");
        System.out.println("Nama    :"+ p2.getNama());
        System.out.println("Jabatan :"+ p2.getJabatan());
        System.out.println("Gaji    :"+ p2.getGaji());
        System.out.println("______________________________\n");
        System.out.println("Nama    :"+ p3.getNama());
        System.out.println("Jabatan :"+ p3.getJabatan());
        System.out.println("Gaji    :"+ p3.getGaji());
    }
}

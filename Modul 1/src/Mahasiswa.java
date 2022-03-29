import java.util.Scanner;

public class Mahasiswa{
	static class Method{
	Scanner in = new Scanner(System.in);

    private static String Mahasiswanama;
    private static String Mahasiswanim;
    private static String Password;
    
    public void setMahasiswanama(String Mahasiswanama){
        Mahasiswa.Method.Mahasiswanama = Mahasiswanama;
    }
    public String getMahasiswanama(){
        return Mahasiswanama;
    }
    
    public void setMahasiswanim(String Mahasiswanim){
        if(Mahasiswanim.length() != 15){
            System.out.println("Nim Harus 15 Angka");
            System.out.print("Nim : ");
            Mahasiswanim = in.next();
            setMahasiswanim(Mahasiswanim);
        }else{
            Mahasiswa.Method.Mahasiswanim = Mahasiswanim;
        }
    }
    public String getMahasiswanim(){
        return Mahasiswanim;
    }

    public String getPassword(){
        return Password;
    }

    public void setPassword(String Password){
        if(Password.length() <= 8){
            System.out.println("Password Minimal 8 Karakter");
            System.out.print("Password : ");
            Password = in.next(); 
            setPassword(Password);
        }else{
            Mahasiswa.Method.Password = Password;
        }
    }
    

    public void daftar(){
        System.out.println("=== Daftar / Register ===");
        System.out.print("Nama : ");
        Mahasiswanama = in.nextLine();
        setMahasiswanama(Mahasiswanama);

        System.out.print("Nim : ");
        Mahasiswanim = in.next();
        setMahasiswanim(Mahasiswanim);

        System.out.print("Password : ");
        Password = in.next();
        setPassword(Password);
        System.out.print("\n");
        
    }

    public void info(){
        System.out.println("==============================================================\n");
        System.out.println("Selamat " + getMahasiswanama() + " Anda Berhasil Mendaftar \n" );
        System.out.println("Berikut Username Dan Password Anda :");
        System.out.println("\nUsername : " + getMahasiswanim());
        System.out.println("Password : " + getPassword());
        System.out.println("\n==============================================================\n");
    }
	
	public static void main(String[] args) {
		Mahasiswa.Method mhs = new Mahasiswa.Method();
		mhs.daftar();
		mhs.info();
		}
	
	}

}
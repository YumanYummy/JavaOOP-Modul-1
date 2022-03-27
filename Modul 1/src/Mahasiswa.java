import java.util.Scanner;

public class Mahasiswa {
	private String nama;
	private String nim;
	private String password;
	
	Scanner keyboard = new Scanner(System.in);
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNama() {return nama;}
	
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNim() {return nim;}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {return password;}
	
	void daftar() {
		System.out.println("===DAFTAR===");
		System.out.print("Nama		: ");
		nama = keyboard.nextLine();
		
		System.out.print("NIM		: ");
		nim = keyboard.nextLine();
		
		System.out.print("Password	: ");
		password = keyboard.nextLine();
		
		setNama(nama);
		setNim(nim);
		setPassword(password);
		
		System.out.println("");
		System.out.println("Selamat " + nama + " anda berhasil mendaftar");
		System.out.println("");
		System.out.println("Berikut Username dan Password anda : ");
		System.out.println("Username : " + nim);
		System.out.print("Password : " + password);
	}
	
	public static void main(String[] args) {
		Mahasiswa mahasiswa1 = new Mahasiswa();
		mahasiswa1.daftar();	
	}
}

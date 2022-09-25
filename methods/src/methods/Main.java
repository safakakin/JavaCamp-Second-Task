package methods;

public class Main {

	public static void main(String[] args) {
      sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 3;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				mesajVer("Sayı mevcuttur: "+aranacak);
				return;
			}
		}
		mesajVer("Sayı listede mevcut değildir: "+aranacak);
		
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}

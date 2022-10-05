
public class Main {
	
	public static void main(String[] args) {
		
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		
		for(int sayi: sayilar) {
			if(sayi==aranacak) {
				varMi = true;
			}
		}
		
		if(varMi) {
			mesajVer(aranacak);
		}
		else {
			System.out.println(aranacak + " sayısı dizide yok.");
		}
		
	}
	
	public static void mesajVer(int aranacak) {
		System.out.println("Sayi mevcuttur: " + aranacak);
	}

}

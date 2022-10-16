import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int jumlahAngka;
		int bedaAngka;
		boolean isOk1 = false;
		boolean isOk2 = false;
		String ulang;
		boolean pengulangan = true;
		
		System.out.println("");
		System.out.println("Belajar Deret Aritmatika, Geometri, dan Menghitung Faktorial");
		System.out.println("");
      
        	Scanner scanner = new Scanner(System.in);
          
        	while(pengulangan) {
			do {
				System.out.print("Masukkan jumlah angka yang akan dicetak [2..10] : ");
                		jumlahAngka = scanner.nextInt();
                		if (checkJumlahAngka(jumlahAngka)) {
					isOk1 = true;            
                		} else {
					System.out.println("Jumlah angka minimal 2 maksimal 10");
                		}
            		} while (!isOk1);
			
			do {
				System.out.print("Masukkan beda masing-masing angka [2..9] : ");
                		bedaAngka = scanner.nextInt();
                		if (checkBedaAngka(bedaAngka)) {
					isOk2 = true;
                		} else {
					System.out.println("Beda angka minimal 2 maksimal 9");
                		}
            		} while (!isOk2);
			
			System.out.println("");
			deretAritmatika(jumlahAngka,bedaAngka);
			deretGeometri(jumlahAngka,bedaAngka);
			deretFaktorial(jumlahAngka,bedaAngka);
							
           		System.out.print("Apakah Anda ingin mengulang ?[Y/T]");
			   
            		ulang = scanner.next();
            		if (ulang.equalsIgnoreCase("t")) {
				pengulangan = false;
            		}
		}

        	System.out.println("Program selesai");
	}
	
	public static boolean checkJumlahAngka(int jumlahAngka) {
		if(jumlahAngka >= 2 && jumlahAngka <= 10){
			return true;
		}
		return false;
	}

	public static boolean checkBedaAngka(int bedaAngka) {
		if(bedaAngka >= 2 && bedaAngka <= 9){
			return true;
		}
		return false;
	}
	
	public static void deretAritmatika(int jumlahAngka,int bedaAngka) {
        System.out.println("Deret Aritmatika : ");
            
		int prev = 1;
		int next = 1;

		for (int i = 1; i <= jumlahAngka; i++) {
			System.out.print(next + " ");			
            next = prev + bedaAngka;
			prev = next;
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void deretGeometri(int jumlahAngka,int bedaAngka) {
		System.out.println("Deret Geometri : ");
            
		int prev = 1;
		int next = 1;
			
		for (int i = 1; i <= jumlahAngka; i++) {
			System.out.print(next + " ");
            next = prev * bedaAngka;
			prev = next;
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void deretFaktorial(int jumlahAngka,int bedaAngka) {
		System.out.println("Faktorial Dari " + jumlahAngka + " : " );
			
		int prev = 1;
		int nilaiFaktorial = 1;

		for (int i = jumlahAngka; i >= 1; i--) {
			System.out.print(i);
			if (i > 1) System.out.print(" * ");
            nilaiFaktorial = nilaiFaktorial * prev;
			prev = i;
		}
        System.out.println(" = " + nilaiFaktorial );  
		System.out.println("");
	}
}


package main;


import main.Olympialaiset;
import java.util.Scanner;

public class OlympiatietojenEtsija {
	
	public static void main(String[] args) {
		Olympialaiset[] kisataulukko = new Olympialaiset[40];
		Scanner input = new Scanner(System.in);
		int year;
		int a = 0;
		String city;
		String country;
		
		
		do {
			System.out.println("Anna vuosiluku: ");
			year = input.nextInt();
			if (year == 0) {
				break;
			}
			System.out.println("Anna kisakaupunki: ");
			city = input.next();
			System.out.println("Anna maa: ");
			country = input.next();
			kisataulukko[a] = new Olympialaiset(year, city, country);
			if(year != 0) a++;
		} while(year != 0);
		
		
		
		/*kisataulukko[0] = new Olympialaiset(1896, "Ateena", "Kreikka");
		kisataulukko[1] = new Olympialaiset(1900, "Pariisi", "Ranska");
		kisataulukko[2] = new Olympialaiset(1904, "St. Louis", "U.S.A");
		kisataulukko[3] = new Olympialaiset(1908, "Ateena", "Kreikka");*/
		
		
		
		
		
		
		System.out.println("Anna vuosi, jolta haluat tiet�� lis�tietoa: ");
		
		/*System.out.println("1. Hae vuoden perusteella");
		System.out.println("2. N�yt� kaikki");*/
		
		int user_input = input.nextInt();
		
		/*switch(user_input) {
		case 1:
			searchOne(user_input, kisataulukko);
		case 2:
			showAll(kisataulukko);
	}*/
		
		int i = 0;
		boolean done = false;
		while(done == false) {
			if(kisataulukko[i].lue_vuosi() == user_input) {
				kisataulukko[i].tulosta_olympialaisten_tiedot();
				done = true;
			} else {
				i++;
			}
		}
		
		
		

	}
	
	

}
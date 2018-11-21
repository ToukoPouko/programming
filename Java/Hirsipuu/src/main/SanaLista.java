package main;

import fi.jyu.mit.ohj2.Tiedosto;
import java.util.Scanner;
import java.util.*;


public class SanaLista {
	
	public static void lisaa() {
		boolean kopio = true;
		Scanner input = new Scanner(System.in);
		ArrayList<String> uudet_sanat = new ArrayList<>();
		String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
		
		while(true) {
			System.out.println("Kirjoita sana: (kirjoita !lopeta lopettaaksesi lis��misen)");
			String sana = input.next();
			if(sana.equals("!lopeta")) {
				Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt", uudet_sanat, true);
				System.out.println("Kirjoittaminen onnistui");
				break;
			}
			for(String s : sanat) {
				if(!sana.equals(s)) {
					kopio = false;
				}
				
				
			}
			
			if(!kopio) {
				uudet_sanat.add(sana);
				System.out.println("Lis��minen onnistui.");
			}
			
		}
	}
	
	public static void lue() {
		
	}
	
	public static void poista() {
		
	}
	
	
	public static void main(String[] args) {

		boolean kopio = true;
		Scanner input = new Scanner(System.in);
		ArrayList<String> uudet_sanat = new ArrayList<>();
		
		
		while(true) {
			String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
			System.out.println("1. Lis�� sanoja");
			System.out.println("2. N�yt� sanat");
			System.out.println("3. Poista sana");
			int user = input.nextInt();
				
			switch(user) {
				case 1:
					lisaa();
					break;
				case 2:
					System.out.println("--------------------------------------------");
					for(String sana : sanat) {
						System.out.println(sana);
					}
					System.out.println("--------------------------------------------");
				case 3:
					poista();
					break;
			}
			
		}
		
		
	}

}

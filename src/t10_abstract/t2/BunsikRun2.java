package t10_abstract.t2;

import java.util.Scanner;

public class BunsikRun2 {
	public static void main(String[] args) {
		/*
		Bonsa wanjaBunsik = new WangjaBunsik();
		wanjaBunsik.getShopName();
		wanjaBunsik.kimchi();
		wanjaBunsik.budae();
		wanjaBunsik.bibim();
		wanjaBunsik.sundae();
		wanjaBunsik.konggi();
		System.out.println();
	
		Bonsa seoulBunsik = new SeoulBunsik();
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println();

		Bonsa woojuBunsik = new WoojuBunsik();
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibim();
		woojuBunsik.sundae();
		woojuBunsik.konggi();
		System.out.println();
		*/
		
		Bonsa[] bonsa = {new WangjaBunsik(), new SeoulBunsik() , new WoojuBunsik()};
		
		for(int i=0; i < bonsa.length; i++) {
			bonsa[i].getShopName();
			bonsa[i].kimchi();
			bonsa[i].budae();
			bonsa[i].bibim();
			bonsa[i].sundae();
			bonsa[i].konggi();
			System.out.println();
		}
	}
}

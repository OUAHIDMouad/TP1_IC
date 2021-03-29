package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoImpl d = new DaoImpl();
		MetierImpl metier = new MetierImpl();
		metier.setDao(d);
		System.out.println(metier.calcul());
	}

}



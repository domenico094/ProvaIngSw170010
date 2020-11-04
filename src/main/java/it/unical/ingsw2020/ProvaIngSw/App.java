package it.unical.ingsw2020.ProvaIngSw;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

import org.joda.time.*;

public class App 
{
    public static void main( String[] args )
    {
    	DateTime dt = new DateTime();
    	System.out.println(dt.toString("dd-MM-yyyy "+ " hh-mm "));
    	
    	MyListUtil m = new MyListUtil();
    	m.generaLista(5);
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Digita 1 per ordine decresente e 2 per crescente");
    	int scelta = in.nextInt();
    	m.ordina(scelta);
    	m.stampa();
    	
    	in.close();
    	
    	
    	System.out.println(dt.toString("dd-MM-yyyy "+ " hh-mm "));
    }
}

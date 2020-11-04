package it.unical.ingsw2020.ProvaIngSw;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyListUtil {

	private List<Integer> elenco;
	
	public MyListUtil(){
		elenco = new LinkedList<Integer>();
	}
	
	public List<Integer> generaLista(int n)
	{
		
		if(n >= 2) {
			Random r = new Random();
		
			for(int i = 0; i < n; i++ ) {
				int c = r.nextInt(100);
				elenco.add(c);
			}
		}
		
		return elenco;
	}
	
	public boolean ordina(int scelta) {
		if(scelta == 1)
		{
			for(int i = 0; i < elenco.size(); i++)	{
				for(int j = 0; j <elenco.size() -1; j++)
				{
					if( elenco.get(j) < elenco.get(i) && i!=j)	{
						Integer it = elenco.get(i);
						elenco.set(i, elenco.get(j));
						elenco.set(j, it);
					}
				}
			}
			return true;
		}
		else if(scelta == 2)	{
			for(int i = 0; i < elenco.size(); i++)	{
				for(int j = 0; j <elenco.size() -1; j++)
				{
					if( elenco.get(j) > elenco.get(i) && i!=j)	{
						Integer it = elenco.get(i);
						elenco.set(i, elenco.get(j));
						elenco.set(j, it);
					}
				}
			}
			return true;
		}
		
		return false;
		
	}
	
	public void stampa()	{
		System.out.println();
		for(int i =0 ; i < elenco.size(); i++	)	{
			System.out.print(elenco.get(i) + " ");
		}
		System.out.println();
	}
	
	
}

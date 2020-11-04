package it.unical.ingsw2020.ProvaIngSw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil m;
	
	@BeforeClass
	public static void prepare()
	{
		m = new MyListUtil();
	}
	
	@Test
	public void generaListaWorks()	{
		assertEquals(new LinkedList<Integer>(),m.generaLista(1));
		assertNotEquals(Arrays.asList(1,2,3,8,4), m.generaLista(5));
	}
	
	@Test
	public void ordina()	{
		assertTrue(m.ordina(1));
		assertFalse(m.ordina(5));
		assertFalse(m.ordina(3));
		assertTrue(m.ordina(2));
	}
	
}

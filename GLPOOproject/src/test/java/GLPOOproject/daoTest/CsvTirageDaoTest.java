package GLPOOproject.daoTest;

import org.junit.Assert;
import org.junit.Test;

import dao.CsvTirageDao;

public class CsvTirageDaoTest {
	private CsvTirageDao dao;
	private final String Filename;
	
	
	public CsvTirageDaoTest() {
		
		Filename = "src/main/ressources/euromillions_4.csv";
		dao = new CsvTirageDao(Filename);
	}
	@Test
	public void testfindAllTirages_line_145() {
		final int expectedSize =145;
		
		final int actualSize = dao.findAllTirages().size();
		
		Assert.assertEquals(expectedSize,actualSize);
	}
	@Test
	public void testfindAllTirages_Tirages_0() {
		final int numberTirage = 0;
		//final Tirage expectedTirage = new SimpleTirage() ;
		final int bouleAttendue=145;
		
		final int actualTirage = dao.findAllTirages().size();
		
		Assert.assertEquals(bouleAttendue , actualTirage);
		
		
		
	}
}
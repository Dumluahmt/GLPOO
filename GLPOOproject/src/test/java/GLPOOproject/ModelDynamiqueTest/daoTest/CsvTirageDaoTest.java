package daoTest;

import org.junit.Assert;
import org.junit.Test;

import dao.CsvTirageDao;
import dao.SimpleTirage;
import dao.Tirage;

public class CsvTirageDaoTest {
	private CsvTirageDao dao;
	private final String Filename;
	
	
	public CsvTirageDaoTest() {
		
		Filename = "src/main/ressources/euromillions_4.csv";
		dao = new CsvTirageDao(Filename);
	}
	@Test
	public void testfindAllTirages_line_145() {
		final int expectedSize =146;
		
		final int actualSize = dao.findAllTirages().size();
		
		Assert.assertEquals(expectedSize,actualSize);
	}
	@Test
	public void testfindAllTirages_Tirages_0() {
		final int numberTirage = 0;
		
		final Tirage expectedTirage = new SimpleTirage(6,9,13,39,41,2,12);
		
		final Tirage actualTirage = dao.findAllTirages().get(numberTirage);
		
		Assert.assertEquals(expectedTirage.toString(), actualTirage.toString());
			
	}
}
package ModelDynamiqueTest;

import org.junit.Assert;
import org.junit.Test;

import dao.CsvTirageDao;
import dao.SimpleTirage;
import dao.Tirage;
import model.ModeleDynamique;

public class ModeleDynamiqueTest {
	private CsvTirageDao dao;
	

	@Test
	public void testrowToTirage() {
		// Arrange
		final ModeleDynamique ObjectModel = new ModeleDynamique();
		Tirage tirage = new SimpleTirage();
		// Act
		tirage = ObjectModel.rowToTirage(0);
		Tirage tirageAttendu = new SimpleTirage();
		int bouleAttendue1=6;
		
 		// Assert
		Assert.assertEquals(bouleAttendue1, tirage.getB1());
	}

}

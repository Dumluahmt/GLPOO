package ModelDynamiqueTest;

import org.junit.Assert;
import org.junit.Test;

import dao.SimpleTirage;
import dao.Tirage;
import model.ModeleDynamique;

public class ModeleDynamiqueTest {
	private final ModeleDynamique model = new ModeleDynamique();

	@Test
	public void testRowToTirage_row_1() {
		// Arrange -6-9-13-39-41--2-12
		final Tirage expectedTirage = new SimpleTirage(6, 9, 13, 39, 41, 2, 12);
		// Act
		final Tirage actualTirage = model.rowToTirage(0);

		// Assert
		Assert.assertEquals(expectedTirage.toString(), actualTirage.toString());
	}

	@Test
	public void testGetColumnName_B1() {
		final int columnNumberB1 = 1;
		final String expectedColumnName = "B1";

		final String actualColumnName = model.getColumnName(columnNumberB1);

		Assert.assertEquals(expectedColumnName, actualColumnName);
	}

	@Test
	public void testGetValueAt_row_0_column_1() {
		final int rowIndex = 0;
		final int columnIndex = 1;
		final int expectedValue = 6;

		final int actualValue = (int) model.getValueAt(rowIndex, columnIndex);

		Assert.assertEquals(expectedValue, actualValue);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetValueAt_column_8() {
		final int rowIndex = 0;
		final int columnIndex = 8;
		final Object objectAtColumn8 = model.getValueAt(rowIndex, columnIndex);

	}

	@Test
	public void testTotalRows_146() {
		final int expectedCountRows = 146;

		final int actualCountRows = model.getRowCount();

		Assert.assertEquals(expectedCountRows, actualCountRows);
	}

	@Test
	public void testTotalHeaders_8() { // index + 5 boules + 2 etoiles
		final int expectedCountHeaders = 8;

		final int actualCountHeaders = model.getColumnCount();

		Assert.assertEquals(expectedCountHeaders, actualCountHeaders);
	}
}

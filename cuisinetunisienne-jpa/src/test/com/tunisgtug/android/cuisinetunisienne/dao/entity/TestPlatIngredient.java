package test.com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.sql.SQLException;

import org.junit.Test;

import test.com.tunisgtug.android.cuisinetunisienne.dao.TestHelper;

import com.tunisgtug.android.cuisinetunisienne.dao.entity.Ingredient;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;


/**
 * JUnit Test case class for : Plat - Ingredient
 *
 */
public class TestPlatIngredient extends TestHelper {

	// here is a list of XML files to be loaded by Spring
	private String[] configNames = new String[] { "classpath:/com/tunisgtug/android/cuisinetunisienne/spring/db.xml" };
	
	TestPlatIngredient() throws SQLException {
		super(new Class<?>[]{Plat.class, Ingredient.class});
	}

	@Test
	public void testPlatIngredient() throws SQLException {
		Plat l_plat = getNewPlat();
		addIngredient(l_plat);
		getPlatDao().create(l_plat);
	}

	private Plat getNewPlat() {
		Plat l_plat = new Plat();
		l_plat.setCalories(100);
		l_plat.setDescription("3ejja bel mergaz");
		l_plat.setPlatname("3ejja bel mergaz");
		l_plat.setPlatrating(10);
		l_plat.setPreparationtime(30);
		l_plat.setPrice(4500);
		
		return l_plat;
	}

	private void addIngredient(Plat p_plat) {
		Ingredient l_ingredient = new Ingredient();
		l_ingredient.setIngname("3dham");
		p_plat.getListIngredient().add(l_ingredient);
	}

}

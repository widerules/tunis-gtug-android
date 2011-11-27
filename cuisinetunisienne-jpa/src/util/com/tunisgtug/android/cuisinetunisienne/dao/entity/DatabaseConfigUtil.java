package util.com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.io.File;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Ingredient;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;

public class DatabaseConfigUtil extends OrmLiteConfigUtil {
	private static final Class<?>[] classes = new Class[] {
		Ingredient.class,
		Plat.class
		};
	
	public static void main(String[] args) throws Exception {
		File l_configFile = new File("android/res/raw/ormlite_config.txt");
		writeConfigFile(l_configFile, classes);
	}
}

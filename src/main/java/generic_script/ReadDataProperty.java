package generic_script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperty {

	public String readData(String key) throws IOException 
	{
FileInputStream	fis=new FileInputStream("../vtigerconcept/CommonData.propeties");
Properties propfile=new Properties();
propfile.load(fis);
String value = propfile.getProperty(key);

return value;


	}

}

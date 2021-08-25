package generic_script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperty {

	public String readData(String key) throws IOException 
	{
FileInputStream	fis=new FileInputStream("/CommonData.propeties");
Properties p=new Properties();
p.load(fis);
String value = p.getProperty(key);

return value;


	}

}

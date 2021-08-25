package generic_script;

public interface AutoConstant
{
	public static String DirPath=System.getProperty("user.dir");
	
	
	String p=DirPath+"/vtigerconcept/CommonData.propeties";
	String JSONfilepath="";
	String XMLfilepath="";
	String Excelpath="";
	

	int implictwait=10;
	int explicitwait=10;
	}

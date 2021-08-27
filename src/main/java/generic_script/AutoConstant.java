package generic_script;

public interface AutoConstant
{
	public static String DirPath=System.getProperty("user.dir");
	
	
	String propfilepath=DirPath+"/CommonData.propeties";
	String JSONfilepath="";
	String XMLfilepath="";
	String Excelpath="";
	String ExtentReportPath=DirPath+"/ExtentReport_19";
	

	int implictwait=10;
	int explicitwait=10;
	}

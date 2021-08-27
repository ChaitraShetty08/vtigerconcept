package generic_script;

public interface AutoConstant
{
	public static String DirPath=System.getProperty("user.dir");
	
	
	String propfilepath=DirPath+"/CommonData.propeties";
	String JSONfilepath="";
	String XMLfilepath="";
	String Excelpath="";
	String ExtentReportPath="ExtentReport_19\\reports22";
	

	int implictwait=10;
	int explicitwait=10;
	}

package driverscript;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DriverScript {

	//  reading excel data

	public static HashMap<String, String> add;
	public void loadData(String testcaseno) throws Throwable, Throwable {
	String	path=System.getProperty("user.dir");
		Workbook w=Workbook.getWorkbook(new File(path+"/src/test/resources/exceldata/login1.xls"));
		Sheet s=w.getSheet(0);
		int row=s.getRows();
		int col=s.getColumns();
		int testno=0;
		
		loop:for(int i=0;i<row;i++) {
			if(s.getCell(0,i).getContents().equals(testcaseno)) {
				testno=i;
				break loop;
			}
		}
		add=new HashMap<String, String>();
		for(int j=0;j<col;j++) {
			add.put(s.getCell(j,0).getContents(), s.getCell(j,testno).getContents());
		}
		System.out.println(add);

	}

}

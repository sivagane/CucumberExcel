package org.cucmber.Excl;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.WebElement;

public class Utiltity {
	
	public List<HashMap<String, String>> read() throws IOException {
		List<HashMap<String,String>>li=new LinkedList<HashMap<String,String>>();
		File f=new File("C:\\Users\\jegan\\eclipse-workspace\\CucumberExcel\\Excel\\siva1.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
	    Workbook w=new XSSFWorkbook(stream);
	    
	    Sheet s = w.getSheet("siva1");
	    Row headrow = s.getRow(0);
	    
	    for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
	    	Row r = s.getRow(i);
	    	
	    	HashMap<String , String>mp=new HashMap<String, String>();
	    	for(int j=0;j<headrow.getPhysicalNumberOfCells();j++) {
	    		Cell c = r.getCell(j);
	    		int type = c.getCellType();
	    		if(type==1) {
	    			String name = c.getStringCellValue();
	    			mp.put(headrow.getCell(j).getStringCellValue(),name);
	    		}
	    		else {
	    			double d = c.getNumericCellValue();
	    			long l=(long)d;
	    			String name = String.valueOf(l);
	    			mp.put(headrow.getCell(j).getStringCellValue(), name);
	    		}
	    	}
	    	li.add(mp);
	    }
		return li;	
		
	}
public void launch(String s) {
	Hooks.d.get(s);
}
public void type(WebElement w,String s) {
w.sendKeys(s);	
}
public void klik(WebElement w) {
	w.click();
} 
}

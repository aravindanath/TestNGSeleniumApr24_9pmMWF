package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class ReadExl {

    @Test
    public void test() throws InterruptedException, IOException {


        String path =  System.getProperty("user.dir")+ File.separator+"data.xlsx";

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook    wb = new XSSFWorkbook(fis);

      Sheet sh = wb.getSheetAt(0);

     String value =  sh.getRow(1).getCell(0).getStringCellValue();
     System.out.println(value);


    }
}

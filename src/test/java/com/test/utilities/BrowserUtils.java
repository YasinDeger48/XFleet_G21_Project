package com.test.utilities;

import com.github.dockerjava.api.model.ContainerNetwork;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.sql.Driver;
import java.sql.*;
import java.util.*;

public class BrowserUtils {


    /**
     * Static sleep method accept second and wait during time
     *
     * @param seconds
     */

    public static void sleep(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("static sleep issue");
        }
    }


    /**
     * These methods using for get usernames
     * we get our data from excel sheet via apache POI
     *
     * @return
     */


    public static List<String> truckDriversUserName() {

        String path = "credentials.xlsx";

        List<String> truckDrivers = new ArrayList<>();


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowNumber; i++) {

                truckDrivers.add(sheet.getRow(i).getCell(0).toString());
            }


            file.close();
            workbook.close();


        } catch (Exception e) {

            e.printStackTrace();
        }


        return truckDrivers;
    }

    public static List<String> storeManagersUserName() {

        String path = "credentials.xlsx";


        List<String> storeManagers = new ArrayList<>();


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowNumber; i++) {

                storeManagers.add(sheet.getRow(i).getCell(1).toString());
            }

            file.close();
            workbook.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return storeManagers;
    }

    public static List<String> salesManagersUserName() {

        String path = "credentials.xlsx";


        List<String> salesManagers = new ArrayList<>();


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();


            for (int i = 1; i < rowNumber; i++) {

                salesManagers.add(sheet.getRow(i).getCell(2).toString());
            }
            file.close();
            workbook.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return salesManagers;
    }

    public static String password() {
        String path = "credentials.xlsx";
        String password = "";


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            password = sheet.getRow(1).getCell(3).toString();

            file.close();
            workbook.close();

        } catch (Exception e) {

        }
        return password;

    }

    public static boolean attributeCheck(WebElement element, String attribute){
        boolean result = false;

        try{
            String att = element.getAttribute(attribute);
            if(att != null){
                result=true;
            }


        }catch (Exception e){

        }
        return result;
    }

    public static void windowHandle(WebDriver driver, String siteURL) {

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println(each);

            if (driver.getTitle().equals(siteURL)) {
                break;
            }
        }
    }

    public static WebElement getElement(WebDriver driver, String value){

        return driver.findElement(By.xpath("//*[contains(.,'"+value+"')]"));
    }

    public static Map<String,ContainerNetwork> networkCOMM(){

        Map<String,ContainerNetwork> app = new HashMap<>();

        return app;
    }

}

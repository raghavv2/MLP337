package com.hexaware.MLP337.util;
import java.util.Scanner;
import java.util.*;
import com.hexaware.MLP337.model.Vendor;
import com.hexaware.MLP337.factory.VendorFactory;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. show details");
    System.out.println("2. insert vendor details");
    System.out.println("3. update vendor details");
    System.out.println("4. delete vendor details");
    System.out.println("0. Exit");
    
    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
        showdetails();
          break;
        case 2:
          Vendor();
          break;
        case 3:
          updateVendor();
          break;
        case 4:
          deleteVendor();
          break;
        case 0:
          Runtime.getRuntime().halt(0);
          break;
        default:
          System.out.println("Choose either 1 or 2 or 3 or 4 ");
          break;
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    
    mainMenu();
  }
/**
 * showFullMenu method  display the menu item stored in database.
 */
private void showdetails() {
  Vendor[] vendors=VendorFactory.showdetails();
  System.out.println("vendors details:");
  for (Vendor vendor : vendors) {
    System.out.println(vendor);
  }
}
  private void Vendor() {
    System.out.println("Enter vendor id: ");
    int vendorid = option.nextInt();
    System.out.println("Enter orderid: ");
    int orderid= option.nextInt();
    System.out.println("Enter vendor status: ");
    String vendorstatus = option.next();
    VendorFactory.Vendor(vendorid,orderid,vendorstatus);
  }
  private void updateVendor() {
    System.out.println("Enter vendor id: ");
    int vendorid = option.nextInt();

    System.out.println("Enter orderid: ");
    int orderid= option.nextInt();

    System.out.println("Enter vendor status: ");
    String vendorstatus = option.next();
    VendorFactory.updateVendor(vendorid,orderid,vendorstatus);
  }
  private void deleteVendor() {
    System.out.println("Enter vendor id: ");
    int vendorid = option.nextInt();
    VendorFactory.deleteVendor(vendorid);
  }
  
/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
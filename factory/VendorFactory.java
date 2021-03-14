package com.hexaware.MLP337.factory;

import com.hexaware.MLP337.persistence.VendorDAO;
import com.hexaware.MLP337.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP337.model.Vendor;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class VendorFactory {
  /**
   *  Protected constructor.
   */
  protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static VendorDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }
  public static Vendor[] showdetails() {
    List<Vendor> vendors = dao().show();
    return vendors.toArray(new Vendor[vendors.size()]);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static void Vendor(int vendorid,int orderid,String vendorstatus){
    dao().insert(vendorid,orderid,vendorstatus);
    System.out.println("Vendor inserted successfully");
  }
  public static void updateVendor(int vendorid,int orderid,String vendorstatus){
    dao().update(vendorid,orderid,vendorstatus);
    System.out.println("Vendor updated successfully");
  }
  public static void deleteVendor(int vendorid){
    dao().delete(vendorid);
    System.out.println("Vendor deleted successfully");
  }
}

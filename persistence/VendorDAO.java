package com.hexaware.MLP337.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.Bind;
import com.hexaware.MLP337.model.Vendor;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from vendor")
    @Mapper(VendorMapper.class)
    List<Vendor> show();
    
  @SqlUpdate("INSERT INTO Vendor (vendorid,orderid,vendorstatus) values (:vendorid,:orderid,:vendorstatus)")
  void insert(@Bind("vendorid")int vendorid,@Bind("orderid")int orderid,@Bind("vendorstatus")String vendorstatus);
  
  @SqlUpdate("UPDATE vendor SET vendorid = :vendorid, orderid = :orderid,vendorstatus = :vendorstatus WHERE vendorid = :vendorid")
  void update(@Bind("vendorid")int vendorid,@Bind("orderid")int orderid,@Bind("vendorstatus")String vendorstatus);

  @SqlUpdate("DELETE FROM vendor WHERE vendorid = :vendorid")
  void delete(@Bind("vendorid")int vendorid);





  
}

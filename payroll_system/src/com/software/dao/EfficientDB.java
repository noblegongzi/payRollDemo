package com.software.dao;

/*
 * tbl_efficient()
 */
import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.software.db.JdbcUtils;
import com.software.pojo.Efficient;
public class EfficientDB {
	
	public static Efficient getAll() throws SQLException
	{ 
		String sql = "select * from tbl_efficient" ;
		
    	Connection conn=JdbcUtils.getConnection();
    	Statement stat=conn.createStatement();
       
        ResultSet rs = stat.executeQuery(sql);
        
        Efficient a=new Efficient();
        while(rs.next())
        {
        	 a.setTaxRate(rs.getDouble(1));
             a.setPensionRateByE(rs.getDouble(2));
             a.setPensionRateByC(rs.getDouble(3));
             a.setMedicRateByE(rs.getDouble(4));
             a.setMedicRateByC(rs.getDouble(5));
             a.setUnempRateByE(rs.getDouble(6));
             a.setUnempRateByC(rs.getDouble(7));
             a.setInjuryRateByC(rs.getDouble(8));
             a.setFertiRateByC(rs.getDouble(9));
             a.setProFundRateByE(rs.getDouble(10));
             a.setProFundRateByC(rs.getDouble(11));
             
             a.setMoneyofSick(rs.getDouble(12));
             a.setMoneyofBusy(rs.getDouble(13));
             a.setMoneyofLate(rs.getDouble(14));
             a.setMoneyofOvertime(rs.getDouble(15));
       
        }
        return a;
	}
	
	public static void updateEfficient(Efficient a) throws SQLException
	{
		 String sql = "update tbl_efficient set taxRate= '" +a.getTaxRate()+ "',pensionRateByE = '" +a.getPensionRateByE() +"',pensionRateByC = '" + a.getPensionRateByC() +"',medicRateByE = '" +a.getMedicRateByE()+"',medicRateByC= '" +a.getMedicRateByC()+"',unempRateByE= '" +a.getUnempRateByE() +"',unempRateByC= '" +a.getUnempRateByC()+"',injuryRateByC ='" 
		            +a.getInjuryRateByC()+ "', fertiRateByC= '" + a.getFertiRateByC() + "',proFundRateByE= '" +a.getProFundRateByE() + "', proFundRateByC= '" +a.getProFundRateByC() + "',moneyOfSick= '" +a.getMoneyofSick() + "', moneyOfBusy= '" +a.getMoneyofBusy() + "',moneyOfLate= '" +a.getMoneyofLate() + "',moneyOfOver= '" +a.getMoneyofOvertime() + "'";
		 
		 Connection conn=JdbcUtils.getConnection();
		 Statement stat=conn.createStatement();
		 stat.executeUpdate(sql);
		
	}
}

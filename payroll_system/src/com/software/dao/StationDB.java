package com.software.dao;

import java.util.*;
import java.sql.*;

import com.software.db.JdbcUtils;
import com.software.pojo.Department;
import com.software.pojo.Station;

public class StationDB {
	
	  public static Station findStation(int stationID) throws SQLException{
	    	String sql="select * from tbl_station where station_id='"+stationID+"'";
	    	Connection conn=JdbcUtils.getConnection();
	    	Statement pstat =conn.createStatement();
	    	
	    	ResultSet result = pstat.executeQuery(sql);
	    	if(result.next()){
	    		String stationName=result.getString(2);
	    		Station station=new Station();	    		
	    		station.setStationID(stationID);
	    		station.setStationName(stationName);
	    		return station;
	    	}
	    	else{
	    		System.out.println("no");
	    		return null;
	    	}
	    }
	    
	    public static boolean addStation(Station aStation) throws SQLException{
	    	Statement stat=null;
	    	int stationID=aStation.getStationID();
	    	String stationName=aStation.getStationName();
	    	Connection conn=JdbcUtils.getConnection();
	    	stat=conn.createStatement();
	    	boolean bool=false;
	    	String url="insert into tbl_station values('"+stationID+"','"+stationName+"')";
	    	if(findStation(stationID)==null){
	    		stat.executeUpdate(url);
	    		bool=true;
	    		
	    	}
	    	else{
	    		System.out.println("This station exists!!!");
	    	}
	    	
	    	stat.close();
	    	conn.close();
	    	return bool;
	    }
	    public static void delStation(Station aStaiton) throws SQLException{
	    	Statement stat=null;
	    	Connection conn=JdbcUtils.getConnection();
	    	stat=conn.createStatement();
	    	int stationID=aStaiton.getStationID();
	    	String url="delete from tbl_station where station_id='"+stationID+"'";
	    	if(findStation(stationID)!=null){
	    		stat.executeUpdate(url);
	    	}
	    	stat.close();
	    	conn.close();
	    }
	    
	    public static void updateStation(Station station) throws SQLException{
	    	Statement stat=null;
	    	Connection conn=JdbcUtils.getConnection();
	    	stat=conn.createStatement();
	    	int stationID=station.getStationID();
	    	String stationName=station.getStationName();
	    	String url="update tbl_station set station_name='"+stationName+"' where station_id='"+stationID+"'";
	    	if(findStation(stationID)!=null){
	    		stat.executeUpdate(url);
	    	}
	    	stat.close();
	    	conn.close();
	    }
	   
	    public static ArrayList<Station> getAll() throws SQLException{
		    Statement stat=null;
	   		Connection conn=JdbcUtils.getConnection();
	   		stat=conn.createStatement();
	   		ArrayList<Station> arr=new ArrayList<Station>();
	   		String url="select * from tbl_station";
	   		ResultSet result = stat.executeQuery(url);
	   		if(result!=null){
	   			while(result.next()){
	   				int stationID=result.getInt(1);
	   				String stationName=result.getString(2);
	   				Station station=new Station();
	   				station.setStationID(stationID);
	   				station.setStationName(stationName);
	   				arr.add(station);
	   			}
	   		}
	   		result.close();
	   		return arr;
	   }

}

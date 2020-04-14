package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Type5Test {
	public static void main(String[] args)throws Exception {
		//register jdbc driver
		//Class.forName("com.ddtek.jdbc.oracle.OracleDriver");
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:datadirect:oracle://localhost:1521;ServiceName=xe",
				                                                                                      "scott","tiger");
		//create Statement
		Statement st=con.createStatement();
		//Send and execute SQL Query in DB s/w
		ResultSet rs=st.executeQuery("select * from student");
		//process the ResultSet
		while(rs.next()){
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}
		
		//close jdbc objs
		rs.close();
		st.close();
		con.close();
	}//main
}//class


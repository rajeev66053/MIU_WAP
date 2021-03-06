package com.miu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbConnection {
	
	private Connection conn=null;
	
	String jdbcURL="jdbc:mysql://localhost:3306/entries";
	String username="root";
	String password="T0kh@66053";
	
//	Connection con=null;
	
	public DbConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(jdbcURL,username,password);
						
		} catch (Exception ex) {
			ex.printStackTrace();
		}
			
		
	}
	
	public List<Entry> listAll(String searchWord){
			
		try {
			String query="Select * from entries where word =?";				
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setString(1, searchWord);
			
			ResultSet rs=pst.executeQuery();

			List<Entry> list= new ArrayList<Entry>();
			
			while(rs.next()) {
				String word=rs.getString("word");
				String wordtype=rs.getString("wordtype");
				String definition=rs.getString("definition");
				
				Entry entry=new Entry(word,wordtype,definition);
				list.add(entry);
			}
			
			rs.close();
			pst.close();
			
			if (null != conn) {
				conn.close();
			}

			return list;
			
		} catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return null;
		
	}

}

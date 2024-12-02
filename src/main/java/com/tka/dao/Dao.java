package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Candidate;

public class Dao {
	static String url="jdbc:mysql://localhost:3306/election2024";
	static String uname="root";
	static String password="root";
	static String sql="SELECT * FROM election2024.new_table";
	static List<Candidate> getallcandiddate=null;
//	String insert="Insert into election.new_table values(?,?,?,?,?)";
	
	
	public static  List<Candidate> getallcandiddate(){
		
//		System.out.println("we are inside dao class");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("step 1 completed");
			
			try {
				Connection connection = DriverManager.getConnection(url, uname, password);
//				System.out.println("step 2 completed");
				Statement statement = connection.createStatement();
//				System.out.println("step 3 completed");
//				int idd=34;
//				String namee="Shashikant Shinde";
//				String partynamea="bjp";
//				String genderr="male";
//				String Status="accep";
//				
				
				
							
//				PreparedStatement ins = connection.prepareStatement(insert);
				
						
				ResultSet rs = statement.executeQuery(sql);
				getallcandiddate=new ArrayList<>();
			
				
//				System.out.println("4");
				while(rs.next()) {
					int id=rs.getInt("canid");
					String name=rs.getString("canname");
					String partyname=rs.getString("partyname");
					String State=rs.getString("state");
					String assembly=rs.getString("assembly");
					int assno=rs.getInt("assemblyno");
					String status=rs.getString("status");
					String gender=rs.getString("gender");
					int age=rs.getInt("age");
					
					Candidate cd=new Candidate(id,name,partyname,State,assembly,assno,status,gender,age);
//					System.out.println(cd);
						getallcandiddate.add(cd);
					
					
					
					
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return getallcandiddate;
	}


//	private Object ins(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}

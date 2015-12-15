package com.member.db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.member.action.Member;

public class MemberDAO {
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<Member> list = new ArrayList<Member>();
 	
	public MemberDAO(){
		try {
			Context init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void carJoin_Insert(Member member){
		String sql1 = "select max(mb_no) from member";
		String sql2 = "insert into member values(?,?,?,?,?,sysdate,?,?)";
		int num = 0;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql1);
			rs = pstmt.executeQuery();
			if(rs.next()){
				num = rs.getInt(1)+1;
			}else{
				num = 1;
			}
		pstmt = conn.prepareStatement(sql2);
		pstmt.setInt(1, num);
		pstmt.setString(2, member.getId());
		pstmt.setString(3, member.getPassword());
		pstmt.setString(4, member.getName());
		pstmt.setString(5, member.getAddress());
		pstmt.setString(7, member.getEmail());
		pstmt.setString(8, member.getMemBerType());
		pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(conn != null)conn.close();
				if(pstmt != null)pstmt.close();
				if(rs != null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}

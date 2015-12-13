package com.BoardDB;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.Member.Login;
import com.Member.Member;
import com.Member.MemberList;

public class BoardDAO {
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
 	
	public BoardDAO(){
		try {
			Context init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//회원가입
	
	public void Member_Join(Member member){
		String sql1 = "select max(mb_no) from member";
		String sql2 = "insert into member values(?,?,?,?,?,sysdate,?)";
		int num = 1;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql1);
			rs = pstmt.executeQuery();
			if(rs.next()){
				num = rs.getInt(1) + 1;
			}else{
				num = 1;
			}
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, num);
			pstmt.setString(2, member.getId());
			pstmt.setString(3,member.getPassword());
			pstmt.setString(4, member.getName());
			pstmt.setString(5, member.getAddress());
			pstmt.setString(6,member.getEmail());
			pstmt.executeUpdate();

			
		} catch (SQLException e) {
			
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
	
	//회원가입 아이디중복체크
	public void IDoverlap(String id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean overlap = false;
		String sql = "select mb_id from member where mb_id = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				overlap = false;
			}else{
				overlap = true;
			}
			
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
	
	public Login Login_ck(Login login){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member where mb_id = ?";
		String id = null;
		String pw = null;
		Login Login_ok = new Login();
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, login.getId());
			rs = pstmt.executeQuery();
			if(rs.next()){
				id = rs.getString("mb_id");
				pw = rs.getString("mb_password");	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn != null)conn.close();
				if(pstmt != null)pstmt.close();
				if(rs != null)rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(login.getPassword().equals(pw)){
			Login_ok.setId(id);
			Login_ok.setPassword(pw);
			Login_ok.setLogin_check(true);
			return Login_ok;
		}else{
			return Login_ok;
		}
	}
	
	
	
	public ArrayList<Member> selectMember(){
		ArrayList<Member> list = new ArrayList<Member>();
		String sql = "select * from member ";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Member member = new Member();
				member.setMemberNumber(rs.getInt("mb_no"));
				member.setId(rs.getString("mb_id"));
				member.setName(rs.getString("mb_name"));
				member.setAddress(rs.getString("mb_address"));
				member.setRegisterDate(rs.getString("mb_registerDate"));
				member.setEmail(rs.getString("mb_email"));
				list.add(member);
			}
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
		return list;
	}
}

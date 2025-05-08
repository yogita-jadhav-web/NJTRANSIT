package com.web.db

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.junit.Assert.assertEquals

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.regex.*;
import org.testng.Assert

public class NJT_Reload_Database {

	public Connection con = null;
	public  Statement stmt = null;
	public  ResultSet rs =null;

	@Keyword
	public Connection get_MySQL_Web_DBConnection(String NJT_Web_DB_Url,String NJT_Web_DB_UserName,String NJT_Web_DB_Password) {
		String env = 'QA';
		String conn_url = null;

		if(con==null) {
			//	Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");


			try {
				//jdbc:mysql://10.150.10.221:13310/njtwebqa
				//njtwebretail_qa
				//ZaQ234567!
				con=DriverManager.getConnection(NJT_Web_DB_Url,NJT_Web_DB_UserName,NJT_Web_DB_Password);
				println('con :'+ con)
				if(con!=null) {
					println(" MYSQL NJT WEB Database Connection Successfull")
				}
				else {
					println(" MYSQL NJT WEB Database Connection Failed !........")
				}
			} catch (SQLException ex) {
				println(" MYSQL NJT WEB Database Connection Failed !........")
				ex.printStackTrace();
			}


			return con;
		}
	}



	//rashmi
	@Keyword
	public String getReferenceIDDetails(Connection con_obj,String query) {
		String RefId = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			RefId = rs.getString("ID");
			println(RefId)
		}
		return RefId;
	}
	@Keyword
	public String getRefundStatus(Connection con_obj,String query) {
		String RefundStatus = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			RefundStatus = rs.getString("REFUND_STATUS");
			println(RefundStatus)
		}
		return RefundStatus;
	}





	@Keyword
	public String getRefundDateDetails(Connection con_obj,String query) {
		String RefundDate = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			RefundDate = rs.getString("REFUND_DATE");
			println(RefundDate)
		}
		return RefundDate;
	}

	//Refund amount

	@Keyword
	public String getRefundAmountDetails(Connection con_obj,String query) {
		String RefundAmount = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			RefundAmount = rs.getString("REFUND_AMT");
			println(RefundAmount)
		}
		return RefundAmount;
	}

	@Keyword
	public String getAppTypeDetails(Connection con_obj,String query) {
		String AppType = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			AppType = rs.getString("APP_TYPE");
			println(AppType)
		}
		return AppType;
	}

	@Keyword
	public String getRefundStateDetails(Connection con_obj,String query) {
		String StateCode = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			StateCode = rs.getString("REFUND_STATE");
			println(StateCode)
		}
		return StateCode;
	}

	@Keyword
	public String getWalletIdDetails(Connection con_obj,String query) {
		String walletId = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			walletId = rs.getString("WALLET_ID");
			println(walletId)
		}
		return walletId;
	}


	@Keyword
	public String getCOMMENTSDetails(Connection con_obj,String query) {
		String comments = null;
		try {

			con=con_obj;
			stmt = con.createStatement();
			String sql_query = query;

			rs = stmt.executeQuery(sql_query);
		} catch (SQLException ex) {
			println(" MYSQL NJT WEB Database Connection Failed !........")
			ex.printStackTrace();
		}
		while(rs.next()) {

			comments = rs.getString("COMMENTS");
			println(comments)
		}
		return comments;
	}
}

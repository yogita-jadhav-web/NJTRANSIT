package com.web.db

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement

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
import groovy.json.JsonSlurper
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable
import com.web.db.NJT_Web_Database
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Validate_g_subscription {
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
	public String getUserIdDetails(Connection con_obj,String query) {
		String User_Id = null;
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

			User_Id = rs.getString("USER_ID");//need to give coulumn name
			println(User_Id)
		}
		return User_Id;
	}
	@Keyword
	public String getCardNumDetails(Connection con_obj,String query) {
		String cardnum = null;
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

			cardnum = rs.getString("CARD_NO");//need to give coulumn name
			println(cardnum)
		}
		return cardnum;
	}



	@Keyword
	public Map<String, String> get_g_subscription_data_from_DB(Connection con_obj,String email_id) {

		con=con_obj;

		def g_subscription_Data = [:]
		try {

			stmt = con.createStatement();

			//	String sql_query="select BOS_ID,WALLET_ID,FARECARD,THRESHOLD_AMT,RELOAD_AMT,STATUS,USER_ID,CARD_NO from g_autoreload where user_ID= '"+email_id+"' order by created_date desc";
			String sql_query="select * from g_subscription where user_ID= '"+email_id+"'order by created_date desc";
			rs = stmt.executeQuery(sql_query);
			if (rs.next()) {
				g_subscription_Data['BOS_ID'] = rs.getString('BOS_ID')
				g_subscription_Data['WALLET_ID'] = rs.getString('WALLET_ID')
				g_subscription_Data['FARECARD'] = rs.getString('FARECARD')
				g_subscription_Data['THRESHOLD_AMT'] = rs.getString('THRESHOLD_AMT')
				g_subscription_Data['RELOAD_AMT'] = rs.getString('RELOAD_AMT')
				g_subscription_Data['STATUS'] = rs.getString('STATUS')
				g_subscription_Data['USER_ID'] = rs.getString('USER_ID')
				g_subscription_Data['CARD_NO'] = rs.getString('CARD_NO')
			}
		} catch (SQLException ex) {
			println("MYSQL Database Connection Failed!")
			ex.printStackTrace()
		} finally {
			if (con_obj != null) {
				con_obj.close()
			}
		}

		println("Final p_autoreloadData: " + g_subscription_Data)
		println("Data Type of p_autoreloadData: " + g_subscription_Data.getClass().getName())

		return g_subscription_Data
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_USER_ID_from_p_sub_Table(Connection con_obj,String query) {
		String user_Id = null;
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

			user_Id = rs.getString("USER_ID");
			println(user_Id)
		}
		return user_Id;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_FareCardNumber(Connection con_obj,String query) {
		String fareCard = null;
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

			fareCard = rs.getString("FARECARD");
			println(fareCard)
		}
		return fareCard;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_Amount(Connection con_obj,String query) {
		String amount = null;
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

			amount = rs.getString("AMOUNT");
			println(amount)
		}
		return amount;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_Status(Connection con_obj,String query) {
		String status = null;
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

			status = rs.getString("STATUS");
			println(status)
		}
		return status;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_BOSID(Connection con_obj,String query) {
		String bosID = null;
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

			bosID = rs.getString("BOS_ID");
			println(bosID)
		}
		return bosID;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_TT_ID(Connection con_obj,String query) {
		String ttID = null;
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

			ttID = rs.getString("TT_ID");
			println(ttID)
		}
		return ttID;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_Paymethod_ID(Connection con_obj,String query) {
		String paymethodID = null;
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

			paymethodID = rs.getString("PAYMETHOD_ID");
			println(paymethodID)
		}
		return paymethodID;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_CreatedDate(Connection con_obj,String query) {
		String createdDate = null;
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

			createdDate = rs.getString("CREATED_DATE");
			println(createdDate)
		}
		return createdDate;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_PaymentCardNumber(Connection con_obj,String query) {
		String paymentCardNumber = null;
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

			paymentCardNumber = rs.getString("CARD_NO");
			println(paymentCardNumber)
		}
		return paymentCardNumber;
	}
}

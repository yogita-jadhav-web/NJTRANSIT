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
import internal.GlobalVariable
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.regex.*;
import org.testng.Assert


public class Validate_p_subscription_trx {

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


	@Keyword
	public Map<String, String> get_p_subscription_trx_data_from_DB(Connection con_obj,String email_id) {

		con=con_obj;

		def p_subscription_trx = [:]
		try {

			stmt = con.createStatement();

			//	String sql_query="select BOS_ID,WALLET_ID,FARECARD,THRESHOLD_AMT,RELOAD_AMT,STATUS,USER_ID,CARD_NO from g_autoreload where user_ID= '"+email_id+"' order by created_date desc";
			String sql_query="select * from p_subscription_trx where user_ID= '"+email_id+"'order by created_date desc";
			rs = stmt.executeQuery(sql_query);
			if (rs.next()) {
				p_subscription_trx['AMOUNT'] = rs.getString('AMOUNT')
				p_subscription_trx['PAY_REF_ID'] = rs.getString('PAY_REF_ID')
				p_subscription_trx['RETRY_COMMENT'] = rs.getString('RETRY_COMMENT')
			}
		} catch (SQLException ex) {
			println("MYSQL Database Connection Failed!")
			ex.printStackTrace()
		} finally {
			if (con_obj != null) {
				con_obj.close()
			}
		}

		println("Final p_autoreloadData: " + p_subscription_trx)
		println("Data Type of p_autoreloadData: " + p_subscription_trx.getClass().getName())

		return p_subscription_trx
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_USER_ID_from_p_subscription_TRNX_Table(Connection con_obj,String query) {
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
	public String get_Amount_from_p_subscription_TRNX_Table(Connection con_obj,String query) {
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
	public String get_PAY_REF_ID_from_p_subscription_TRNX_Table(Connection con_obj,String query) {
		String referenceID = null;
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

			referenceID = rs.getString("PAY_REF_ID");
			println(referenceID)
		}
		return referenceID;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_Credit_Card_Number_from_p_subscription_TRNX_Table(Connection con_obj,String query) {
		String creditCardNumber = null;
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

			creditCardNumber = rs.getString("CREDIT_CARD_NO");
			println(creditCardNumber)
		}
		return creditCardNumber;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_Retry_Count_from_p_subscription_TRNX_Table(Connection con_obj,String query) {
		String retryCount = null;
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

			retryCount = rs.getString("RETRY_COUNT");
			println(retryCount)
		}
		return retryCount;
	}

	/*
	 *  DB Validation method Created by @Chinna
	 */

	@Keyword
	public String get_Retry_Comment_from_p_subscription_TRNX_Table(Connection con_obj,String query) {
		String retryComment = null;
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

			retryComment = rs.getString("RETRY_COMMENT");
			println(retryComment)
		}
		return retryComment;
	}
}

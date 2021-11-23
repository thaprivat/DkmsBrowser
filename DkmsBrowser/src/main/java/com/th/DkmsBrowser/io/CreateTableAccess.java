package com.th.DkmsBrowser.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.th.DkmsBrowser.dataObjects.TssUkds2Dto;

public class CreateTableAccess {

	public static List<TssUkds2Dto> openAndSelect() {
		String url = "jdbc:jtds:sqlserver://localhost;instance=SQLEXPRESS;DatabaseName=DKMSDatabase";
		String driver = "net.sourceforge.jtds.jdbc.Driver";
		String userName = "tms";
		String password = "Hanni7522";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, userName, password);
			return new QueryRunner().query(connection, "SELECT * from dbo.TSSUKDS2",
					new BeanListHandler<TssUkds2Dto>(TssUkds2Dto.class));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return null;
	}
}
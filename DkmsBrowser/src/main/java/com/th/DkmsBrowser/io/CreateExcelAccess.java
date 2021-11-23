package com.th.DkmsBrowser.io;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.th.DkmsBrowser.dataObjects.KdtObject;

public class CreateExcelAccess {

	public static ArrayList<KdtObject> extractExcel() {

		ArrayList<KdtObject> kdtObjects = new ArrayList<KdtObject>();

		try {
			XSSFWorkbook wb = new XSSFWorkbook(
					new FileInputStream("C:\\Users\\45248\\eclipse-workspace\\DkmsBrowser\\KDT.xlsx"));
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object

			for (Row row : sheet) {
				KdtObject kdtObject = new KdtObject();
				if (row.getCell(0) != null)
					kdtObject.Kno = row.getCell(0).toString();
				if (row.getCell(1) != null)
					kdtObject.Ver = row.getCell(1).toString();
				if (row.getCell(2) != null)
					kdtObject.Mtext = row.getCell(2).toString();
				if (row.getCell(3) != null)
					kdtObject.InfoText = row.getCell(3).toString();
				if (row.getCell(4) != null)
					kdtObject.Kgroups = row.getCell(4).toString();
				kdtObjects.add(kdtObject);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return kdtObjects;
	}
}

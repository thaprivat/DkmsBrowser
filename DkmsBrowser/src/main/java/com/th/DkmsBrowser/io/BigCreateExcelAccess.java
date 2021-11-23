package com.th.DkmsBrowser.io;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.th.DkmsBrowser.dataObjects.BigObject;

public class BigCreateExcelAccess {

	public static ArrayList<BigObject> extractExcel() {

		ArrayList<BigObject> bigObjects = new ArrayList<BigObject>();

		try {
			XSSFWorkbook wb = new XSSFWorkbook(
					new FileInputStream("C:\\Users\\45248\\eclipse-workspace\\DkmsBrowser\\BIG.xlsx"));
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object

			for (Row row : sheet) {
				BigObject bigObject = new BigObject();
				if (row.getCell(0) != null)
					bigObject.NogleNavn = row.getCell(0).toString();
				if (row.getCell(1) != null)
					bigObject.KmgKno = row.getCell(1).toString();
				if (row.getCell(2) != null)
					bigObject.System = row.getCell(2).toString();
				if (row.getCell(3) != null)
					bigObject.Brug = row.getCell(3).toString();
				if (row.getCell(4) != null)
					bigObject.SektorDkmsEgen = row.getCell(4).toString();
				if (row.getCell(5) != null)
					bigObject.RodGronZone = row.getCell(5).toString();
				if (row.getCell(6) != null)
					bigObject.Kek = row.getCell(6).toString();
				if (row.getCell(7) != null)
					bigObject.CkdsPkds = row.getCell(7).toString();
				bigObjects.add(bigObject);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return bigObjects;
	}
}

package com.th.DkmsBrowser.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.th.DkmsBrowser.dataObjects.Draw;
import com.th.DkmsBrowser.model.Db;

@Service
public class DbService {

	public Db retrievedb(int id, List<Db> dbs) {
		for (Db db : dbs) {
			if (db.getid() == id) {
				return db;
			}
		}
		return null;
	}

	public List<Db> retrievedb(String label1, String label2, String label3, String label4, String label5, String kno,
			String kmgKeyStatus, List<Db> dbs) {

		List<Db> filtereddbs = new ArrayList<Db>();

		for (Db db : dbs) {

			if (db.getLabel1().contains(label1.toUpperCase()) || label1.isEmpty()) {
				if (db.getLabel2().contains(label2.toUpperCase()) || label2.isEmpty()) {
					if (db.getLabel3().contains(label3.toUpperCase()) || label3.isEmpty()) {
						if (db.getLabel4().contains(label4.toUpperCase()) || label4.isEmpty()) {
							if (db.getLabel5().contains(label5.toUpperCase()) || label5.isEmpty()) {
								if (db.getkno().contains(kno.toUpperCase()) || kno.isEmpty()) {
									if (db.getkmgKeyStatus().substring(0, 1).equals(kmgKeyStatus.toUpperCase())
											|| kmgKeyStatus.isEmpty()) {
										filtereddbs.add(db);
									}
									;
								}
								;
							}
							;
						}
						;
					}
					;
				}
				;
			}
			;
		}
		return filtereddbs;
	}

	public ArrayList<Draw> createTripleDes(Db db, ArrayList<Db> bruttoKeyList) {
		String kmgKekLabelDot = db.kmgKekLabel.replaceAll("\\:", "").trim();
		ArrayList<Draw> draws = new ArrayList<Draw>();
		draws.add(new Draw("", db.getkmgKeyLevel(), (db.label1.trim() + "." + db.label2.trim() + "." + db.label3.trim()
				+ "." + db.label4.trim() + "." + db.label5.trim()), db.getkno()));

		int inx = 0;
		while (kmgKekLabelDot != "" && inx < bruttoKeyList.size()) {
			inx = 0;
			for (Db db2 : bruttoKeyList) {
				if ((db2.label1.trim() + db2.label2.trim() + db2.label3.trim() + db2.label4.trim() + db2.label5.trim())
						.contains(kmgKekLabelDot)) {
					draws.add(new Draw(draws.get(draws.size() - 1).getLabel().trim(), db2.getkmgKeyLevel(),
							(db2.label1.trim() + "." + db2.label2.trim() + "." + db2.label3.trim() + "."
									+ db2.label4.trim() + "." + db2.label5.trim()),
							db2.getkno()));
					kmgKekLabelDot = db2.kmgKekLabel.replaceAll("\\:", "").trim();
					break;
				}
				inx++;
			}
		}
//		for (Draw draw : draws)
//			System.out.println(draw.getKno() + draw.getLabel() + draw.getLevel() + draw.getReportsTo());
		Collections.reverse(draws);
//		System.out.println("reverse----------");
//		for (Draw draw : draws)
//			System.out.println(draw.getKno() + draw.getLabel() + draw.getLevel() + draw.getReportsTo());
//
//		
//		 ArrayList<Draw> draw2 = new ArrayList<Draw>();
//		for (Draw draw : draws) {
//			draw2 = draw;
//			if (i < (draws.size()-1))
//				draw.setReportsTo(draws.get(i + 1).getReportsTo());
//			draws2.add(draw);
//		}
		return draws;
	}
}
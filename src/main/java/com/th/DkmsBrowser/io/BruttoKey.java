package com.th.DkmsBrowser.io;

import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;

import com.th.DkmsBrowser.dataObjects.BigObject;
import com.th.DkmsBrowser.dataObjects.KdtObject;
import com.th.DkmsBrowser.dataObjects.MappedFields;
import com.th.DkmsBrowser.dataObjects.TranslatedFields;
import com.th.DkmsBrowser.dataObjects.TssUkds2Dto;
import com.th.DkmsBrowser.model.Db;

public abstract class BruttoKey {

	public static ArrayList<Db> createBruttoKeyList() {
		String mtext = "";
		String infoText = "";
		String kgroups = "";
		
		BigObject bigWorkFields = new BigObject("","","","","","","","");
		
		final java.util.List<TssUkds2Dto> tssUkds2Dtos = CreateTableAccess.openAndSelect();
		final ArrayList<KdtObject> kdtObjcts = CreateExcelAccess.extractExcel();
		final ArrayList<BigObject> bigObjects = BigCreateExcelAccess.extractExcel();

		ArrayList<Db> dbs = new ArrayList<Db>();
		try {
			for (TssUkds2Dto tssUkds2Dto : tssUkds2Dtos) {

				TranslatedFields translatedFields = MappingFields.translateFromConfigFile(tssUkds2Dto);
				MappedFields mappedFields = MappingFields.mapToText(tssUkds2Dto.getKMG_KEY_LABEL_1(),
						tssUkds2Dto.getKMG_KNO(), tssUkds2Dto.getKMG_KEY_LABEL_3());
				mtext = "";
				infoText = "";
				kgroups = "";
				for (KdtObject kdtObject : kdtObjcts) {
					if (tssUkds2Dto.getKMG_KNO().contains(kdtObject.Kno)
							&& StringUtils.leftPad(tssUkds2Dto.getKMG_KNO_VER(), 2, "0").contains(kdtObject.Ver)) {
						mtext = kdtObject.Mtext;
						infoText = kdtObject.InfoText;
						kgroups = kdtObject.Kgroups;
						break;
					}
				}

				for (BigObject bigObject : bigObjects) {
					if (tssUkds2Dto.getKMG_KNO().equals(bigObject.KmgKno)) {
						bigWorkFields.System = (bigObject.System == null) ? "" : bigObject.System;
						bigWorkFields.Brug = (bigObject.Brug == null) ? "" : bigObject.Brug;
						bigWorkFields.SektorDkmsEgen = (bigObject.SektorDkmsEgen == null) ? "" : bigObject.SektorDkmsEgen;
						bigWorkFields.RodGronZone = (bigObject.RodGronZone == null) ? "" : bigObject.RodGronZone;
						bigWorkFields.CkdsPkds  = (bigObject.CkdsPkds == null) ? "" : bigObject.CkdsPkds;
						break;
					}
				}
				
				BigMappingFields bigMappingFields = new BigMappingFields();
				BigObject bigObject = bigMappingFields.bigMappingFields(bigWorkFields);
				
				dbs.add(new Db(tssUkds2Dto.getKMG_KEY_LABEL_1(), tssUkds2Dto.getKMG_KEY_LABEL_2(),
						tssUkds2Dto.getKMG_KEY_LABEL_3(), tssUkds2Dto.getKMG_KEY_LABEL_4(),
						tssUkds2Dto.getKMG_KEY_LABEL_5(), tssUkds2Dto.getKMG_KEY_TYPE(), tssUkds2Dto.getKMG_APPL_NAME(),
						tssUkds2Dto.getKMG_GROUPS(), tssUkds2Dto.getKMG_KEK_LABEL(),
						tssUkds2Dto.getKMG_VIDATA().substring(0, 6), mtext, infoText, kgroups, tssUkds2Dto.getKMG_KNO(),
						mappedFields.kmgKeyLabel1ToText.substring(0, 3), MappingFields.mapKeyStatus(tssUkds2Dto.getKMG_KEY_STATUS()),
						translatedFields.getGroupYearlyKeyExchange(), translatedFields.getTranslatedApplName(),
						translatedFields.getTranslatedKeyType(), mappedFields.kmgKeyLabel1ToText.substring(6),
						mappedFields.kmgKnoToText, mappedFields.yearlyOrOther,
						translatedFields.getBigKeyExtensionText(), mappedFields.bigKmgKeyLabel3ToText,
						mappedFields.bigKmgKeyLabel1ToText2, bigObject.System, bigObject.Brug, bigObject.SektorDkmsEgen, bigObject.RodGronZone, bigObject.CkdsPkds,
						MappingFields.mapKmgOrigin(tssUkds2Dto.getKMG_ORIGIN()), tssUkds2Dto.getKMG_ACTIVE_DATE(), tssUkds2Dto.getKMG_CREATE_DATE(),  tssUkds2Dto.getKMG_UPDATE_DATE(), tssUkds2Dto.getID(), ""));
			}
		} catch (

		Exception e) {
			throw e;
		}

		return dbs;
	}
}
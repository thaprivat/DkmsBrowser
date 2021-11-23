package com.th.DkmsBrowser.io;

import org.hibernate.loader.custom.Return;

import com.th.DkmsBrowser.dataObjects.BigObject;
import com.th.DkmsBrowser.interfaces.IbigMappingFields;

public class BigMappingFields implements IbigMappingFields {
	public BigObject bigMappingFields(BigObject bigWorkFields) {
		switch (bigWorkFields.SektorDkmsEgen) {
		case ("i"):
			bigWorkFields.SektorDkmsEgen = "Egen";
			break;
		case ("x"):
			bigWorkFields.SektorDkmsEgen = "DKMS";
			break;
		case ("v"):
			bigWorkFields.SektorDkmsEgen = "Sektor";
			break;
		case ("?"):
			bigWorkFields.SektorDkmsEgen = "Vides ikke";
			break;
		default:
			bigWorkFields.SektorDkmsEgen = "";
			break;
		}

		switch (bigWorkFields.RodGronZone) {
		case ("r"):
			bigWorkFields.RodGronZone = "CDE-zone";
			break;
		case ("g"):
			bigWorkFields.RodGronZone = "NON-CDE-zone";
			break;
		case ("rg"):
			bigWorkFields.RodGronZone = "Both zones";
			break;
		default:
			bigWorkFields.RodGronZone = "";
			break;
		}

		switch (bigWorkFields.CkdsPkds) {
		case ("v"):
			bigWorkFields.CkdsPkds = "PKDS og CKDS";
			break;
		default:
			bigWorkFields.CkdsPkds = "";
			break;
		}
		return bigWorkFields;
	}
}

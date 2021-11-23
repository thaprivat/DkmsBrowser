
package com.th.DkmsBrowser.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

import com.th.DkmsBrowser.dataObjects.Dc;
import com.th.DkmsBrowser.dataObjects.MappedFields;
import com.th.DkmsBrowser.dataObjects.TranslatedFields;
import com.th.DkmsBrowser.dataObjects.TssUkds2Dto;

public class MappingFields {

	public static TranslatedFields translateFromConfigFile(TssUkds2Dto tssUkds2Dto) {

		String _groupYearlyKeyExchange = "-", _translatedApplName = "-", _translatedKeyType = "-",
				_bigKeyExtensionText = "-";

		try {
			InputStream input = MappedFields.class.getClassLoader().getResourceAsStream("config.properties");

			Properties props = new Properties();

			if (input == null) {
				System.out.println("Sorry, unable to find config.properties");

			}

			String _fullKeyLabelName = tssUkds2Dto.getKMG_KEY_LABEL_1().trim() + "."
					+ tssUkds2Dto.getKMG_KEY_LABEL_2().trim() + "." + tssUkds2Dto.getKMG_KEY_LABEL_3().trim() + "."
					+ tssUkds2Dto.getKMG_KEY_LABEL_4().trim() + "." + tssUkds2Dto.getKMG_KEY_LABEL_5().trim();

			props.load(input);

//			String host = props.getProperty("host");

			String[] yearlyKeyExchange = props.get("yearlyKeyExchange").toString().split(",");
			String[] groupYearlyKeyExchange = props.get("groupYearlyKeyExchange").toString().split(",");

			String[] originKeyType = props.get("originKeyType").toString().split(",");
			String[] translatedKeyType = props.get("translatedKeyType").toString().split(",");

			String[] originApplName = props.get("originApplName").toString().split(",");
			String[] translatedApplName = props.get("translatedApplName").toString().split(",");

			String[] bigKeyExtension = props.get("bigKeyExtension").toString().split(",");
			String[] bigKeyExtensionText = props.get("bigKeyExtensionText").toString().split(",");

			if (Arrays.asList(originApplName).indexOf(tssUkds2Dto.getKMG_APPL_NAME().trim()) != -1)
				_translatedApplName = (translatedApplName[Arrays.asList(originApplName)
						.indexOf(tssUkds2Dto.getKMG_APPL_NAME().trim())]);

			if (Arrays.asList(originKeyType).indexOf(tssUkds2Dto.getKMG_KEY_TYPE().trim()) != -1)
				_translatedKeyType = (translatedKeyType[Arrays.asList(originKeyType)
						.indexOf(tssUkds2Dto.getKMG_KEY_TYPE().trim())]);

			java.util.List<String> aa = Arrays.asList(bigKeyExtension);
			for (int i = 0; i < aa.size(); i++) {
				if (_fullKeyLabelName.contains("." + aa.get(i) + "0")) {
					_bigKeyExtensionText = (bigKeyExtensionText[i]);
					break;
				}
			}

			int inx = 0;
			for (String s : yearlyKeyExchange) {
				String[] parts = s.split("\\.");
				String[] labelParts = _fullKeyLabelName.split("\\.");

				int i = 0;
				while (i < labelParts.length) {

					if (labelParts[i].contains(parts[i]))
						;
					else
						break;
					i++;
					if (i == labelParts.length)
						_groupYearlyKeyExchange = (groupYearlyKeyExchange[inx]);
				}
				inx++;
			}

			return new TranslatedFields(_groupYearlyKeyExchange, _translatedApplName, _translatedKeyType,
					_bigKeyExtensionText);
		} catch (

		IOException ex) {
			System.out.println(ex.toString());
		}
		return null;
	}

	public static MappedFields mapToText(String kmgKeyLabel1, String kmgKno, String kmgKeyLabel3) {

		MappedFields mappedFields = new MappedFields();
		try {
			switch (kmgKeyLabel1.substring(0, 3)) {
			case "xxx":
				mappedFields.kmgKeyLabel1ToText = "TMK";
				break;
			case "XKK":
				mappedFields.kmgKeyLabel1ToText = "XKK -udveksling af nøgler (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling) TH : Overliggende KEK til DKMS eller sektor hierakiet";
				break;
			case "IDM":
				mappedFields.kmgKeyLabel1ToText = "KEK - ATM MAC/DATA IMPORT TH : KEK til MAC - (Kan også bruges til data)";
				break;
			case "XDM":
				mappedFields.kmgKeyLabel1ToText = "KEK - MAC EXPORT TIL NETS (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling) TH : KEK til MAC - (Kan også bruges til data)";
				break;
			case "XSP":
				mappedFields.kmgKeyLabel1ToText = "KEK - PIN IMPORT/EXPORT XPK/PVV IPINENC KEYS (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling) TH : KEK til pin udvekslings nøgler";
				break;
			case "TSP":
				mappedFields.kmgKeyLabel1ToText = "KEK - ATM PIN";
				break;
			case "ISP":
				mappedFields.kmgKeyLabel1ToText = "KEK - ATM PIN IMPORT (Enc of IPK/(xpk) IPINENC/OPINENC) TH : KEK til pin udvekslings nøgler";
				break;
			case "CUS":
				mappedFields.kmgKeyLabel1ToText = "KEK - PINET (IMPORT/EXPORT) (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling) TH : Til PI-NET";
				break;
			case "XPU":
				mappedFields.kmgKeyLabel1ToText = "KEK - EXPORT VPx (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling) TH : KEK til VP* nøgler";
				break;
			case "XCU":
				mappedFields.kmgKeyLabel1ToText = "KEK - EXPORT CPx (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling) TH : KEK til CP* nøgler";
				break;
			case "TDM":
				mappedFields.kmgKeyLabel1ToText = "KEK - ATM MAC EXPORT";
				break;
			case "IMA":
				mappedFields.kmgKeyLabel1ToText = "SES - ATM MAC TH : Til Mac validering TH : Til Mac validering";
				break;
			case "XMA":
				mappedFields.kmgKeyLabel1ToText = "SES - MAC EXPORT TIL NETS (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling)";
				break;
			case "XDA":
				mappedFields.kmgKeyLabel1ToText = "SES -                                 ";
				break;
			case "XPK":
				mappedFields.kmgKeyLabel1ToText = "SES - PIN EXPORT TIL NETS (Nøgler med denne Label1-betegnelse kan indgår i årlig udveksling) TH : Til pin validerings nøgler";
				break;
			case "IDK":
				mappedFields.kmgKeyLabel1ToText = "SES - IMPORT ISSUER DERIVATION KEYS ";
				break;
			case "ICU":
				mappedFields.kmgKeyLabel1ToText = "SES - IMPORT PAC-PIN VPx keys from UKDS1 TH : KEK til CP* nøgler";
				break;
			case "IPU":
				mappedFields.kmgKeyLabel1ToText = "SES - IMPORT PAC-PIN VPx keys from UKDS1 TH : KEK til VP* nøgler";
				break;
			case "IKK":
				mappedFields.kmgKeyLabel1ToText = "RSA - PKA private key TH : Overliggende KEK til DKMS eller sektor hierakiet";
				break;
			case "CVT":
				mappedFields.kmgKeyLabel1ToText = "NON -                                 ";
				break;
			case "IDA":
				mappedFields.kmgKeyLabel1ToText = "NON - Administration";
				break;
			case "FMK":
				mappedFields.kmgKeyLabel1ToText = "NON - PInet";
				break;
			case "INC":
				mappedFields.kmgKeyLabel1ToText = "NON - MasterKey";
				break;
			case "SID":
				mappedFields.kmgKeyLabel1ToText = "NON - DKMS internal";
				break;
			case "SXD":
				mappedFields.kmgKeyLabel1ToText = "NON - TMSNO";
				break;
			case "XPP":
				mappedFields.kmgKeyLabel1ToText = "NON -                                  ";
				break;
			default:
				mappedFields.kmgKeyLabel1ToText = "Not found!!";
			}
			;
		} catch (

		Exception e1) {
			System.out.println("switch (kmgKeyLabel1.substring(0, 3)) " + e1.toString());
		}

		try {
			switch (kmgKeyLabel1.substring(7, 8)) {
			case "1":
				mappedFields.bigKmgKeyLabel1ToText2 = "Nøgle der kommer udefra";
				break;
			case "2":
				mappedFields.bigKmgKeyLabel1ToText2 = "Nogler der er skabt internt på Host";
				break;
			default:
				mappedFields.bigKmgKeyLabel1ToText2 = "Not found!!";
			}
			;
		} catch (

		Exception e1) {
			System.out.println("switch (kmgKeyLabel1.substring(7, 8))  " + e1.toString());
		}

		try {
			switch (kmgKno.substring(0, 4)) {
			case "0501":
				mappedFields.kmgKnoToText = "IBM : Overordnede KEK nøgler til udveksling af nøgler (papir & encrypted)    TMS : Yearly NETS keyexchange - XKK";
				break;
			case "0502":
				mappedFields.kmgKnoToText = "IBM : Overordnede KEK nøgler til udveksling af nøgler (papir & encrypted)    TMS : Yearly NETS keyexchange - XKK ";
				break;
			case "0506":
				mappedFields.kmgKnoToText = "IBM : Pinet nøgler     TMS : Fr.visadk/ihk i egen ATM (PINET)";
				break;
			case "0532":
				mappedFields.kmgKnoToText = "IBM : NETS gl nøgle til nøgler der skal verificeres hOS NETS     TMS : Fr.visadk/ihk i egen ATM";
				break;
			case "0582":
				mappedFields.kmgKnoToText = "IBM : KEK exchange til secure pin nøgler     TMS : Fr.visadk/ihk i egen ATM";
				break;
			case "0554":
				mappedFields.kmgKnoToText = "IBM : KEK nøgler til CP og VP     TMS : XCU/CPx keys";
				break;
			case "0555":
				mappedFields.kmgKnoToText = "IBM : KEK nøgler til CP og VP     TMS : XCU";
				break;
			case "0556":
				mappedFields.kmgKnoToText = "IBM : KEK nøgler til CP og VP     TMS : XPU/VPx keys";
				break;
			case "0558":
				mappedFields.kmgKnoToText = "IBM : KEK til 0381 0382 0383     TMS : PVVdk";
				break;
			case "0559":
				mappedFields.kmgKnoToText = "IBM : KEK til 0381 0382 0383     TMS : PVV1";
				break;
			case "0381":
				mappedFields.kmgKnoToText = "IBM : Nye operationelle dankort mv nøgler     TMS : PVV1dk (VISA)";
				break;
			case "0382":
				mappedFields.kmgKnoToText = "IBM : Nye operationelle dankort mv nøgler     TMS : PVV2dk (VISA)";
				break;
			case "0383":
				mappedFields.kmgKnoToText = "IBM : Nye operationelle dankort mv nøgler     TMS : PVV3dk (VISA)";
				break;
			case "0391":
				mappedFields.kmgKnoToText = "TMS : Til NETS PVV1 pin gen. - PVV1dk";
				break;
			case "0392":
				mappedFields.kmgKnoToText = "IBM : Nye operationelle mv nøgler     TMS : PVV2dk";
				break;
			case "0393":
				mappedFields.kmgKnoToText = "TMS : Til NETS PVV3 pin gen. - PVV3dk";
				break;
			case "0010":
				mappedFields.kmgKnoToText = "DKMS Recovery Key (systemkey)";
				break;
			case "0011":
				mappedFields.kmgKnoToText = "DKMS KEK protecting Key (systemkey)";
				break;
			case "0012":
				mappedFields.kmgKnoToText = "Systemkey - Enc. of EW TMK";
				break;
			case "0120":
				mappedFields.kmgKnoToText = "DKMS/ICSF Initial ICSF Exch. Key (systemkey)";
				break;
			case "0121":
				mappedFields.kmgKnoToText = "DKMS/ICSF ICSF Exch. Key (systemkey)";
				break;
			case "0122":
				mappedFields.kmgKnoToText = "DKMS/ICSF Link Enc. KEK (systemkey)";
				break;
			case "0199":
				mappedFields.kmgKnoToText = "Audit ";
				break;
			case "0221":
				mappedFields.kmgKnoToText = "Terminal PIN";
				break;
			case "0222":
				mappedFields.kmgKnoToText = "Terminal MAC";
				break;
			case "0251":
				mappedFields.kmgKnoToText = "Enc. af VPx keys in UKDS1";
				break;
			case "0252":
				mappedFields.kmgKnoToText = "Enc. af VPx keys in UKDS1";
				break;
			case "0253":
				mappedFields.kmgKnoToText = "Enc. af VPx keys in UKDS1";
				break;
			case "0299":
				mappedFields.kmgKnoToText = "DKMS/ICSF Audit MAC Key (systemkey)";
				break;
			case "0302":
				mappedFields.kmgKnoToText = "CP1 (ihk) - (Ej i test)";
				break;
			case "0303":
				mappedFields.kmgKnoToText = "CP2 (ihk) - (Ej i test)";
				break;
			case "0323":
				mappedFields.kmgKnoToText = "CP2 (ihk) - (Ej i test)";
				break;
			case "0304":
				mappedFields.kmgKnoToText = "CP3 (ihk) - (Ej i test)";
				break;
			case "0305":
				mappedFields.kmgKnoToText = "VP1 (ihk) - (Ej i test)";
				break;
			case "0306":
				mappedFields.kmgKnoToText = "VP2 (ihk) - (Ej i test)";
				break;
			case "0326":
				mappedFields.kmgKnoToText = "VP2 (ihk) - (Ej i test)";
				break;
			case "0307":
				mappedFields.kmgKnoToText = "VP3 (ihk) - (Ej i test)";
				break;
			case "0341":
				mappedFields.kmgKnoToText = "MAC for PVV1 - (Ej i test)";
				break;
			case "0362":
				mappedFields.kmgKnoToText = "CVV2dk - (Ej i test)";
				break;
			case "0372":
				mappedFields.kmgKnoToText = "Imported Issuer Master Derivation Keys - Application Cryptogram / Scripting - MDM or MDK";
				break;
			case "0373":
				mappedFields.kmgKnoToText = "Imported Issuer Master Derivation Keys - Scripting - MDM";
				break;
			case "0509":
				mappedFields.kmgKnoToText = "FMK for PInet";
				break;
			case "0533":
				mappedFields.kmgKnoToText = "Intlkort";
				break;
			case "0534":
				mappedFields.kmgKnoToText = "Danmønt";
				break;
			case "0543":
				mappedFields.kmgKnoToText = "Tele(sec)";
				break;
			case "0552":
				mappedFields.kmgKnoToText = "ISO - (Ej i test)";
				break;
			case "0553":
				mappedFields.kmgKnoToText = "Grønkort/debitkort i POS";
				break;
			case "0557":
				mappedFields.kmgKnoToText = "XPU - (Ej i test)";
				break;
			case "0563":
				mappedFields.kmgKnoToText = "PVVnot - (Ej i test)";
				break;
			case "0572":
				mappedFields.kmgKnoToText = "tale - (Ej i test)";
				break;
			case "0574":
				mappedFields.kmgKnoToText = "ISO - (Ej i test)";
				break;
			case "0601":
				mappedFields.kmgKnoToText = "Quickpay/ISO8583";
				break;
			case "0653":
				mappedFields.kmgKnoToText = "Quickpay/ISO8583";
				break;
			case "0895":
				mappedFields.kmgKnoToText = "SikSys";
				break;
			case "0896":
				mappedFields.kmgKnoToText = "PAN enc. ProdCopy";
				break;
			case "0897":
				mappedFields.kmgKnoToText = "PAN enc. Standard";
				break;
			case "0898":
				mappedFields.kmgKnoToText = "Danmarks statestik";
				break;
			case "0899":
				mappedFields.kmgKnoToText = "HomeBanking";
				break;
			case "0900":
				mappedFields.kmgKnoToText = "For RSA encryption";
				break;
			case "0901":
				mappedFields.kmgKnoToText = "DKMS/ICSF IMP-PKA (RSA - systemkey)";
				break;
			case "0909":
				mappedFields.kmgKnoToText = "For RSA encryption";
				break;
			case "1010":
				mappedFields.kmgKnoToText = "EVRY KeyLetters stuff";
				break;
			case "1011":
				mappedFields.kmgKnoToText = "EVRY KeyLetters stuff";
				break;
			case "1013":
				mappedFields.kmgKnoToText = "ZCMK (Keyletters from EVRY - ATM SaaS)";
				break;
			case "1020":
				mappedFields.kmgKnoToText = "DKMS internal";
				break;
			case "1021":
				mappedFields.kmgKnoToText = "DKMS internal";
				break;
			case "1022":
				mappedFields.kmgKnoToText = " -    ";
				break;
			case "1023":
				mappedFields.kmgKnoToText = " -    ";
				break;
			case "1030":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1031":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1032":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1033":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1034":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1035":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1036":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1037":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1040":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1041":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1044":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1045":
				mappedFields.kmgKnoToText = "TMSNO ";
				break;
			case "1050":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1051":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1052":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1053":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1054":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1055":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1074":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1075":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1094":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1095":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1096":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1097":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1098":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1099":
				mappedFields.kmgKnoToText = "STRAX/BALTUS";
				break;
			case "1O33":
				mappedFields.kmgKnoToText = "TMSNO straxfoi";
				break;
			case "2532":
				mappedFields.kmgKnoToText = "Grønkort - (Ej i test)";
				break;
			case "3701":
				mappedFields.kmgKnoToText = "RKL   ";
				break;
			case "3704":
				mappedFields.kmgKnoToText = "RKL   ";
				break;
			case "3710":
				mappedFields.kmgKnoToText = "IMPPKA (Initial creation of EVRY key hierarchy";
				break;
			case "3715":
				mappedFields.kmgKnoToText = "TB-skeleton (RSA RKL EVRYVIRT) - (Ej i test)";
				break;
			case "3720":
				mappedFields.kmgKnoToText = "RKL   ";
				break;
			case "3730":
				mappedFields.kmgKnoToText = "RKL   ";
				break;
			case "B702":
				mappedFields.kmgKnoToText = "DKMS Browser - RSA";
				break;
			case "DB50":
				mappedFields.kmgKnoToText = "FRYS  ";
				break;
			case "DB51":
				mappedFields.kmgKnoToText = "FRYS  ";
				break;
			case "ETIC":
				mappedFields.kmgKnoToText = "Eticket";
				break;
			case "I099":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I100":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I101":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I102":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I103":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I104":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I105":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I106":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I107":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I108":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "I109":
				mappedFields.kmgKnoToText = "Div. IKK-IMPPKA";
				break;
			case "P171":
				mappedFields.kmgKnoToText = "      ";
				break;
			case "P172":
				mappedFields.kmgKnoToText = "      ";
				break;
			case "P341":
				mappedFields.kmgKnoToText = "Imported PVV1 PIN Keys - PIN Verification";
				break;
			case "P343":
				mappedFields.kmgKnoToText = "Imported PVV1 PIN Keys - PIN Verification";
				break;
			case "X120":
				mappedFields.kmgKnoToText = "      ";
				break;
			case "X221":
				mappedFields.kmgKnoToText = "      ";
				break;
			case "X251":
				mappedFields.kmgKnoToText = "      ";
				break;
			default:
				mappedFields.kmgKnoToText = "-";
			}
			;
		} catch (

		Exception e1) {
			System.out.println("switch (kmgKno.substring(0, 4)) " + e1.toString());
		}

		mappedFields.yearlyOrOther = "-";
		if (mappedFields.kmgKnoToText.contains("TMS : ") || mappedFields.kmgKnoToText.contains("IBM : ")) {
			mappedFields.yearlyOrOther = "Yes";
		}

		try {
			switch (kmgKeyLabel3.substring(0, 2)) {
			case "KM":
				mappedFields.bigKmgKeyLabel3ToText = "DKMS-KEY : ";
				mappedFields.bigKmgKeyLabel3ToText += Dc.getByName(kmgKeyLabel3.substring(2, 4));
				break;
			case "HS":
				mappedFields.bigKmgKeyLabel3ToText = "HOST-KEY : ";
				mappedFields.bigKmgKeyLabel3ToText += Dc.getByName(kmgKeyLabel3.substring(2, 4));
				break;
			default:
				mappedFields.bigKmgKeyLabel3ToText = "-";
			}
			;
		} catch (

		Exception e1) {
			System.out.println("switch (kmgKeyLabel3.substring(0, 2)) " + e1.toString());
		}

		try {
			if (kmgKeyLabel3.length() == 8) {
				switch (kmgKeyLabel3.substring(4, 6)) {
				case "KM":
					mappedFields.bigKmgKeyLabel3ToText += "   DKMS-KEY : ";
					mappedFields.bigKmgKeyLabel3ToText += Dc.getByName(kmgKeyLabel3.substring(6, 8));
					break;
				case "HS":
					mappedFields.bigKmgKeyLabel3ToText += "   HOST-KEY : ";
					mappedFields.bigKmgKeyLabel3ToText += Dc.getByName(kmgKeyLabel3.substring(6, 8));
					break;
				default:
					mappedFields.bigKmgKeyLabel3ToText = "";
				}
				;
			}

		} catch (

		Exception e1) {
			System.out.println("if (kmgKeyLabel3.length() == 8)  " + e1.toString());
		}

		return mappedFields;
	}
	
	public static String mapKmgOrigin(String origin) {
		switch (origin) {
		case "G":
			return ("The key has been randomly generated");
		case "E":
			return (" The key has been entered into DKMS in encrypted form");
		case "C":
			return ("The key has been entered into DKMS in one or more clear key components");
		case "T":
			return ("The key already exists within UKDS2 table, but a new occurrence of the key is made");	
		default:
			return ("");
		}
	}
	
	public static String mapKeyStatus(String keyStatus) {
		switch (keyStatus) {
		case "A":
			return ("Active");
		case "I":
			return ("Inactive");
		case "D":
			return ("Deactive");
		case "P":
			return ("Pending");
		case "H":
			return ("History");
		default:
			return ("");
		}
	}
}

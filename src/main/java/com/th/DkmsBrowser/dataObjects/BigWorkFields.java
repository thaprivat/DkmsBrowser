package com.th.DkmsBrowser.dataObjects;

public class BigWorkFields {
	public String NogleNavn;
	public String KmgKno;
	public String System;
	public String Brug;
	public String SektorDkmsEgen;
	public String RodGronZone;
	public String Kek;
	public String CkdsPkds;
	public BigWorkFields() {
		super();
	}
	public String getNogleNavn() {
		return NogleNavn;
	}
	public void setNogleNavn(String nogleNavn) {
		NogleNavn = nogleNavn;
	}
	public String getKmgKno() {
		return KmgKno;
	}
	public void setKmgKno(String kmgKno) {
		KmgKno = kmgKno;
	}
	public String getSystem() {
		return System;
	}
	public void setSystem(String system) {
		System = system;
	}
	public String getBrug() {
		return Brug;
	}
	public void setBrug(String brug) {
		Brug = brug;
	}
	public String getSektorDkmsEgen() {
		return SektorDkmsEgen;
	}
	public void setSektorDkmsEgen(String sektorDkmsEgen) {
		SektorDkmsEgen = sektorDkmsEgen;
	}
	public String getRodGronZone() {
		return RodGronZone;
	}
	public void setRodGronZone(String rodGronZone) {
		RodGronZone = rodGronZone;
	}
	public String getKek() {
		return Kek;
	}
	public void setKek(String kek) {
		Kek = kek;
	}
	public String getCkdsPkds() {
		return CkdsPkds;
	}
	public void setCkdsPkds(String ckdsPkds) {
		CkdsPkds = ckdsPkds;
	}
	public BigWorkFields(String nogleNavn, String kmgKno, String system, String brug, String sektorDkmsEgen,
			String rodGronZone, String kek, String ckdsPkds) {
		super();
		NogleNavn = nogleNavn;
		KmgKno = kmgKno;
		System = system;
		Brug = brug;
		SektorDkmsEgen = sektorDkmsEgen;
		RodGronZone = rodGronZone;
		Kek = kek;
		CkdsPkds = ckdsPkds;
	}
}

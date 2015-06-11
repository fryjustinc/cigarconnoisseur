package com.example.fryjc.cigarconnoisseur.enums;

public enum Wrapper {
	ARGENTINA, ARUBA, AZORES, BAHAMAS, BARBADOS, BELGIUM, BELIZE,
	BRAZIL, BURMA, CAMEROON, CANADA, CANARYISLANDS, CHINA, COLUMBIA,
	COSTARICA, CUBA, CYPRESS, DENMARK, DOMINICANREPUBLIC, ECUADOR,
	FRANCE, GERMANY, GREECE, GUATEMALA, HAITI, HOLLAND, HONDURAS,
	INDIA, INDONESIA, IRELAND, ITALY, JAMAICA, JAVA, KOREA, MALAYSIA,
	MEXICO, MYANMAR, NEPAL, NETHERLANDS, NICARAGUA, PANAMA, PENNSYLVANIA,
	PERU, PHILIPPINES, PORTUGAL, PUERTORICO, SPAIN, SRILANKA, SUMATRA,
	SWEDEN, SWITZERLAND, SYRIA, TURKEY, UNITEDSTATES, VENEZUELA;

	public static Wrapper toWrapper(String string) {
		if(string.matches("ARG"))
			return Wrapper.ARGENTINA;
		if(string.matches("ARU"))
			return Wrapper.ARUBA;
		if(string.matches("AZO"))
			return Wrapper.AZORES;
		if(string.matches("BAH"))
			return Wrapper.BAHAMAS;
		if(string.matches("BAR"))
			return Wrapper.BARBADOS;
		if(string.matches("BEL"))
			return Wrapper.BELGIUM;
		if(string.matches("BLZ"))
			return Wrapper.BELIZE;
		if(string.matches("BRA"))
			return Wrapper.BRAZIL;
		if(string.matches("BUR"))
			return Wrapper.BURMA;
		if(string.matches("CAM"))
			return Wrapper.CAMEROON;
		if(string.matches("CAN"))
			return Wrapper.CANADA;
		if(string.matches("CI"))
			return Wrapper.CANARYISLANDS;
		if(string.matches("CHN"))
			return Wrapper.CHINA;
		if(string.matches("COL"))
			return Wrapper.COLUMBIA;
		if(string.matches("CR"))
			return Wrapper.COSTARICA;
		if(string.matches("CUB"))
			return Wrapper.CUBA;
		if(string.matches("CYP"))
			return Wrapper.CYPRESS;
		if(string.matches("DEN"))
			return Wrapper.DENMARK;
		if (string.matches("DR"))
			return Wrapper.DOMINICANREPUBLIC;
		if(string.matches("ECU"))
			return Wrapper.ECUADOR;
		if(string.matches("FRA"))
			return Wrapper.FRANCE;
		if(string.matches("GER"))
			return Wrapper.GERMANY;
		if(string.matches("GRE"))
			return Wrapper.GREECE;
		if(string.matches("GUA"))
			return Wrapper.GUATEMALA;
		if(string.matches("HAI"))
			return Wrapper.HAITI;
		if(string.matches("HOL"))
			return Wrapper.HOLLAND;
		if(string.matches("HON"))
			return Wrapper.HONDURAS;
		if(string.matches("IND"))
			return Wrapper.INDIA;
		if(string.matches("INDO"))
			return Wrapper.INDONESIA;
		if(string.matches("IRE"))
			return Wrapper.IRELAND;
		if(string.matches("ITA"))
			return Wrapper.ITALY;
		if(string.matches("JAM"))
			return Wrapper.JAMAICA;
		if(string.matches("JAVA"))
			return Wrapper.JAVA;
		if(string.matches("KOR"))
			return Wrapper.KOREA;
		if(string.matches("MAL"))
			return Wrapper.MALAYSIA;
		if(string.matches("MEX"))
			return Wrapper.MEXICO;
		if(string.matches("MYA"))
			return Wrapper.MYANMAR;
		if(string.matches("NEP"))
			return Wrapper.NEPAL;
		if(string.matches("NET"))
			return Wrapper.NETHERLANDS;
		if(string.matches("NIC"))
			return Wrapper.NICARAGUA;
		if(string.matches("PAN"))
			return Wrapper.PANAMA;
		if(string.matches("PERU"))
			return Wrapper.PERU;
		if(string.matches("PHI"))
			return Wrapper.PHILIPPINES;
		if(string.matches("POR"))
			return Wrapper.PORTUGAL;
		if(string.matches("PR"))
			return Wrapper.PUERTORICO;
		if(string.matches("SPA"))
			return Wrapper.SPAIN;
		if(string.matches("SRI"))
			return Wrapper.SRILANKA;
		if(string.matches("SUM"))
			return Wrapper.SUMATRA;
		if(string.matches("SWE"))
			return Wrapper.SWEDEN;
		if(string.matches("SWI"))
			return Wrapper.SWITZERLAND;
		if(string.matches("PA"))
			return Wrapper.PENNSYLVANIA;
		if(string.matches("USA"))
			return Wrapper.UNITEDSTATES;
		if(string.matches("VEN"))
			return Wrapper.VENEZUELA;
		return null;
	}

}

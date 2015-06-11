package com.example.fryjc.cigarconnoisseur.enums;

public enum Filler {
	ARGENTINA, ARUBA, AZORES, BAHAMAS, BARBADOS, BELGIUM, BELIZE,
	BRAZIL, BURMA, CAMEROON, CANADA, CANARYISLANDS, CHINA, COLUMBIA,
	COSTARICA, CUBA, CYPRESS, DENMARK, DOMINICANREPUBLIC, ECUADOR,
	FRANCE, GERMANY, GREECE, GUATEMALA, HAITI, HOLLAND, HONDURAS,
	INDIA, INDONESIA, IRELAND, ITALY, JAMAICA, JAVA, KOREA, MALAYSIA,
	MEXICO, MYANMAR, NEPAL, NETHERLANDS, NICARAGUA, PANAMA, PENNSYLVANIA,
	PERU, PHILIPPINES, PORTUGAL, PUERTORICO, SPAIN, SRILANKA, SUMATRA,
	SWEDEN, SWITZERLAND, SYRIA, TURKEY, UNITEDSTATES, VENEZUELA;
	

	public static Filler toFiller(String string) {
		if(string.matches("ARG"))
			return Filler.ARGENTINA;
		if(string.matches("ARU"))
			return Filler.ARUBA;
		if(string.matches("AZO"))
			return Filler.AZORES;
		if(string.matches("BAH"))
			return Filler.BAHAMAS;
		if(string.matches("BAR"))
			return Filler.BARBADOS;
		if(string.matches("BEL"))
			return Filler.BELGIUM;
		if(string.matches("BLZ"))
			return Filler.BELIZE;
		if(string.matches("BRA"))
			return Filler.BRAZIL;
		if(string.matches("BUR"))
			return Filler.BURMA;
		if(string.matches("CAM"))
			return Filler.CAMEROON;
		if(string.matches("CAN"))
			return Filler.CANADA;
		if(string.matches("CI"))
			return Filler.CANARYISLANDS;
		if(string.matches("CHN"))
			return Filler.CHINA;
		if(string.matches("COL"))
			return Filler.COLUMBIA;
		if(string.matches("CR"))
			return Filler.COSTARICA;
		if(string.matches("CUB"))
			return Filler.CUBA;
		if(string.matches("CYP"))
			return Filler.CYPRESS;
		if(string.matches("DEN"))
			return Filler.DENMARK;
		if (string.matches("DR"))
			return Filler.DOMINICANREPUBLIC;
		if(string.matches("ECU"))
			return Filler.ECUADOR;
		if(string.matches("FRA"))
			return Filler.FRANCE;
		if(string.matches("GER"))
			return Filler.GERMANY;
		if(string.matches("GRE"))
			return Filler.GREECE;
		if(string.matches("GUA"))
			return Filler.GUATEMALA;
		if(string.matches("HAI"))
			return Filler.HAITI;
		if(string.matches("HOL"))
			return Filler.HOLLAND;
		if(string.matches("HON"))
			return Filler.HONDURAS;
		if(string.matches("IND"))
			return Filler.INDIA;
		if(string.matches("INDO"))
			return Filler.INDONESIA;
		if(string.matches("IRE"))
			return Filler.IRELAND;
		if(string.matches("ITA"))
			return Filler.ITALY;
		if(string.matches("JAM"))
			return Filler.JAMAICA;
		if(string.matches("JAVA"))
			return Filler.JAVA;
		if(string.matches("KOR"))
			return Filler.KOREA;
		if(string.matches("MAL"))
			return Filler.MALAYSIA;
		if(string.matches("MEX"))
			return Filler.MEXICO;
		if(string.matches("MYA"))
			return Filler.MYANMAR;
		if(string.matches("NEP"))
			return Filler.NEPAL;
		if(string.matches("NET"))
			return Filler.NETHERLANDS;
		if(string.matches("NIC"))
			return Filler.NICARAGUA;
		if(string.matches("PAN"))
			return Filler.PANAMA;
		if(string.matches("PERU"))
			return Filler.PERU;
		if(string.matches("PHI"))
			return Filler.PHILIPPINES;
		if(string.matches("POR"))
			return Filler.PORTUGAL;
		if(string.matches("PR"))
			return Filler.PUERTORICO;
		if(string.matches("SPA"))
			return Filler.SPAIN;
		if(string.matches("SRI"))
			return Filler.SRILANKA;
		if(string.matches("SUM"))
			return Filler.SUMATRA;
		if(string.matches("SWE"))
			return Filler.SWEDEN;
		if(string.matches("SWI"))
			return Filler.SWITZERLAND;
		if(string.matches("PA"))
			return Filler.PENNSYLVANIA;
		if(string.matches("USA"))
			return Filler.UNITEDSTATES;
		if(string.matches("VEN"))
			return Filler.VENEZUELA;
		return null;
	}

}

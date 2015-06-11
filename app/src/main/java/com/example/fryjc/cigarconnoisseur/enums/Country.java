package com.example.fryjc.cigarconnoisseur.enums;

public enum Country {
ARGENTINA, ARUBA, AZORES, BAHAMAS, BARBADOS, BELGIUM, BELIZE,
BRAZIL, BURMA, CAMEROON, CANADA, CANARYISLANDS, CHINA, COLUMBIA,
COSTARICA, CUBA, CYPRESS, DENMARK, DOMINICANREPUBLIC, ECUADOR,
FRANCE, GERMANY, GREECE, GUATEMALA, HAITI, HOLLAND, HONDURAS,
INDIA, INDONESIA, IRELAND, ITALY, JAMAICA, JAVA, KOREA, MALAYSIA,
MEXICO, MYANMAR, NEPAL, NETHERLANDS, NICARAGUA, PANAMA, PENNSYLVANIA,
PERU, PHILIPPINES, PORTUGAL, PUERTORICO, SPAIN, SRILANKA, SUMATRA,
SWEDEN, SWITZERLAND, SYRIA, TURKEY, UNITEDSTATES, VENEZUELA;

	public static Country toCountry(String string){
		if(string.matches("ARG"))
			return Country.ARGENTINA;
		if(string.matches("ARU"))
			return Country.ARUBA;
		if(string.matches("AZO"))
			return Country.AZORES;
		if(string.matches("BAH"))
			return Country.BAHAMAS;
		if(string.matches("BAR"))
			return Country.BARBADOS;
		if(string.matches("BEL"))
			return Country.BELGIUM;
		if(string.matches("BLZ"))
			return Country.BELIZE;
		if(string.matches("BRA"))
			return Country.BRAZIL;
		if(string.matches("BUR"))
			return Country.BURMA;
		if(string.matches("CAM"))
			return Country.CAMEROON;
		if(string.matches("CAN"))
			return Country.CANADA;
		if(string.matches("CI"))
			return Country.CANARYISLANDS;
		if(string.matches("CHN"))
			return Country.CHINA;
		if(string.matches("COL"))
			return Country.COLUMBIA;
		if(string.matches("CR"))
			return Country.COSTARICA;
		if(string.matches("CUB"))
			return Country.CUBA;
		if(string.matches("CYP"))
			return Country.CYPRESS;
		if(string.matches("DEN"))
			return Country.DENMARK;
		if (string.matches("DR"))
			return Country.DOMINICANREPUBLIC;
		if(string.matches("ECU"))
			return Country.ECUADOR;
		if(string.matches("FRA"))
			return Country.FRANCE;
		if(string.matches("GER"))
			return Country.GERMANY;
		if(string.matches("GRE"))
			return Country.GREECE;
		if(string.matches("GUA"))
			return Country.GUATEMALA;
		if(string.matches("HAI"))
			return Country.HAITI;
		if(string.matches("HOL"))
			return Country.HOLLAND;
		if(string.matches("HON"))
			return Country.HONDURAS;
		if(string.matches("IND"))
			return Country.INDIA;
		if(string.matches("INDO"))
			return Country.INDONESIA;
		if(string.matches("IRE"))
			return Country.IRELAND;
		if(string.matches("ITA"))
			return Country.ITALY;
		if(string.matches("JAM"))
			return Country.JAMAICA;
		if(string.matches("JAVA"))
			return Country.JAVA;
		if(string.matches("KOR"))
			return Country.KOREA;
		if(string.matches("MAL"))
			return Country.MALAYSIA;
		if(string.matches("MEX"))
			return Country.MEXICO;
		if(string.matches("MYA"))
			return Country.MYANMAR;
		if(string.matches("NEP"))
			return Country.NEPAL;
		if(string.matches("NET"))
			return Country.NETHERLANDS;
		if(string.matches("NIC"))
			return Country.NICARAGUA;
		if(string.matches("PAN"))
			return Country.PANAMA;
		if(string.matches("PERU"))
			return Country.PERU;
		if(string.matches("PHI"))
			return Country.PHILIPPINES;
		if(string.matches("POR"))
			return Country.PORTUGAL;
		if(string.matches("PR"))
			return Country.PUERTORICO;
		if(string.matches("SPA"))
			return Country.SPAIN;
		if(string.matches("SRI"))
			return Country.SRILANKA;
		if(string.matches("SUM"))
			return Country.SUMATRA;
		if(string.matches("SWE"))
			return Country.SWEDEN;
		if(string.matches("SWI"))
			return Country.SWITZERLAND;
		if(string.matches("PA"))
			return Country.PENNSYLVANIA;
		if(string.matches("USA"))
			return Country.UNITEDSTATES;
		if(string.matches("VEN"))
			return Country.VENEZUELA;

		return null;
	}
}

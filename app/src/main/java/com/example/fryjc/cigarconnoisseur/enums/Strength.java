package com.example.fryjc.cigarconnoisseur.enums;

public enum Strength {
	FULL, MEDIUMFULL, MEDIUM, MILDMEDIUM, MILD;

	public static Strength toStrength(String string) {
		if (string.matches("Mild"))
			return Strength.MILD;
		if (string.matches("Mild-Medium"))
			return Strength.MILDMEDIUM;
		if (string.matches("Medium"))
			return Strength.MEDIUM;
		if (string.matches("Medium-Full"))
			return Strength.MEDIUMFULL;
		if (string.matches("Full"))
			return Strength.FULL;
		return null;
	}
}

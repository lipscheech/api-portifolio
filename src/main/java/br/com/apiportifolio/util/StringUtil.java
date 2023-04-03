package br.com.apiportifolio.util;

public class StringUtil {

	public static boolean isNullOrEmpty(String value) {
		value = value.replaceAll(" ", "");
		value = value.replaceAll("\n", "");
		return  value.isEmpty() | value.trim().isEmpty();
	}

}

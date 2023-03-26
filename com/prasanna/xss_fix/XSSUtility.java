package com.prasanna.xss_fix;

public class XSSUtility {

    /**
     * @author Prasanna Kumar Devarapalli
     *
     * Cross-site Scripting issue fix without using any Library.
     *
     * @param string  (String before validation)
     * @param xssSyntax (format of xssSyntax String)
     * @return sb.toString() returns XSS validated String
     */
    public static String validateString(String string, String xssSyntax) {
        if (string == null)     return null;
        if (string.isEmpty())   return "";
        StringBuffer sb = new StringBuffer();

        for (char ch : string.toCharArray()) {
            int i = xssSyntax.indexOf(ch);
            if (i >= 0)
                sb.append(xssSyntax.substring(i, i + 1));
            else
                throw new RuntimeException("Invalid special character " + ch + " is received in " + string);
        }
        return sb.toString();
    }
}

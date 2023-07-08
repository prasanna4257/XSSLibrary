package com.prasanna.xss_fix;

interface SyntaxConstantsInterface {
    public static final String stringSyntax  = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static final String alphaNumeric  = stringSyntax + "0123456789";
    public static final String eMailSyntax   = alphaNumeric + "@._-+";
    public static final String docNameSyntax = alphaNumeric + "_-";
}

package com.prasanna.xss_fix;

import static com.prasanna.xss_fix.SyntaxConstantsInterface.*;

public class XSSTest {

    /* Note: Adding Regex will not reduce the XSS issues count.
     *  so below approach will not reduce the XSS issues count. */

    public static void main(String... str){
        XSSUtility.validateString("Prasanna", stringSyntax);
        XSSUtility.validateString("Prasanna4257", alphaNumeric);
        XSSUtility.validateString("Prasanna4257@gmail.com", eMailSyntax);
        XSSUtility.validateString("Prasanna_Kumar", docNameSyntax);
    }
}

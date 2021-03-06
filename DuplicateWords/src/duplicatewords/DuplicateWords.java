/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatewords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author bibo
 */
public class DuplicateWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pattern = "(\\b\\w+\\b)(\\s*\\1\\b)+";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                findMatch = false;
            }

            System.out.println(input);
            testCases--;
        }
    }
}

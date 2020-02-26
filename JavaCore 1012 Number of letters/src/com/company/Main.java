package com.company;

/*

1012 number of letters
Enter 10 lines from the keyboard and count the number of different letters in them (for 33 small letters of the alphabet).
Display the result in alphabetical order.
Output Example:
a 5
b 8
at 3
g 7
d 0
...
i am 9

Requirements:
1. The program should read data from the keyboard.
2. The program should display the text on the screen.
3. The output text should contain 33 lines.
4. Each line of the output should contain the letter of the Russian alphabet, a space and how many times the letter was found in the entered lines.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (int i=0; i<33; i++) {
            int count = 0;
            for(int j=0; j<list.size(); j++) {
                for (int sub =0; sub<list.get(j).length(); sub++) {
                    if(alphabet.get(i).toString().equals(list.get(j).substring(sub, sub+1)))
                        count = count+1;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
            count = 0;
    }
    }

}


















package org.example.december1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Trebuchet {

    public ArrayList<String> stringArray;
    public ArrayList<Integer> numberArray;

    private char digitOne = 'Ø';
    private char digitTwo = 'Ø';

    public Trebuchet(File puzzleInput) {
        numberArray = new ArrayList<>();
        stringArray = new ArrayList<>();
        readFileToStringArray(puzzleInput);
        fillNumberArrayWithDigits();
    }
    public int calculateSum() {
        int sum = 0;
        for (int number : numberArray) {
            sum += number;
        }
        return sum;
    }
    public void readFileToStringArray(File puzzleInput) {
        try {
            FileReader fr = new FileReader(puzzleInput);
            Scanner sc = new Scanner(fr);

            while (sc.hasNext()) {
                String line = sc.next();
                stringArray.add(line);
            }
            sc.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Failed to read puzzle-input.txt");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Failed to close FileReader");
            throw new RuntimeException(e);
        }
    }
    public void fillNumberArrayWithDigits() {
        for (String line : stringArray) {
            digitOne = findFirstDigit(line);
            digitTwo = findLastDigit(line);
            numberArray.add(combineDigits(digitOne, digitTwo));
        }
    }

    public char findFirstDigit(String line) {
        for (Character ch : line.toCharArray()) {
            if (Character.isDigit(ch)) {
                return ch;
            }
        }
        return 'Ø';
    }

    public char findLastDigit(String line) {
        ArrayList<Character> charArray = new ArrayList<>();
        for (char ch : line.toCharArray()) {
            charArray.add(ch);
        }
        Collections.reverse(charArray);
        for (Character ch : charArray) {
            if (Character.isDigit(ch)) {
                return ch;
            }
        }
        return 'Ø';
    }

    public Integer combineDigits(char first, char second) {

        String digitString = "";

        if (first != 'Ø') {
            digitString += first;
        }

        if (second != 'Ø') {
            digitString += second;
        }

        return Integer.parseInt(digitString);
    }
}

package Foerste_semester._7_fil_inputOutput;

import java.io.*;
import java.util.ArrayList;

public class WordCount {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        int totalWords = 0;

        try {
            FileReader fileReader = new FileReader("WordCount.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words using space as the delimiter
                String[] words = line.split(" ");

                // Add each word to the ArrayList
                for (String word : words) {
                    wordList.add(word);
                    totalWords++;
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int moneyCount = 0;
        String targetWord = "Money";

        for (String word : wordList) {
            if (word.compareToIgnoreCase(targetWord) == 0) {
                moneyCount++;
                }
            }
        System.out.println("Total Words: " + totalWords);
        System.out.println("Occurrences of money: " + moneyCount);
        }
    }
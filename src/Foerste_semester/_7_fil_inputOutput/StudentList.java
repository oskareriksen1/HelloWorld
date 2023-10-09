package Foerste_semester._7_fil_inputOutput;

import java.io.*;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<String> list=new ArrayList<String>();
        String linje = ind.readLine();
        while (linje != null)
        {
            String[] bidder = linje.split(",");
            String navn=bidder[1];
            list.add(navn);
            linje = ind.readLine();
        }
        fil.close();
        list.sort(null);
        for (String s: list){
            System.out.println(s);
        }
        saveList(list);
    } // main

    static void saveList(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s: l){
            ud.println(s);
        }
        fil.close();
    }
}

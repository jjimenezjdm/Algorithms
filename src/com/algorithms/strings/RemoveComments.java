package com.algorithms.strings;

import java.io.*;

public class RemoveComments {

    /**
     * Given a file we are going to read it line by line, can you write a method to remove block
     * comments marked with '/*' and '*\'. Simulate the input file if needed.
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     */

    public static void main(String[] args) {
        File file = new File("src/resources/removeComments");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            removeComments(br);
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void removeComments(BufferedReader bufferedReader) {
        File tempFile = new File("src/resources/removeCommentsOut.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(tempFile));
            String st;
            boolean pass = false;
            while ((st = bufferedReader.readLine()) != null) {
                if (st.contains("/*")) {
                    pass = true;
                }
                if (!pass) {
                    writer.append(st);
                    writer.newLine();
                }
                if (st.contains("*/")) {
                    pass = false;
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by alex-deem on 2016/11/6 0006.
 */

class wordSearcher implements Runnable {

    @Override
    public void run() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int lineNumber = 1;

        try {
            fileReader = new FileReader("F:/from.txt");
            bufferedReader = new BufferedReader(fileReader);

            while (true) {
                String line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }
                if (line.contains("g")) {
                    System.out.println("This is line "+lineNumber+":"+line);
                }
                lineNumber++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.exit(0);
            }
        }
    }
}

package com.AF;

import java.io.*;

public class SaveToFile {
    String path = "";
    PrintWriter pr = createFile(path);

    PrintWriter createFile(String path) {
        this.path = path;
        try {
            File file = new File(path);
            PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            return pr;
        }catch (IOException e){}
        return null;
    }
    void printToFile (String x, PrintWriter pr) {
        this.pr = pr;
        pr.println(x);
    }
    void addSpace(){
        this.pr.println();
    }
}

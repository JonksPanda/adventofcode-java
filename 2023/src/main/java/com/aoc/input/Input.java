package com.aoc.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    String file;
    List<String> rows = new ArrayList<>();

    public Input(String file) {
        String path = System.getProperty("user.dir") + "/2023/input_files/";
        this.file = path + file;

        this.setRowsLoop();
    }

    private void setRowsLoop() {
        try {
            Scanner scanner = new Scanner(new File(this.file));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                this.rows.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getRow(int lineNo) {
        return rows.get(lineNo);
    }

    public int getRowsLen() {
        return rows.size();
    }

    public List<String> getRowsList() {
        return rows;
    }
}

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main (String[]args) throws FileNotFoundException {
        String filename = "src/patents.csv";
        Map<Integer, Set<Patent>> patentsMap = parsePatentsData(filename);
        printPatents(patentsMap);

       Map<Integer, Set<Patent>> parsePatentsData (String Object filename;
            filename) throws FileNotFoundException {
            String filename = "src/patents.csv";
            Map<Integer, Set<Patent>> patentsMap = parsePatentsData(filename);
            printPatents(patentsMap);

            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            Map<Integer, Set<Patent>> patentsMap = new TreeMap<>();
            scanner.nextLine();
            while (scanner.hasNext()) {
                String[] data = scanner.nextLine().split(";");
                Patent patent = new Patent(data[0], data[1], data[2], Integer.parseInt(data[3]), data[4]);
                if (patentsMap.get(patent.getYear()) != null) {
                    Set<Patent> patentsSet = patentsMap.get(patent.getYear());
                    patentsSet.add(patent);
                } else {
                    Set<Patent> patentsSet = new HashSet<>();
                    patentsSet.add(patent);
                    patentsMap.put(patent.getYear(), patentsSet);

                }

                scanner.close();
                return patentsMap;

            }
            public static void main (String[]args) throws FileNotFoundException {
                String filename = "src/patents.csv";
                Map<Integer, Set<Patent>> patentsMap = parsePatentsData(filename);
                printPatents(patentsMap);
            }
        }
        }
    }
}





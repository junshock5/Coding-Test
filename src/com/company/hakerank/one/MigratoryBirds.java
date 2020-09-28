package com.company.hakerank.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(java.util.List<Integer> arr) {
        //constraints : type 1 ~ 5
        int[] birdTypeArr = new int[5];

        for (int i = 0; i < arr.size(); i++) {
            int birdType = arr.get(i);
            birdTypeArr[birdType - 1]++; //plus 1 in birdType - 1
        }

        int frequencyType = 0;
        int frequency = 0;

        for (int i = 0; i < birdTypeArr.length; i++) {
            if (birdTypeArr[i] > frequency) { //if bird frequency is bigger
                frequency = birdTypeArr[i];
                frequencyType = i + 1; //birdType is arr's index + 1
            }
        }

        return frequencyType;

    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

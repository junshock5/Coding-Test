package main.java.com.company.nexon;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;


class five {
    private static final Scanner scan = new Scanner(System.in);

    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            HashSet<String> hs = new HashSet<>();
            while (line != null) {
                String[] temp = line.split(" ");
                String tempRes = temp[3];
                tempRes = tempRes.replace("[", "");

                if (hs.contains(tempRes)) {
                    sb.append(tempRes);
                    sb.append("\n");
                }
                hs.add(tempRes);

                line = br.readLine();
            }
            System.out.println(sb.toString());
            return sb.toString();
        } finally {
            br.close();
        }
    }

    public static void main(String args[]) throws Exception {
        String filename;
        filename = scan.next();
        OutputStream os = null;
        String data = readFile(filename);
        String resultFileName = "req_" + filename;

        try {
            os = new FileOutputStream(new File(resultFileName), true);
            os.write(data.getBytes(), 0, data.length());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

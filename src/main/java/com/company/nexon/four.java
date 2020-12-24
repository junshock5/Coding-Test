package main.java.com.company.nexon;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;


class four {
    private static final Scanner scan = new Scanner(System.in);

    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                String[] temp = line.split(" ");
                String tempRes = temp[6];
                String lastWord = tempRes.substring(tempRes.lastIndexOf("/") + 1);

                if (line.contains(".gif")) {
                    sb.append(lastWord);
                    sb.append("\n");
                }
                else if (line.contains(".GIF")) {
                    sb.append(lastWord);
                    sb.append("\n");
                }
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
        //filename = scan.next();
        filename = "hosts_access_log_00.txt";
        OutputStream os = null;
        String data = readFile(filename);
        String resultFileName = "gifs_" + filename;

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

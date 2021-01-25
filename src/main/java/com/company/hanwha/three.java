package main.java.com.company.hanwha;

import java.util.ArrayList;

class three {
    public static int[] solution(int[] deposit) {
        ArrayList<Integer> num = new ArrayList<Integer>();//타입설정 int타입만 사용가능
        for (int i = 0; i < deposit.length; ++i) {
            if (deposit[i] > 0) {
                num.add(deposit[i]);
            } else {
                int difference = deposit[i];
                while (difference < 0) {
                    if (num.get(num.size() - 1) + difference > 0) {
                        num.set(num.size() - 1, num.get(num.size() - 1) + difference);
                        difference = num.get(num.size() - 1) + difference;
                    }
                    else {
                        difference += num.get(num.size() - 1);
                        num.remove(num.size() - 1);
                    }

                }
            }

        }

        return num.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String args[]) throws Exception {
        int[] rooms = {500, 1000, 2000, -1000, -1500, 500};
        int[] a = solution(rooms);
        int c=3;
    }
}

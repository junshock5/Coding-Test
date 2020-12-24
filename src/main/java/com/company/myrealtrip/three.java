package main.java.com.company.myrealtrip;

import java.util.*;


class three {
    public static int solution(int minCustomers, int[] customers, int[] cost) {
        int answer = 0;

        Map<Float, Integer> degrees = new HashMap<Float, Integer>();
        Map<Integer, Integer> degrees2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < customers.length; ++i) {
            degrees.put((float) customers[i] / (float) cost[i], customers[i]);
            degrees2.put(customers[i], cost[i]);
        }

        Iterator<Map.Entry<Float, Integer>> entries = degrees.entrySet().iterator();
        Map.Entry<Float, Integer> entry = entries.next();
        while (minCustomers > 0) {

            // 남은 코인중에 잔돈보다 더 크고 COST(Value)가 가장 적은 customers를 택한다.
            if (entry.getValue() >= minCustomers) {

                // Map.Entry 리스트 작성
                List<Map.Entry<Float, Integer>> list_entries = new ArrayList<Map.Entry<Float, Integer>>(degrees.entrySet());

                // 비교함수 Comparator를 사용하여 오름차순으로 정렬
                Collections.sort(list_entries, new Comparator<Map.Entry<Float, Integer>>() {
                    // compare로 값을 비교
                    public int compare(Map.Entry<Float, Integer> obj1, Map.Entry<Float, Integer> obj2) {
                        // 오름 차순 정렬
                        return obj1.getValue().compareTo(obj2.getValue());
                    }
                });


                minCustomers -= list_entries.get(0).getValue();
                answer += degrees2.get(list_entries.get(0).getValue());
                continue;
            }

            minCustomers -= entry.getValue();
            answer += degrees2.get(entry.getValue());
        }
        return answer;
    }



    public static void main(String[] args) {

        int minCustomers = 100;
        int[] customers = {9, 11, 4, 7, 2, 8};
        int[] cost = {4, 9, 3, 8, 1, 9};
        int temp = solution(minCustomers, customers, cost);

    }
}

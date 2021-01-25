package main.java.com.company.hanwha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

class two {
    public static String[] solution(String[] rooms, int target) {
        String[] answer = {};
        ArrayList<String> strings = new ArrayList<String>();//타입설정 int타입만 사용가능
        ArrayList<String> strings2 = new ArrayList<String>();//타입설정 int타입만 사용가능
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();//HashMap생성

        String deleteChar = "";
        for (int i = 0; i < rooms.length; ++i) {
            if (rooms[i].contains(Integer.toString(target))) {
                String[] arr = rooms[i].split("]");
                deleteChar = arr[1];
            } else {
                // map에 key&value 형식으로 넣어보자. target과 가까운 순으로 hash에 add해보자.
                String[] arr = rooms[i].split("]");
                StringBuilder str = new StringBuilder(arr[0]);
                str.deleteCharAt(0);

                //map.put(Math.abs(Integer.parseInt(str.toString()) - target),arr[1]);
                Integer temp = Math.abs(Integer.parseInt(str.toString()) - target);
                if (map.containsKey(temp)) {
                    map.put(temp + 1, arr[1]);
                } else {
                    map.put(temp, arr[1]);
                }
            }
        }
        // 알파벳순 정렬 후 넣는다.
        for (Integer i : map.keySet()) { //저장된 key값 확인
            //System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
            String[] arr = map.get(i).split(",");

            Arrays.sort(arr); // Char Array 알파벳 순 정렬
            for (int j = 0; j < arr.length; ++j) {
                // 넣는 중간에 동명이인이 있다면 기존꺼 삭제 후 맨뒤로 넣는다.
                if (!strings.contains(arr[j]) && !arr[j].equals(deleteChar))
                    strings.add(arr[j]);
                else {
                    strings.remove(arr[j]);
                    if (!arr[j].equals(deleteChar))
                        strings2.add(arr[j]);
                }
            }

        }
        for (int i = 0; i < strings2.size(); ++i) {
            strings.add(strings2.get(i));
        }
        answer = strings.toArray(new String[strings.size()]);

        return answer;
    }

    public static void main(String args[]) throws Exception {
        String[] rooms = {"[101]Azad,Guard", "[202]Guard", "[303]Guard,Dzaz"};
        String[] a = solution(rooms, 202);
    }
}

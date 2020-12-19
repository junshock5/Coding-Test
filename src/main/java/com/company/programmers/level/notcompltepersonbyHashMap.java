package main.java.com.company.programmers.level;

import java.util.HashMap;

class notcompltepersonbyHashMap {
    public static String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String,Integer> hm = new HashMap<>();
        for(String player : participant) {
            hm.put(player, hm.getOrDefault(player,0)+1);
        }
        for(String player : completion) {
            hm.put(player, hm.get(player)-1);
        }

        for( String key : hm.keySet()){
            if(hm.get(key) !=0){
                answer=key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s_array = {"leo", "kiki", "eden"};
        String[] s_array2 = {"eden", "kiki"};
        System.out.println(solution(s_array, s_array2));
    }


}

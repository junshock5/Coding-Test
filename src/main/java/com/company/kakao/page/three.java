package com.company.kakao.page;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class three {

    private static void insertSort(int[] array) {
        int temp = 0;
        int j = 0;

        for (int i = 1; i < array.length; i++) {
            temp = array[i]; // 삽입대상 임시 저장.
            j = i; //index 임시저장
            while (j > 0 && temp < array[j - 1]) { //삽입대상이 정렬된 대상들보다 작은 경우가 있는 경우
                array[j] = array[j - 1]; //밀기
                j--; //다음 비교를 위해 인덱스 이동
            }
            array[j] = temp; //최종으로 삽입될 위치에 삽입대상 삽입
        }
    }
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();


        int[] array = new int[Integer.parseInt(input)];
        String[] arrayStr = br.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayStr[i]);
        }

        input = br.readLine();
        int[] array2 = new int[Integer.parseInt(input) + array.length];
        String[] arrayStr2 = br.readLine().split(" ");
        for (int i = 0; i < arrayStr2.length; i++) {
            array2[i] = Integer.parseInt(arrayStr2[i]);
        }

        System.arraycopy(array, 0, array2, array2.length - array.length, array.length);
        insertSort(array2);

        int a = Integer.parseInt(br.readLine());
        System.out.println(array2[a - 1]);

    }
}

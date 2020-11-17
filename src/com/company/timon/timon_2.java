package com.company.timon;

class timon_2 {

    /*
    참고 : https://namocom.tistory.com/377
    https://blog.advenoh.pe.kr/algorithm/Algorithm-%EC%A0%95%EC%88%98%EA%B0%92%EC%97%90%EC%84%9C-1%EC%9D%B4-%EC%84%A4%EC%A0%95%EB%90%9C-bit%EB%A5%BC-%EC%B9%B4%EC%9A%B4%ED%8A%B8%ED%95%98%EA%B8%B0/
    방법1. 이진 문자열로 바꾸어 1인 문자를 센다.
    방법2. 비트연산자로 마스킹하여 센다.
    방법3. 1을 빼서 구한 후 원래 수와 AND연산의 횟수로 구하기

    방법2. 특정 자리의 비트 값을 1과 AND 연산을 하면 그 값을 구할 수 있다.
    주의 사항은 자바에서 >>를 쓰게 되면 음수의 경우 왼쪽의 비트가 1로 채워진다는 것이다.
    무한 루프에 빠질 수 있다. 따라서  >>>를 사용하여 0으로 채워지게 해야 한다.

    이 알고리즘은 정수 값이 0이 될때까지 반복하기 때문에 복잡도는 O(n)이 됩니다. 이것보다 더 빠른 방법은 없을 까요?
    브라이언 커니핸 교수님이 고안한 알고리즘은 O(log n)으로 비트를 카운트 할 수 있습니다.
    */

    public static int countBits(int number) {
        int resultCount = 0;
        while (number > 0) {
            resultCount += number & 1; //마지막 bit가 1이면 count함 (AND로 확인)
            number >>= 1; //마지막 bit를 삭제함, 삭제하지 않으면 무한루프에 빠진다. 즉 값을 줄여나간다.
        }
        return resultCount;
    }

    public static int countBits2(int number) {
        int count = 0;
        while (number > 0) {
            number &= number - 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(7));
    }
}

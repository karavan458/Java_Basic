/* 작성자 : 정훈찬
   작성일자 : 2024-12-14
   작성프로그램 : openjdk 21, IntelliJ IDE
   작성 목적 : int 형 배열의 최대값, 평균값을 계산하는 프로그램
 */


public class Main {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 10, 9, 2 }; //임의의 배열 생성
        int max = 0;    //배열의 최대값을 저장할 변수 max를 선언과 0으로 초기화함
        int sum = 0;    //배열 요소의 총합값을 저장할 변수 sum를 선언과 0으로 초기화함
        int avg = 0;    //배열의 평균값을 저장할 변수 avg를 선언과 0으로 초기화함

        //int i라는 지역변수를 통해서 0 ~ 4까지 반복함
        for(int i = 0; i < arr.length; i++) {
            //반복문이 돌아가는 동안 배열에 순차적으로 접근하고 그 값을 비교하여 클경우 max변수에 저장함
            if(max < arr[i])  max = arr[i];
        }

        //int i라는 지역변수를 통해서 0 ~ 4까지 반복함
        for(int i = 0; i < arr.length; i++) sum += arr[i]; // 배열에 순차적으로 접근하여 sum이라는 변수에 값을 중첩해서 더함

        //배열의 총 합계를 저장한 변수 sum과 배열에 저장한 인덱스의 길이를 이용해서 편균값을 구하고 변수 avg에 저장
        avg = sum / arr.length; //다만 avg 변수의 Int 형 데이터 타입이므로 나눗셈 연산시 소숫점은 잘라버림

        //아래는 출력
        System.out.println("배열의 최대값은 : " + max);
        System.out.println("배열의 총합값은 : " + sum);
        System.out.println("배열의 평균값은 : " + avg);
    }
}
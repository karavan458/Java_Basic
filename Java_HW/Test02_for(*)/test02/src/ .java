/*
 * 작 성 자 : 정훈찬
 * 작성일자 : 2024-12-06
 * 작성버전 : openjdk21, Eclipse IDE
 * 프로그램 목적 : 반복문을 사용하여 도형만들기(*로)
 */
public class Test02 {
	public static void main(String[] args) {
		//직각 삼각형 찍기 
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("-------------------------");
		
		//역직각 삼각형 찍기
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		//오른쪽 정렬 직각삼각형 찍기
		for(int i = 0; i < 5; i++) {
			for(int k = 1; k <= (4 - i); k++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//정사각형 찍기
		System.out.println("-------------------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
}

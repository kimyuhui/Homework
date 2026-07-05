package homework;

import java.util.Random;
import java.util.Scanner;

public class homework0705 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Random r = new Random();				
		
		
		System.out.println("             §§§ 영화관 §§§");
		System.out.println();
		System.out.println();
		System.out.println("               좌석 선택");
		System.out.println("----------------------------------------");
		System.out.println("   A   B   C   D   E   F   G   H   I   J");
		
		
		char sit[][] = new char[5][10]; 	
		for(int i = 0; i < 5; i++) {		
			for(int j = 0; j < 10; j++) {	
				sit[i][j] = '□';			
			}
		}								
		
		// 5열 10행의 좌석
		// i가 true일 때 아래의 for문이 시행된다 -> 0~4로 총 5번
		// j가 true일 때 아래의 식이 시행됨 -> 0~9로 총 10번
		// sit[0~4][0~9]에 해당하도록 네모로 좌석을 배치함
		
		/* 근데 프로그래밍 숫자는 0부터 세는데
		왜 위의 배열은 [5][10]으로 선언할까
		5열 10행을 만들고 싶으면 [4][9]가 아닐까*/
		
		
		
		String[] A = {"예약가능", "예약불가"};

		
	
//		int w = r.nextInt(0,9); 			/* 랜덤으로 예매된 좌석을 만들려고
//		int h = r.nextInt(0,4); 			   열과 행에 랜덤한 정수를 주기 위해 nextInt를 사용함
//		sitArr[h][w] = '■'; 					괄호 안의 숫자 중에서 랜덤으로 고른다 */
//
//		for(int k = 0; k < 8; k++) { 		/* 하지만 이렇게 했더니 하나의 좌석만 랜덤으로 지정됨
//	 		sitArr[h][w] = '■';					h와 w를 랜덤한 값으로 설정했어도 위에서 이미 정해졌기 때문에
//		}										그것만 8번 반복함 */
											
		
		
		
		for(int k = 0; k < 8; k++) {		
		    int w = r.nextInt(0, 9); 	    
		    int h = r.nextInt(0, 4); 		
		    sit[h][w] = '■';				
		}
		
		// 그래서 for문으로 int k가 true일 때
		// 랜덤으로 w와 h에 정수값이 정해지도록 함
		// 그리고 해당하는 좌석이 검은 네모로 칠해지도록 함
		// 예약불가 좌석의 개수도 랜덤하게 하고 싶었는데 그것까지는 못했다
		
		
		
		for (int i = 0; i < 5; i++) {		// 좌석 이름을 보기 편리하게 하기 위해
			for (int k = i; k == i; k++) {	// 열과 행에 알파벳, 숫자가 보이도록 함
				System.out.print(i+1);
			}
			for(int j = 0; j < 10; j++) {
				System.out.printf("%3c ", sit[i][j]); // 칸이 다닥다닥 붙어있지 않고 한칸씩 띄어지도록 함
			}
			System.out.println();
		}
		
	
		
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.print("몇 좌석 예매하시나요? ");
		int answer = sc.nextInt();
		System.out.println("입력한 좌석 수: " + answer);
		System.out.println();
		System.out.println("좌석을 선택해주세요 (A1 ~ J5)");
		
		
		String[] select = new String[answer]; 
		int alp = 0; 
		// 좌석을 선택하면 위의 answer 수만큼 문자열 개수 저장하기
		// 좌석을 숫자로 선언했기 때문에 알파벳도 숫자로 바꾸기 위해 alp 변수 선언
		
		for(int i = 0; i < answer; i++) {
		System.out.print("행(A~J): ");
		String answer1 = sc.next();
		switch(answer1) {
		case "A": 
			alp = 0;
			break;
			
		case "B":
			alp = 1;
			break;
			
		case "C":
			alp = 2;
			break;
			
		case "D":
			alp = 3;
			break;
		
		case "E":
			alp = 4;
			break;
			
		case "F":
			alp = 5;
			break;
			
		case "G":
			alp = 6;
			break;
			
		case "H":
			alp = 7;
			break;
			
		case "I":
			alp = 8;
			break;
			
		case "J":
			alp = 9;
			break;
		} //switch 변수로 알파벳을 숫자로 변환함 
		System.out.print("열(1~5): ");
		int answer2 = sc.nextInt();
		select[i] = answer1 + answer2; 
		if(sit[answer2 - 1][alp] == '■') { //입력한 좌석이 ■ 좌표와 같으면 아래 문구가 출력되도록 함
			System.out.println("잘못 선택하셨습니다");
		} 
		}

		
	}

}
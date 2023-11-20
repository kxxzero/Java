
// 컴퓨터와 가위바위보
import java.util.Scanner;
public class 삼항연산자6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int com=(int)(Math.random()*3); // 0, 1, 2
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 입력:");
		int user=scan.nextInt();
		
		// 입력 확인
		System.out.print("컴퓨터:");
		System.out.print(com==0?"가위":"");
		System.out.print(com==1?"바위":"");
		System.out.print(com==2?"보":"");
		
		System.out.println();
		
		System.out.print("사용자:");
		System.out.print(user==0?"가위":"");
		System.out.print(user==1?"바위":"");
		System.out.print(user==2?"보":"");
		
		System.out.println();
		
		// 결과 출력
		System.out.println(com-user==-2 || com-user==1 ? "컴퓨터가 이겼습니다.":"");
		System.out.println(com==user ? "비겼습니다.":"");
		System.out.println(com-user==-1 || com-user==2 ? "사용자가 이겼습니다.":"");
		
		/*
		 * 	나올 수 있는 경우의 수
		 * 	컴퓨터	-	 사용자		결과
		 * 	------------------------------
		 * 	가위(0)	-	가위(0)	=> 비겼다(0)
		 * 	가위(0)	- 	바위(1) 	=> 사용자 승(-1)
		 * 	가위(0)	-	보(2)	=> 컴퓨터 승(-2)
		 * 	------------------------------
		 * 	바위(1)	-	가위(0)	=> 컴퓨터 승(1)
		 * 	바위(1)	- 	바위(1)	=> 비겼다(0)
		 * 	바위(1)	- 	보(2)	=> 사용자 승(-1)
		 * 	------------------------------
		 * 	보(2)	-	가위(0)	=> 사용자 승(2)
		 * 	보(2)	-	바위(1)	=> 컴퓨터 승(1)
		 * 	보(2)	-	보(2)	=> 비겼다(0)
		 * 
		 */
		
	}

}

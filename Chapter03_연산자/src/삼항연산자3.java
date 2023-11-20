
// 1월 ~ 12월 => 사계절(봄, 여름, 가을, 겨울)
import java.util.Scanner; // 
public class 삼항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); // 입력 값 받기
		System.out.println("월 입력(1~12):"); // 입력 값을 받기 위해 출력
		int month=scan.nextInt(); // 정수 입력 값
		
		System.out.print(month+"월은 "); // print : 줄 바꿈 없이 출력
		System.out.print(month>=3 && month<=5?"봄입니다.":"");
		System.out.print(month>=6 && month<=8?"여름입니다.":"");
		System.out.print(month>=9 && month<=11?"가을입니다.":"");
		System.out.print(month==12 || month==1 || month==2?"겨울입니다.":"");
	}

}

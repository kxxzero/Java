
// AND 연산자, OR 연산자 효율적 처리
public class 이항연산자_논리연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		
		boolean bChcek= a<b && ++b==a; // AND 연산자
		System.out.println("b="+b); // 앞의 조건이 false이기 때문에 뒤의 조건은 실행하지 않아 b=9
		
		boolean bCheck= a<b || ++b==a; // OR 연산자
		System.out.println("b="+b); // 앞의 조건이 false이기 때문에 뒤의 조건을 확인하기 위해 실행하여 b=10;
	}

}

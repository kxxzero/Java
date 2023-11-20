
// 상수 연산
public class 이항연산자_대입연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int A=10; // 상수 선언 시 final 입력과 상수명은 대문자로 작명
		int b=A*20; // 상수는 값을 변경할 수 없기 때문에 새로운 변수를 선언해서 사용
		System.out.println(b); // 200
		b=A/3;
		System.out.println(b); // 3
	}

}

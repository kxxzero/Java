
// byte < char < int < long < float <double
// int 이하(byte, char, short) 데이터형은 연산 시 int 결과값을 도출
public class 이항연산자_산술연산자6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'A';
		System.out.println("a="+a); // 데이터형을 문자형 → 정수형으로 변환(자동형변환)
		
		double b = 100;
		System.out.println("b="+b); // 데이터형을 정수형 → 실수형으로 변환(자동형변환)
		
		System.out.println('A'+10); // 같은 데이터형끼리만 연산 가능 => 65+10=75
		
		System.out.println('A'+'B'); // 65+66=131
		
		System.out.println(100+10.5+10.5f+'A'); // 가장 큰 데이터형의 타입으로 변환 => 186.0
		
	}

}

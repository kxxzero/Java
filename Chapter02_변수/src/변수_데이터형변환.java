
public class 변수_데이터형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int _int=(int)100.1234; // (int) : 소수점 이하 제거 => 실수형 타입의 데이터를 정수 타입으로 변환(강제형변환) 
		System.out.println(_int); // 100
		
		
		System.out.println((int)'0'); // 48 => 문자 '0'=48, 'A'=65, 'a'=97
		System.out.println('A'+1); // 66
		
		
		byte _byte=(byte)300;
		System.out.println(_byte); // 44 => 00101100
		System.out.println(0b00101100); // 44 => ob : 10진법으로 출력
		
		
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);
		System.out.println(b3); // 30
		System.out.println(Integer.toBinaryString(30)); // 11110
	}

}

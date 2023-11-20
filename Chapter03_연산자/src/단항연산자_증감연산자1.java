
// 전치 연산자, 후치 연산자
public class 단항연산자_증감연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a; // 전치 연산자 : a 증가 후 b에 a값 대입 => a=11, b=11
		
		System.out.println("a="+a+", b="+b); // a=11, b=11
		
		a=10;
		b=a++; // 후치 연산자 : b에 a값 대입 후 a 증가 => a=11, b=10
				
		System.out.println("a="+a+", b="+b); // a=11, b=10
	}

}

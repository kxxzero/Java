
// 전치 연산자, 후치 연산자
public class 단항연산자_증감연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=a++; // b = 10
		System.out.println("a="+a+", b="+b);
		
		a=10;
		b=++a + ++a + a++; // b = 11 + 12 + 12 = 35
		System.out.println("a="+a+", b="+b); // a=13, b=35
		
		a=10;
		b=a++ + a++ + ++a; // b = 10 + 11 + 13 = 34
		System.out.println("a="+a+", b="+b); // a=13, b=34
		
		a=10;
		b=++a + a++ + ++a + a++; // b = 11 + 11 + 13 + 13 = 48
		System.out.println("a="+a+", b="+b); // a=14, b=48
		
		a=10;
		b=a++ + a++ + a++ + a++; // b = 10 + 11 + 12 + 13 = 46
		System.out.println("a="+a+", b="+b); // a=14, b=46

		a=10;
		b=a-- + a++ + --a + a++; // b = 10 + 9 + 9 + 9 = 37
		System.out.println("a="+a+", b="+b); // a=10, b=37
	}

}

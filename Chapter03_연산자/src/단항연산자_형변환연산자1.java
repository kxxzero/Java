
// 자동형변환, 강제형변환
public class 단항연산자_형변환연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=65;
		double d=(double)a; // 자동형변환(UpCasting)
		char c=(char)a; // 강제형변환(DownCasting) => 실제 값만 적용할 경우 형변환 연산자 생략이 가능하나, 연산 처리가 된 경우에는 생략 불가
		
		System.out.println("a="+a); // a=65
		System.out.println("d="+d); // d=65.0
		System.out.println("c="+c); // c='A'
		
		c='0'; // '0' = 48
		System.out.println("c="+(int)c); // c=48
		

//		int i=10;
//		int j=55;
//		char c1=10;
//		char c2=i+j; // 연산 처리 시 자동형변환 불가
				
	}

}

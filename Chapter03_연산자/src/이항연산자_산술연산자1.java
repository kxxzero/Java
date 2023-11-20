
// 1 ~ 100 => 3개 정수 => 총합, 평균
public class 이항연산자_산술연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=(int)(Math.random()*100)+1; // Math.random() : 0.0 ~ 0.99 사이의 실수 값을 랜덤으로 제공 
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		int total=a+b+c;
		double avg=total/3.0;
		
		System.out.println("a:"+a+", b:"+b+", c:"+c);
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n", avg); // %.2f : 소수점 2자리까지만 출력
	}

}

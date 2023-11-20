
// 랜덤 정수 발생 => 비교
public class 이항연산자_비교연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a+", b="+b);
		
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));

	}

}


// 1 ~ 100 => 짝수, 홀수 구분
public class 삼항연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		System.out.println("a="+a+", " + (a%2==0?"짝수":"홀수"));
	}

}


// 짝수, 홀수 
public class 이항연산자_논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		boolean bCheck=(a%2==0) && (b%2!=0); // (짝수) && (홀수)
		System.out.println(bCheck); // false
		
		bCheck=(a%2==0) || (b%2==0); 
		System.out.println(bCheck); // true
	}

}

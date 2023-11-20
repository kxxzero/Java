
// 369만원 화폐 매수 구하기 => 배수
public class 이항연산자_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=369; // 3백 6십 9만원
		int num100=money/100; // 3
		int num10=(money%100)/10; // 6
		int num1=money%10; //9
		
		System.out.println("백단위:"+num100+" 십단위:"+num10+" 일단위:"+num1);
	}

}


// 성별 구분
public class 삼항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gender=(int)(Math.random()*4)+1; // 1 ~ 4
		System.out.println("gender="+gender+", "+(gender%2==0?"여자":"남자"));
	}

}

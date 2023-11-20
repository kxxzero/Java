
// 대소문자 구분
public class 삼항연산자4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a'; // 임의의 초기값 설정
		char c=(char)((Math.random()*26)+65); // char로 변경할 부분 전체 괄호 묶기 => 'A' ~ 'Z'
		System.out.println(c+(c>='A'&& c<='Z' ? "는(은) 대문자입니다." : "는(은) 소문자입니다."));
		
		int s=(int)(Math.random()*2); // 0, 1
		ch= s==0? c : (char)(c+32); // s==0일 때 c 출력 : s!=0일 때 (char)(c+32) 출력 => 'A' + 32 => 'a' = 97
		System.out.println(ch>='A' && ch<='Z' ? (ch+"는(은) 대문자입니다.") : (ch+"는(은) 소문자입니다."));
	}

}

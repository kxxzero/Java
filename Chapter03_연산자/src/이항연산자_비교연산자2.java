
// 랜덤 알파벳 발생 => 비교
public class 이항연산자_비교연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c=(char)((Math.random()*26)+65); // 'c'부터 26(알파벳 개수)개를 랜덤으로 발생
		char d=(char)((Math.random()*26)+65); // 'c'부터 26(알파벳 개수)개를 랜덤으로 발생
		System.out.println("c="+c+", d="+d);
		
		System.out.println("c==d:"+(c==d));
		System.out.println("c!=d:"+(c!=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c<=d:"+(c<=d));
		System.out.println("c>=d:"+(c>=d));
	}

}

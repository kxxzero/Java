
// 부정연산자 : !
public class 단항연산자_부정연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck = true;
		System.out.println("변경 전:"+bCheck); // 변경 전:true
		
		bCheck=!bCheck; // 부정연산자(!)는 boolean에서만 사용
		System.out.println("변경 후:"+bCheck); // 변경 후:false
	}

}

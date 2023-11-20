
// 국어, 영어, 수학 => 총점, 평균
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=89, eng=90, math=87;
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
	}

}
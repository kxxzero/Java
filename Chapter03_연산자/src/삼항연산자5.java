
// 국어, 영어, 수학 => 총점, 평균, 학점
import java.util.Scanner;
public class 삼항연산자5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int kor, eng, math;
		int total;
		double avg;
		
		// 변수 초기화
		Scanner scan=new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수 입력(예: 90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		
		// 연산 처리
		total=kor+eng+math;
		avg=total/3.0;
		
		// 결과 출력
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n", avg);
		
		// 학점
		System.out.print(avg>=90 && avg<=100?"A 학점":"");
		System.out.print(avg>=80 && avg<90?"B 학점":"");
		System.out.print(avg>=70 && avg<80?"C 학점":"");
		System.out.print(avg>=60 && avg<70?"D 학점":"");
		System.out.print(avg<60?"F 학점":"");
		
	}

}

import java.util.Date;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date(); // Date 객체를 생성해서 그 주소를 today에 저장 참조형 변수
		
			final int  MAX_SPEED = 0; // 상수 int type MAX_SPEED를 선언하고 초기화 하였다.
												//(상수를 선언할때는 대문자로 작성한다) 또 상수는 선언과 동시에 초기화를 하여하 한다.
												// 여러 단어로 이루어 지는 경우는 _ 를 붙여서 구분짖는다
			final int WIDTH = 30;
			final int HEIGHT = 20;
			int triangle = (WIDTH * HEIGHT) / 2; // 삼각형 면적 구하기 코드 상수를 이용하여 작성
			int rectangle = (WIDTH * HEIGHT); // 사각형 면적 구하는 코드 상수를 이용하여 작성
		
			System.out.println(triangle);
			System.out.println(rectangle);
		

	}

}

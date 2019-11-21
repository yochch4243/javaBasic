package a_variable;

//주석 : 프로그램 코드로 인식하지 않는문장(주로 코드를 설명하는데 사용한다.)
//한줄 주석 : //로 시작 ctrl +shift + c
/* 범위 주석   : ctrl +shift + / (해제 : )*/

//클래스(class) : 데이터와 처리내용의 집합
//사용하고 싶은 클래스, 데이터, 처리내용 등이 있는 경우 선언을 통해 의사표현을 해야한다.
//선언 : 사용하고자 하는 것의 종류와 이름을 컴퓨터에게 알려주는 것.

public class ABC {
	//{} : 블럭(내용의 범위)
    
	//변수 : 데이터
	int variable; //;(세미콜론) : 문장의 마침표

	//메서드(method) :기능(처리)
	//main 메서드 : 프로그램의 시작과 끝
	public static void main(String[] args) {
		//블럭이 시작되면 Tab(탭) 1칸을 계층을 표현(계층을 쉽게 구분하기 위해)
		//코드는 기본적으로 위에서 아래로 왼쪽에서 오른쪽으로 실행된다.
		//실행할 문장을 메서드 안에 넣는다.
		/*System.out.println("Hello"); //괄호안에 있는 내용을 콘솔창에 출력하는 메서드
		System.out.print("Hello"); //줄바꿈을 하지 않는다.
		System.out.print("Hello"); //줄바꿈을 하지 않는다.
		*/
		//코딩 : 코드를 작성하는 것
		//main메서드의 마지막 문장까지 수행되면 프로그램은 종료된다.
		
		//예약어(키워드) : 자바에서 사용하는 특별한 의미와 기능을 가진 단어. 진하고 굵은 글씨체
		
		//코드는 영문을 사용하기 위해 영타연습이 필요하다. 최소한 200타이상 나오도록 연습하즈아.
		int x = 10, y= 20;
		int tmp = 0;
		System. out. println("x:"+ x + "y:" + y);
	}

}
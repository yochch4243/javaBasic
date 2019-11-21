package a_variable;

public class Variable {

	public static void main(String[] args) {
		/*
		 * << 변수 >>
		 * -하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 기본형 데이터의 종류>>
		 * -정수 : byte, short, int(주로 사용), long
		 * -실수 : float, double(더 정확)
		 * -문자 : char(character)
		 * -논리 : boolean
		 * 
		 * byte = 8bit
		 * -데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 *  그것의 이름이 무엇인지 알려줘야 한다.
		 * -명명규칙은 자바의정석 25~26 참조
		 */
		
		//변수 선언 방법 : 데이터타입 + 변수이름
		byte abc;
		char moonja;
		
		//모든 기본형타입을 사용해서 8개의 변수를 선언해주세요.
		byte apple;
		char grape;
		long pineapple;
		boolean orange;
		short banana;
		float pear;
		int peach;
		double lime;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
//		System.out.println(apple); //컴파일 에러발생(문법이 틀렸다)
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		//=(대입 연산자) : 대입연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		apple = 127; //타입에 맞는 값을 저장해야 한다.
		//byte의 경우 -128~127사이의 값만 허용
		banana = 30000;
		peach = 20;
		pineapple = 900L; //long 접미사 : L 대문자 사용권장
		pear = 3.14f; //float 접미사 : f
		lime = 3.14; //double 접미사 : d(생략가능)
		grape = '가'; //char : '(따옴표)로 묶어서 표현
		orange = true;
		//초기화 : 변수에 처음으로 값을 지정하는 것.
		
		System.out.println(peach);
		//ctrl + F11 : 프로그램 실행
		//F11 : 디버그 모드 실행 - 원하는 지점에서 한줄한줄 실행가능.
		
		peach = 30;
		System.out.println(peach);
		peach = 30 + 40; //최종 연산값이 나옴
		System.out.println(peach);
		peach = banana;
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요
		apple = 100;
		banana = 29000;
		peach = 300;
		pineapple = 10000L;
		pear = 2.95f;
		lime = 8.92;
		grape = '말';
		orange = false;
		System.out.println(apple);
		System.out.println(banana);
		System.out.println(peach);
		System.out.println(pineapple);
		System.out.println(pear);
		System.out.println(lime);
		System.out.println(grape);
		System.out.println(orange);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스.
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd"); //new String 생략가능
		System.out.println(_String);
		_String ="1234";
		System.out.println(_String);
		
		/*
		 * <<리터럴의 종류>>
		 * 숫자 : 0, 10 , -5, 3.14
		 * 문자 : '가', 'a', '0', ' '
		 * 문자열 : "가나다", "abc", "123", " ", ""
		 * 그 외 : true, false, null(값이 없다)
		 * 
		 * << 참조형 타입 >>
		 * -기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 직접 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는값.
		//전역변수 : 메서드 밖에 있는 값. 메서드에 구애받지않고 사용. 초기화를 하지않아도 자동으로 초기화 - 기본값(0)으로 초기화
		//지역변수 : 메서드 안에 있는 값. 메서드에 한정되어서 사용
		apple = 0;
		banana = 0;
		peach = 0;
		pineapple = 0L;
		pear = 0.0f;
		lime = 0.0;
		grape = '\u0000'; //' '
		orange = false;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		apple = 127;
		peach = 128;
		apple = (byte)peach; //형변환 : 데이터 타입을 변환하는것 =뒤에 있는것을 앞의 값으로 변환.
		System.out.println(apple); //128 -> -128 (오버플로우) 초과된 값만큼 역으로 변환
		apple = -128;
		peach = -129;
		apple = (byte)peach;
		System.out.println(apple); //-129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		//double 타입에서 int 타입으로 형변환해서 출력하시오.
		lime = 3.9;
		peach = 80;
		peach = (int)lime;
		System.out.println(peach); //int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		peach = apple;
		pineapple = peach;
		lime = peach;
		lime = pear;
		
		/*
		 * <<상수>>
		 *
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER =10;
		 * - 리터럴에 의미를 부여하기 위해서 사용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; //상수를 바꾸려고 하니 컴파일 에러 발생
		
		System.out.println(MAX_NUMBER);
		
		 
	}
	
}

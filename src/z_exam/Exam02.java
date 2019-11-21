package z_exam;

public class Exam02 {

	public static void main(String[] args) {
		/*[2-1] 다음 표의 빈 칸에 개의 기본형 을 알맞은 자리에 넣으시오 8 (primitive type) .
		크 기
		종 류
		1 byte 2 byte 4 byte 8 byte
		논리형 : boolean (1byte)
		문자형 : char (2byte)
		정수형 : byte (1byte), short (2byte), int (4byte), long (8byte)
		실수형 : float (4byte), double (8byte)
		[2-2] 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형(data type)을 선택해야 할까?
		 		regNo라는이름의 변수를 선언하고 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.
		 		자료형 : long
		 		long regNo = 9207231496618L;
		 		
		 		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
	int i = 100;
	long l =100L;
	final float PI = 3.14f;
	- 리터럴 : 100L, 3.14f
	- 변수 : i, l
	- 키워드 : int, long , float,  final
	- 상수 : PI
[2-4] 다음 중 기본형(primitive type)이 아닌 것은? B
a. int
b. Byte (대문자 -> 클래스)
c. double
d. boolean
[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
류’라고 적으시오.
System.out.println(“1” + “2”) → ("12" )
System.out.println(true + “”) → ("true" )
System.out.println(‘A' + 'B') → (131) 'A'는 65의 값을 가지고 'B'는 66의 값을 가진다
System.out.println('1' + 2) → (51) '1'은 49의 값을 가진다.
System.out.println('1' + '2') → (99) 49 + 50
System.out.println('J' + “ava”) → ("java") 문자열과 합칠경우 앞의 'J'가 "j"로 변환된다.
System.out.println(true + null) → ( )
6 Java의 정석定石 3판 - 연습문제 풀이
[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)  b, c, d, e
a. if
b. True
c. NULL
d. Class
e. System
[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오) a, d, e, g
a. $ystem - $, _기호는 사용가능
b. channel#5 - #은 기호로 사용할 수 없다
c. 7eleven - 앞에 숫자로 시작할 수 없다
d. If- 가능
e. 자바 - 가능
f. new - 예약어라서 사용불가
g. $MAX_NUM - 사용가능
h. hello@com - @는 기호로 사용 불가능
[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
르시오) a, d - 참조형변수는 4byte형식이기 때문에 4byte의 int, float 타입이 가능하다
a. int
b. long
c. short
d. float
e. double
[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) -> 형변환 생략은 표현범위가 작은타입에서 큰 타입으로 변환할때 가능하다.
byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;
a. b = (byte)i; 불가능
b. ch = (char)b; 불가능
c. short s = (short)ch; 불가능 -> short와 char은 같은 2byte 값을 보유하지만 서로의 오차범위가 달라서 생략할 수 없다.
d. float f = (float)l; 가능 -> long은 8byte, float는 4byte지만 정수형이 실수형보다 오차범위가 더 크기 때문에 float의 범위가 long보다 더 크다 따라서 형변환생략가능
e. i = (int)ch; 가능
[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오) 0 ~ 65535
Java의 정석定石 3판 - 연습문제 풀이 7
[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
a. byte b = 256; x -> byte는 -128부터 127까지의 숫자만 가능하다
b. char c = ''; x -> ''안에는 문자 1개가 꼭 들어가야 함
c. char answer = 'no'; x -> ''안에는 문자 1개만 들어가야함 2개는 들어갈 수 없다
d. float f = 3.14 x -> float변수를 초기화하기 위해서는 리터럴뒤에 f삽입필요
e. double d = 1.4e3f; o
[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오)-> 나중에 배움
a. public static void main(String[] args)
b. public static void main(String args[])
c. public static void main(String[] arv)
d. public void static main(String[] args)
e. static public void main(String[] args)
[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
a. boolean - false -> o
b. char - '\u0000' -> o
c. float - 0.0 -> x -> 0.0f가 올바른 표현
d. int - 0 -> o
e. long - 0 -> x -> 0L이 올바른 표현
f. String - "" x -> String의 기본값은 null이다
		 		
		*/
	}

}

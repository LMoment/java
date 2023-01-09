package ch06;

/* final(마지막) : 클래스, 필드 (인스턴스 변수), 메소드
 * 
 * 	1. 클래스 : sub 클래스가 없는 클래스
 * 	2. 필드 : 상수 선언 (필드, 매개변수, 지역변수)
 * 	3. 메소드 : Override 불가능
 * 
 * etc. 
 *  Override : 상위 클래스에서 정의한 메소드를 하위 클래스 다시 재정의* 
 */


final class Final1 {}

//class Final2 extends Final1{}

class Final3 {
	
	// Argument
	final int KIA = 1;
	final int SK = 2;
	
	int k;
		
	public Final3() {
//		KIA = 2;
		System.out.println(k);
	}
	
	public void prn(final int a) {
//		a = 10;
		final int b = 10; // 지역 변수(local variable)
//		b = 20;
		
		int c;
		
//		System.out.println(c); // 데드 코드. 메소드 안에서 변수를 정의는 할 수 있지만 출력은 할 수 없다.
	}
}

class Final4 {
	void prn1() {}
	final void prn2() {}
}

class Final5 extends Final4 {
	//@Override
	void prn3() {} // prn3은 부모 클래스가 없기 때문에 Override가 있으면 오류가 발생한다.
	
	@Override
	void prn1() {} // Override 가능하다. 부모 클래스가 있기 때문에.
	
//	@Override
//	void prn2() {} // Override 불가능하다. 부모 클래스는 있지만 final로 인해 오류가 발생한다.
}


public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}

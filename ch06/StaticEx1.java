package ch06;

/* static : 필드, 메소드, 클래스(부분)
 * 
 *  static 필드 및 메소드는 객체를 생성하지 않아도 사용 가능하다.
 *  
 *  사용시점 : 클래스 이름으로 접근하기 때문에 그때 메모리에 로딩한다.
 *  */

/*static*/class Static1 { // static을 붙이면 에러가 발생한다.
	static int i = 0;
	int j = 0;
	
	static void prn1() {}
	void prn2() {}
	
	static class Inner{} // 내부 클래스 앞에는 static 올 수 있다.
}

public class StaticEx1 {

	public static void main(String[] args) {
		int a = Math.abs(-6);
		int b = (int)Math.round(3.14);
		
		Integer i = new Integer(22);
		int c = i.parseInt("23");
		int d = Integer.parseInt("23");
		
		// 반지름이 5인 원의 넓이를 구하시오.
		System.out.println(5*5*Math.PI);
	}

}

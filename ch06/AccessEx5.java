package ch06;

// java.awt.Frame에 paramString의 결과 값을 출력하시오.

import java.awt.Frame;

class Access5 extends Frame {
	public Access5() {
		System.out.println(paramString());
	}
}

public class AccessEx5 {

	public static void main(String[] args) {
		
		Access5 ad = new Access5();
		
	}

}
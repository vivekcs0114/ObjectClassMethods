/* automatic promotion  in overloading*/
package com.avalia.overloading;

public class OverloadingCase4 {
	public char method(byte b){
		return 'b';
	}
	public char method(int i){
		return 'i';
	}
	public char method(float f){
		return 'f';
	}

}

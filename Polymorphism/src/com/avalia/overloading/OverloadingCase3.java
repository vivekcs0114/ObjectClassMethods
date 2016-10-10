package com.avalia.overloading;

public class OverloadingCase3 {
	public char method(){
		return 'n';
	}
	public char method(int i){
		return 'i';
	}
	public char method(double d){
		return 'd';
	}
	public char method(float f){
		return 'f';
	}
	public char method(char c){
		return 'c';
	}
	public char method(long l){
		return 'l';
	}
}

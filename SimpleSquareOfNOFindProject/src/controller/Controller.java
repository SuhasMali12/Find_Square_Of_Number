package controller;

import service.Service;

public class Controller {
	
	void m1() {
		Service ss=new Service();
		int Sq=ss.m1();
		System.out.println(Sq);
	}
	
	public static void main(String[] args) {
		Controller cc=new Controller();
		cc.m1();
	}

}

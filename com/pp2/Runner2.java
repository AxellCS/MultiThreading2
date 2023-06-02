package com.pp2;

//La clase Runner2 implementa de la interfaz Runnable
public class Runner2 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++)
			System.out.println("Runner 2: " + i);
	}

}

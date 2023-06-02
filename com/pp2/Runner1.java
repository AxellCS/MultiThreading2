package com.pp2;

//La clase Runner1 implementa de la interfaz Runnable
public class Runner1 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10;i++)
			System.out.println("Runner 1: " + i);
	}

}
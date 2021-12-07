package com.Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] temperaturas = new double[365];

		temperaturas[0] = 30.1;
		temperaturas[1] = 31.1;
		temperaturas[2] = 32.1;
		temperaturas[3] = 33.1;
		temperaturas[4] = 33.1;
		temperaturas[5] = 34.1;
		
		
		for (int i = 0; i<temperaturas.length; i++) {
			System.out.println("A temperatura do dia e " + i  + temperaturas[i]);
		}

	}

}

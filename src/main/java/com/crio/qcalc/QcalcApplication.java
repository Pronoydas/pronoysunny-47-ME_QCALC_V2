package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class QcalcApplication {

	public static void main(String[] args) {
		//StandardCalculator.getVersion();
	
LogicCalculator calc = new LogicCalculator();

calc.AND(8, 6);

calc.printResult();

		

	}

}

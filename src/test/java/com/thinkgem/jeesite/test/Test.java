package com.thinkgem.jeesite.test;

import com.thinkgem.jeesite.TheadYinHang.Bank;
import com.thinkgem.jeesite.TheadYinHang.PersonOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

//		Station station = new Station("ONE");
//		Station station1 = new Station("TWO");
//		Station station2 = new Station("THREE");
//
//
//		station.start();
//		station1.start();
//		station2.start();
		List<Object> objects = Collections.synchronizedList(new ArrayList<Object>());

		Bank bank1 = new Bank(new PersonOne("小王",12));
		Bank bank2 = new Bank(new PersonOne("小李",13));

		Thread one = new Thread(bank1);
		Thread two = new Thread(bank2);
		one.start();
		two.start();

	}
}

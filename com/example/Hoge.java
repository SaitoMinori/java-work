package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Hoge {
	public static void main(String[] args) {
		// int i = 1;
		// int j = 3;
		// String hoge = "hogehoge";

		// System.out.println(i + j);
		// System.out.println(hoge + i);

		List<Integer> hoge = new ArrayList<>();
		hoge.add(123);
		hoge.add(658);
		hoge.add(2345);
		hoge.add(9876);

		for (int i = 0; i < hoge.size(); i++) {
			System.out.println(hoge.get(i));
		}

		Map<Integer, String> moge = new TreeMap<>();
		moge.put(10, "g89778");
		moge.put(99, "ge");
		moge.put(4, "ge45");
		moge.size();

		// System.out.println(moge.get(9));
		for (Integer foo : moge.keySet()) {
			System.out.println(foo);
		}

		for (String fooooo : moge.values()) {
			System.out.println(fooooo);
		}

		System.out.println("AAAAA");

		Map<Integer,String> coge = new HashMap<>();
		coge.put(51, "gajgalkgj8");
		coge.put(1000, "gjojkj");
		coge.put(34, "plplplp");
		coge.size();

		for (Integer co : coge.keySet()){
			System.out.println(co);
		}
	}
}

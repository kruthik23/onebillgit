package com.onebill.assessment4;

import java.util.TreeSet;

public class DescendTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(4);
		ts.add(1);
		ts.add(8);
		ts.add(6);
		TreeSet<Integer> desc = (TreeSet<Integer>) ts.descendingSet();
		System.out.println(desc);
	}
}
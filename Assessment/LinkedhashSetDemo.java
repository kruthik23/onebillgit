package com.onebill.assessment4;


	import java.util.LinkedHashSet;
	import java.util.Set;

	public class LinkedhashSetDemo{
		public static void main(String[] args) {
			Set<String> set = new LinkedHashSet<String>();
			set.add("abc");
			set.add("def");
			set.add(null);
			set.add("lkj");
			set.add(null);//linkedhashset accepts only one null
			System.out.println(set);
		}

	}


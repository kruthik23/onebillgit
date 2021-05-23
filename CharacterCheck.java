package com.onebill;

import java.util.Scanner;

public class CharacterCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char Inputcharcter;
		do {
			System.out.println("enter input characte\t");
			Inputcharacter=sc.nextLine();
			if(Inputcharcter=="nnn")
				break;
			else 
				continue;
			
		}while(true);
	}

}

package com.onebill.ppt;

public class IslandOfIsolation {
	IslandOfIsolation i;
	public static void main(String[] args) {
	IslandOfIsolation	 t1= new IslandOfIsolation ();
	IslandOfIsolation t2 =new IslandOfIsolation();
	IslandOfIsolation t3=new IslandOfIsolation();
		t1.i=t2;
   t2.i=t3;
   t3.i=t1;
   t1=null;
   t2=null;
  t3=null;
		System.gc();
	}
	 protected void finalize()
	 {
		 System.out.println("collected");
	 }
}

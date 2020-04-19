package com.class30;

import java.util.Iterator;
import java.util.Set;


public class StoringDifferentObjects {

	public static void main(String[] args) {
		
	Set<Insurance> hset =new HashSet<>();
		hset.add(new Car("Geico","BMW"));
		hset.add(new Pet("Progressive","Dog"));
		hset.add(new Health("BCBS"));
		
			System.out.println(hset.size());
			
			Iterator<Insurance> it= hset.iterator();
			while (it.hasNext()) {
				//insureance obj=new Car("Geico","BMW")
				//we need to assing it to the variable becuse if we use it.next()-->move to the next elemrn
				Insurance obj =it.next();
				obj.getClass();
				obj.cancelInsurance();
				obj.method();
				System.out.println("---------------------");
			}
			
	}

}

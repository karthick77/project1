package com.colw.cworks;

import java.util.Comparator;

public class ComapratorPrice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Laptops l1 = (Laptops)o1;
		Laptops l2 = (Laptops)o2;

		if(l1.price > l2.price) {
			return +1;
		}else if(l1.price < l2.price) {
			return -1;
		}else
			return 0;
}

}

package com.mdrain.logic;

import java.util.ArrayList;

public final class PageAccessCollection {

	public static ArrayList<String> pageCollection() {
		
		ArrayList<String> pageCollection = new ArrayList<String>();
		
		pageCollection.add("shop.jsp");
		pageCollection.add("printers.jsp");
		pageCollection.add("plastic.jsp");
		pageCollection.add("tph.jsp");
			
		return pageCollection;
			
	}
}

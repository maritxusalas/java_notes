package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		//Map mm1 = new HashMap(); //ORDENADOS
		//Map mm1 = new LinkedHashMap(); //COMO LOS HAS INTRODUCIDO
		//Map mm1 = new TreeMap(); //TIENEN QUE SER DEL MISMO TIPO
		Map mm1  = new Hashtable();
		mm1.put(2, "Lex");
		mm1.put(1, "Ajay");
		mm1.put(3, "Steven");
		mm1.put("Abc", "Neena");
		System.out.println(mm1);


	}

}

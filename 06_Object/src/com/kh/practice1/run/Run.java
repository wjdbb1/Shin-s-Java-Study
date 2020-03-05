package com.kh.practice1.run;

import com.kh.practice1.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product pd = new Product();

		pd.setpName("°¡¹æ");
		pd.setPrice(3000000);
		pd.setBrand("GUCCI");

		System.out.println(pd.information());

		/*
		 * String pName = ""; int price = 3; String brand = "";
		 */
	}

}


		Scanner input = new Scanner(System.in);
		System.out.print("받은돈");
		double x = input.nextDouble();
		System.out.print("상품총액");
		double y = input.nextDouble();
		// System.out.println("받은돈" + x);
		
		// System.out.println("상품총액" + y);
									
					
		double sum1;
		double sum2;
		
		sum1 = y * 10/100;
		sum2 = x - y;
		
		System.out.println("부가세" + sum1);
		System.out.println("잔돈" + sum2);
		
	}
		
}
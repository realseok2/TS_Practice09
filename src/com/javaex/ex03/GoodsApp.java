package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

//		boolean exit = true;
		int csum = 0;
		int psum = 0;

		Scanner sc = new Scanner(System.in);

		List<Goods> gList = new ArrayList<Goods>();

		System.out.println("확인하고자 하는 상품을 입력해 주세요 (종료 q)");
		System.out.println("제품명, 가격, 수량 순으로 입력해 주세요.");

		while (true) {
			System.out.print("-");
			String Line = sc.nextLine();
			String gArray[] = Line.split(",");
			if (Line.equals("q")) {
				System.out.println("[입력완료]\n===============");
				for (int i = 0; i < gList.size(); i++) {
					gList.get(i).showInfo();
					csum = csum + gList.get(i).getCount();
					psum = psum + gList.get(i).getPrice() * gList.get(i).getCount();

				}
				System.out.println("[ Total ] ");
				System.out.println("모든 상품의 갯수는 " + csum + "개입니다.");
				System.out.println("모든 상품의 합계 금액은 " + psum + "원입니다.");
				break;

			} else if (gArray.length == 3) {

				String name = gArray[0];
				int price = Integer.parseInt(gArray[1]);
				int count = Integer.parseInt(gArray[2]);

				Goods good = new Goods(name, price, count);
				gList.add(good);
				System.out.println("[ 상품이 등록되었습니다. ]");
			} else {
				System.out.println("잘못입력하였습니다.");
			}

		}

		sc.close();

	}

}

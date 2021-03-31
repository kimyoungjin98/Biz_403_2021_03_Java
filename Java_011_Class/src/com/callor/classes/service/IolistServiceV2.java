package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 input method를 재 정의한다 매입단가, 매출단가는 반드시 0 이상 이어야 한다 유효성 검사를 하도록 코드를 재 정의 한다
	 */
	@Override
	public void input() {
		// TODO 매입매출 등록

		System.out.println("==============================");
		System.out.println("매입 매출 등록");
		System.out.println("-------------------------------");
		System.out.print("상품명 >> ");
		String pname = scan.next();

		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> ");
		String dname = scan.next();

		System.out.print("매입 매출 구분 >> ");
		String inout = scan.next();

		System.out.print("수량 >> ");
		Integer qty = scan.nextInt();

		// 매입단가와 매출단가는 0이상만 입력한다
		// 매입단가가 0이상이면 다음 항목입력받도록
		// while문을 중단하고
		// 매입단가가 0미만이면 계속해서
		// 반복문 내에서 입력을 받도록
		Integer iprice = 0;
		while (true) {
			System.out.print("매입 단가 >> ");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("매입단가는 0 이상 입니다");
			} else {
				break;
			}
		}

		Integer oprice = 0;
		while (true) {
			System.out.println("매출 단가 >> ");
			oprice = scan.nextInt();
			if (oprice < 0) {
				System.out.println("매출단가는 0 이상 입니다");
			} else {
				break;
			}
		}

		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		iolistVO.setQty(qty);

		this.printIolist(iolistVO);

		iolist.add(iolistVO);

	}

}

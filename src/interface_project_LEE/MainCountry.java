package interface_project_LEE;

import interface_project_MOON.sum_MOON;

public class MainCountry {

	public static void main(String[] args) {

		Object[] testMemberObjects = new Object[2];

		sum_LEE Lee = new sum_LEE();

		sum_MOON Moon = new sum_MOON();
		
		System.out.println("한솔씨 다녀온 나라 정보");
		Lee.place("장소");
		Lee.food("음식");
		Lee.price("가격");
		Lee.time("시간");
		System.out.println("다녀온 나라에서 가져온 선물 : " +Lee.present);
		System.out.println("다녀온 나라 화폐 : " + Lee.money);
		
		System.out.println();
		
		System.out.println("정섭씨 다녀온 나라 정보");
		Moon.place("장소");
		Moon.food("음식");
		Moon.price("가격");
		Moon.time("시간");
		System.out.println("다녀온 나라에서 가져온 선물 : " + Moon.present);
		System.out.println("다녀온 나라 화폐 : " + Moon.money);
		

//
	}

}

package kioskPrint;

import kioskMember.MemberScan;
import kioskMenu.MenuScan;

public class KioskPrint extends MemberScan {

    public KioskPrint(){
        printStart();
    }

    //1) 환영 멘트
    private void printStart() {
        System.out.println("\n[ Cafe STARBUCKS 에 오신걸 환영합니다. ]");
        printMenuCate();
    }

    //2) 메뉴카테고리 옵션선택
    private void printMenuCate() {
        System.out.println("-------------------------");
        System.out.println("아래에서 메뉴카테고리을 골라 입력해주세요.\n");
        System.out.println("1. DrinkMenu 보기\n2. FoodMenu 보기");

        //MenuScan 클래스로부터 입력받기
        System.out.print("\n입력 : ");
        new MenuScan().scan();
    }

    //3)
    private void printDrinkMenu(){

    }
    //4) 메뉴 주문하기
    private void printOrderOpt() {
        //OrderScan

    }


//    private void printPaymentOpt() {
//        //4) 결제방식 옵션선택
//    }
}


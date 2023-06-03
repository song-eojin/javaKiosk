package kioskPrint;

import kioskMember.memberFlow.Member01_Scan;
import kioskMenu.menuFlow.Menu01_Scan;

public class KioskPrint extends Member01_Scan {

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
        System.out.println("\n-------------------------");
        System.out.println("아래에서 메뉴카테고리을 골라 입력해주세요.\n\n");
        System.out.println("1. DrinkMenu 보기\n2. FoodMenu 보기");

        //MenuScan 클래스로부터 입력받기
        System.out.print("\n입력 : ");
        new Menu01_Scan().scan();
    }

    //3)
    private void printMenuPan(){

    }
    //4) 메뉴 주문하기
    private void printOrderOpt() {
        //OrderScan

    }


//    private void printPaymentOpt() {
//        //4) 결제방식 옵션선택
//    }
}


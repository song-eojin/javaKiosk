import ch2.kioskMember.memberFlow.Member01_Scan;

public class KioskPrint {

    /*1) 회원/비회원 선택*/
    private void printMemberOpt() {
        System.out.println("\n-------------------------");
        System.out.println("(KioskPrint)\n");

        System.out.println("아래에서 주문방식을 골라 입력해주세요.");
        System.out.println("1. 비회원주문\n2. 회원주문");

        //Member01_Scan 클래스로부터 입력받기
        Member01_Scan scan = new Member01_Scan();
        scan.memberOptScan();
    }

    //2) 메뉴카테고리 옵션선택
    private void printMenuOpt() {
        System.out.println("\n-------------------------");
        System.out.println("아래에서 메뉴카테고리을 골라 입력해주세요.\n\n");
        System.out.println("1. DrinkMenu 보기\n2. FoodMenu 보기");

        //MenuScan 클래스로부터 입력받기
        new Member01_Scan();
    }

    //3) 메뉴 주문하기
    private void printOrderOpt() {

        //OrderScan
    }


    private void printPaymentOpt() {
        //4) 결제방식 옵션선택
    }
}


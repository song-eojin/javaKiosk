package kioskMember.memberFlow;

import java.util.Scanner;

/*회원/비회원 을 선택하는 클래스*/
public class Member01_Scan {
    private final Scanner scanner = new Scanner(System.in);
    private static int memberOpt;
    private static String name;
    private static String phoneFront;
    private static String phoneBack;

    private void setMemberOpt(int memberOpt) {
        this.memberOpt = memberOpt;
    }
    static int getMemberOpt() {
        return memberOpt;
    }

    public void memberOptScan() {
        System.out.println("---------------------");
        System.out.println("(Member01_Scan.memberOptScan())\n");

        memberOpt = scanner.nextInt();

        //Member02_Process 여기서 Scan 받은 입력값 처리하기
        new Member02_Process().memberOptProcess();
    }
    public void memberDataScan(){
        System.out.println("---------------------");
        System.out.println("(Member01_Scan.memberDataScan())\n");

        name = scanner.nextLine();
    }
}

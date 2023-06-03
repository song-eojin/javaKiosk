package kioskMember.memberFlow;

import java.util.Scanner;


public class Member01_Scan {
    private final Scanner scanner = new Scanner(System.in);
    private static int memberOpt;
    private static String name;
    private static int phoneFront;
    private static int phoneBack;

    public int memberOptScan() {
        memberOpt = scanner.nextInt();
        new Member02_Process().memberOptProcess();
        return memberOpt;
    }

    public static int setMemberOpt(int memberOpt) {
        return Member01_Scan.memberOpt = memberOpt;
    }
    static int getMemberOpt() {
        return memberOpt;
    }

    public void memberDataScan(){
        name = scanner.nextLine();
        phoneFront = scanner.nextInt();
        phoneBack = scanner.nextInt();
    }



}

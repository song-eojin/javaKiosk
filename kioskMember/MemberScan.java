package kioskMember;

import java.util.Scanner;


public class MemberScan {
    private final Scanner scanner = new Scanner(System.in);
    private static int memberOpt;
    private static String name;
    private static int phoneFront;
    private static int phoneBack;

    public void memberScan(){
        name = scanner.nextLine();
        phoneFront = scanner.nextInt();
        phoneBack = scanner.nextInt();
    }

}

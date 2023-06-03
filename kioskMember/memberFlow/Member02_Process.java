package kioskMember.memberFlow;

/*Member01_Scan 에서 받은 입력값을 처리(가공)하는 클래스*/
public class Member02_Process extends Member01_Scan {
    void memberOptProcess() {
        System.out.println("---------------------");
        System.out.println("(Member02_Process\n)");

        //1. 비회원으로 진행할 경우
        if(Member01_Scan.getMemberOpt() == 1) {

        }

        //2. 회원가입하고 진행하는 경우
        else if (Member01_Scan.getMemberOpt() == 2) {

        }

        //잘못된 MemberOpt 을 선택한 경우
        else {

        }
    }
}

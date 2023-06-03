package kioskMember.memberFlow;

import kioskMenu.KioskMenu;

/*1-2) Member01_Scan 에서 받은 입력값을 처리(가공)하는 클래스*/
public class Member02_Process extends Member01_Scan {
    void memberOptProcess() {
        /*비회원으로 진행할 경우*/
        if(Member01_Scan.getMemberOpt() == 1) {
            //바로 KioskMenu.java 로 넘어가기
            //KioskMenu
        }

        /*회원가입하고 진행하는 경우*/
        else if(Member01_Scan.getMemberOpt() == 2) {
            //Member01_scan 에서 name, phoneFront, phoneBack 받기
        }

        /*else. 잘못된 MemberOpt 을 선택한 경우*/
        else {

        }
    }
}

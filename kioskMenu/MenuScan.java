package kioskMenu;

import interfaces.Scan;

import java.util.Scanner;

public class MenuScan implements Scan {
    private int menuCategory;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int scan(){
        menuCategory = scanner.nextInt();
        return menuCategory;
    }
}

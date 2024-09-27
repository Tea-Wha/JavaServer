package 아이패드주문하기예제;

import 아이패드주문하기예제.IPadPro;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro iPadPro = new IPadPro("iPad Pro");
            if (!iPadPro.continueOrder()) break;
            iPadPro.setScreen();
            iPadPro.setColor();
            iPadPro.setMemory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNumber();
            iPadPro.iPadProInfo();
            iPadPro.progressIPadPro();
            iPadPro.iPadProCalcPrice();

        }
    }
}

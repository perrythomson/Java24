package toolbox.modems;

/**
 * Created by perrythomson on 8/23/16.
 */
public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 500_000;
        gateway.speed = 400_000;
        System.out.println("Trying the cable modem: ");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Trying the DSL modem: ");
        gateway.displaySpeed();
        gateway.connect();
    }
}

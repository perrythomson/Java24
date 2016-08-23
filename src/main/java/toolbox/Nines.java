package toolbox;

/**
 * Created by perrythomson on 8/19/16.
 */
public class Nines {

    public static void main (String[] args) {
        int dex;
        for (dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.print(multiple + " ");
        }
        System.out.println();
    }
}

package toolbox.virus;

/**
 * Created by perrythomson on 9/8/16.
 */
public class VirusLab {
    public static void main(String[] args) {

        int numViruses = Integer.parseInt (args[0]);
        int i;
        if (numViruses > 0) {
            Virus[] virii = new Virus[numViruses];
            for (i = 0;i < numViruses; i++) {
                virii[i] = new Virus();
            }
            System.out.println("There are " + Virus.getVirusCount() + " viruses.");
        }
    }
}

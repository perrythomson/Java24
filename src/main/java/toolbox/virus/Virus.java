package toolbox.virus;

/**
 * Created by perrythomson on 9/8/16.
 */
public class Virus {
    static int virusCount = 0;

    public Virus() {
        virusCount++;
    }

    static int getVirusCount() {
        return virusCount;
    }
}

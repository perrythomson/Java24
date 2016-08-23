package toolbox;
import java.util.*;
/**
 * Created by perrythomson on 8/21/16.
 */
public class NameSorter {
    public static void main (String[] args) {
        String names[] = { "Glimmer", "Marvel", "Rue", "Clove", "Thresh", "Foxface", "Cato", "Peeta", "Katniss"};
        System.out.println("The original order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
        Arrays.sort(names);
        System.out.println("The new order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
    }
}

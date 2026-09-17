import java.util.ArrayList;

public class ReportGenerator {

    public void generate(ArrayList<Item> items) {

        int lost = 0;
        int found = 0;
        int returned = 0;

        for (Item item : items) {

            if (item.getType().equals("LOST"))
                lost++;

            if (item.getType().equals("FOUND"))
                found++;

            if (item.isReturned())
                returned++;
        }

        System.out.println("\n========== SYSTEM REPORT ==========");
        System.out.println("Total Records : " + items.size());
        System.out.println("Lost Items    : " + lost);
        System.out.println("Found Items   : " + found);
        System.out.println("Returned      : " + returned);
        System.out.println("===================================");
    }
}

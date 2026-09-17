import java.util.ArrayList;

public class MatchEngine {

    public int calculateScore(Item lost, Item found) {

        int score = 0;

        if (lost.getCategory().equalsIgnoreCase(found.getCategory()))
            score += 25;

        if (lost.getLocation().equalsIgnoreCase(found.getLocation()))
            score += 30;

        if (lost.getDate().equalsIgnoreCase(found.getDate()))
            score += 20;

        if (lost.getName().equalsIgnoreCase(found.getName()))
            score += 10;

        if (lost.getDescription().toLowerCase()
                .contains(found.getDescription().toLowerCase()))
            score += 15;

        return score;
    }

    public void findMatches(Item lost,
                             ArrayList<Item> allItems) {

        boolean foundMatch = false;

        for (Item item : allItems) {

            if (item.getType().equals("FOUND")) {

                int score = calculateScore(lost, item);

                if (score >= 40) {
                    System.out.println("\nPossible Match:");
                    System.out.println(item);
                    System.out.println("Match Score: " + score + "%");
                    foundMatch = true;
                }
            }
        }

        if (!foundMatch)
            System.out.println("No possible matches found.");
    }
}

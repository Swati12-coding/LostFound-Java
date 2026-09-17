import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LostFoundManager manager = new LostFoundManager();
        MatchEngine matcher = new MatchEngine();
        ReportGenerator report = new ReportGenerator();

        int choice;

        do {
            System.out.println("\n===== CAMPUS LOST & FOUND =====");
            System.out.println("1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View All Items");
            System.out.println("4. Search Item");
            System.out.println("5. Find Possible Match");
            System.out.println("6. Mark Item Returned");
            System.out.println("7. Generate Report");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addItem(sc, manager, "LOST");
                    break;

                case 2:
                    addItem(sc, manager, "FOUND");
                    break;

                case 3:
                    showItems(manager.getItems());
                    break;

                case 4:
                    System.out.print("Enter item name: ");
                    String keyword = sc.nextLine();
                    showItems(manager.search(keyword));
                    break;

                case 5:
                    System.out.print("Enter lost item ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    Item lost = manager.findItem(id);

                    if (lost != null)
                        matcher.findMatches(lost, manager.getItems());
                    else
                        System.out.println("Item not found.");

                    break;

                case 6:
                    System.out.print("Enter item ID: ");
                    int returnId = Integer.parseInt(sc.nextLine());
                    manager.markReturned(returnId);
                    break;

                case 7:
                    report.generate(manager.getItems());
                    break;

                case 0:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void addItem(Scanner sc,
                                LostFoundManager manager,
                                String type) {

        System.out.print("Item name: ");
        String name = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("Description: ");
        String description = sc.nextLine();

        manager.addItem(name, category, location,
                date, description, type);
    }

    private static void showItems(ArrayList<Item> items) {

        if (items.isEmpty()) {
            System.out.println("No items found.");
            return;
        }

        System.out.println("\nID | TYPE | NAME | CATEGORY | LOCATION | DATE | STATUS");

        for (Item item : items)
            System.out.println(item);
    }
}

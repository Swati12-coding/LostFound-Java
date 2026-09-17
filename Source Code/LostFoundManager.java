import java.util.ArrayList;

public class LostFoundManager {

    private ArrayList<Item> items = new ArrayList<>();
    private int nextId = 1;

    public void addItem(String name, String category,
                        String location, String date,
                        String description, String type) {

        if (name.isEmpty() || category.isEmpty() || location.isEmpty()) {
            System.out.println("Please enter all required details.");
            return;
        }

        Item item = new Item(nextId++, name, category,
                location, date, description, type);

        items.add(item);
        System.out.println("Item added successfully.");
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item findItem(int id) {
        for (Item item : items) {
            if (item.getId() == id)
                return item;
        }
        return null;
    }

    public ArrayList<Item> search(String keyword) {
        ArrayList<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item.getName().toLowerCase()
                    .contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }

    public void markReturned(int id) {
        Item item = findItem(id);

        if (item != null) {
            item.markReturned();
            System.out.println("Item marked as returned.");
        } else {
            System.out.println("Item not found.");
        }
    }
}

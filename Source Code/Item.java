public class Item {
    private int id;
    private String name;
    private String category;
    private String location;
    private String date;
    private String description;
    private String type;
    private boolean returned;

    public Item(int id, String name, String category, String location,
                String date, String description, String type) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.location = location;
        this.date = date;
        this.description = description;
        this.type = type;
        this.returned = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public boolean isReturned() {
        return returned;
    }

    public void markReturned() {
        returned = true;
    }

    public String toString() {
        return id + " | " + type + " | " + name +
               " | " + category + " | " + location +
               " | " + date + " | " +
               (returned ? "RETURNED" : "ACTIVE");
    }
}

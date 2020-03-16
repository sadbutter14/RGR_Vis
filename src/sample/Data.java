package sample;

public class Data {
    private String age;
    private String category;
    private String name;
    private String description;

    public Data(String age, String category, String name, String description) {
        this.age = age;
        this.category = category;
        this.name = name;
        this.description = description;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



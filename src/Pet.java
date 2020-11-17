public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet(String location) {};

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    };

    public Pet() {
        name = "Ein";
        age = 3;
    };

    

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private String getType() {
        return type;
    }

    public void getInfo() {
        getName();
        getAge();
        getType();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    

    public static void main(String[] args) {
        
    }
    
}

public class Character {
    public String name;
    public float height;
    public String gender;
    public String profession;
    public boolean weaponDrawn;

    private String weapon;
    private int age;
    private int attack;
    private int energy;
    private int speed;
    private int aim;
    private int strength;
    private int health;

    public Character(String name, String profession) {}

    public Character(String name,  float height, String profession) {
        this.name = name;
        this.height = height;
        this.profession = profession;
    }

    public Character() {
        name = "Lelouche Vi Britannia";
        gender = "male";
        height = 5.7f;
        profession = "Rebel Leader";
        weapon = "Geass(Compel)";
    }

    private String getName() {
        return name;
    }

    private float getHeight() {
        return height;
    }

    private String getProfession() {
        return profession;
    }

    public boolean getWeaponDrawn(boolean weaponDrawn) {
        return weaponDrawn;
    }

    public String gender(String gender) {
        return gender;
    }

    public void getProfile() {
        getName();
        getHeight();
        getProfession();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static void main(String[] args) {
        Character character = new Character();
        character.setName("Lu");
        System.out.println(character.name);
    }
}

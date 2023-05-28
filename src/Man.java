public class Man extends Person {
    public Man(String firstName, String lastName, int age, String partner, String address) {
        super(firstName, lastName, age, partner, address);
    }

    public boolean isRetiredMan() {
        if (super.getAge() > 65) {
            return true;
        } else {
            return false;
        }

    }
}

public class Women extends Person {
    public Women(String firstName, String lastName, int age, String partner, String address) {
        super(firstName, lastName, age, partner, address);
    }
    public boolean isRetiredWomen() {
        if (super.getAge() > 60) {
            return true;
        } else {
            return false;
        }

       }

}

//    public void registerPartnership(){
//        String partnerWoman = super.getPartner();
//        return partnerWoman;
//    }


public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public boolean isTeen(){
        if (age >= 10 && age <=20){
            System.out.println("Your person is a teen;");
            return true;
        }else {
            System.out.println("Your person is not a teen.");
            return false;
        }
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int age() {
        return this.age;
    }

    public void getFULLName(){
        System.out.println("The full name is " + firstName + " " + lastName);
    }
}

package pl.rehost.l3;

public class Person {
    private String firstName;
    private String lastName;
    private int index;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndex() { return this.index; }

    public void setIndex(int index) {
        if (index <= 0) {
            throw new IndexOutOfBoundsException();
        }
        this.index = index;
    }

}

package pl.rehost.l3;

public class Teacher extends Person implements InformationProvider {
    private int wage;

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) throws BiedaException {
        if (wage < 1500) {
            throw new BiedaException("Kiepska wypłata");
        }
        this.wage = wage;
    }

    @Override
    public String getInfo() {
        return this.getFirstName() + " " + this.getLastName() + " zarobki: " + this.getWage();
    }
}

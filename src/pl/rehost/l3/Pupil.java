package pl.rehost.l3;

public class Pupil extends Person implements InformationProvider {

    @Override
    public String getInfo() {
        return this.getIndex() + " | " + this.getFirstName() + " " + this.getLastName();
    }
}


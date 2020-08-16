package pl.rehost.l3;


import java.util.ArrayList;

public class Main {

    static void populateSchool(School school) throws BiedaException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        Teacher teacher = new Teacher();
        teacher.setFirstName("Piotr");
        teacher.setLastName("Duch");
        try {
            //nie moglem sie powstrzymac
            teacher.setWage(1000);
        } catch (BiedaException e) {
            System.err.println("Powinno być \"Failed to allocate Teacher\", a jest \"Failed to allocate teacher\"");
            throw e;
        }
        teachers.add(teacher);

        teacher = new Teacher();
        teacher.setFirstName("Anna");
        teacher.setLastName("Firych-Nowacka");
        try {
            teacher.setWage(2300);
        } catch (BiedaException e) {
            System.err.println("Czemu zarabia tak mało? :(");
            throw e;
        }
        teachers.add(teacher);

        school.setTeachers(teachers);


        // yay, javowo
        ArrayList<Pupil> pupils = new ArrayList<>();
        Pupil pupil = new Pupil();
        pupil.setFirstName("Adam");
        pupil.setLastName("Mickiewicz");
        pupil.setIndex(213311);
        pupils.add(pupil);

        pupil = new Pupil();
        pupil.setFirstName("Ozjasz");
        pupil.setLastName("Goldberg");
        pupil.setIndex(214121);
        pupils.add(pupil);

        pupil = new Pupil();
        pupil.setFirstName("Tomasz");
        pupil.setLastName("Wagner");
        pupil.setIndex(213314);
        pupils.add(pupil);

        school.setPupils(pupils);
    }

    static <T> void printInfo(T t) {
        System.out.println(((InformationProvider) t).getInfo());
    }

    public static void main(String[] args) {
        School school = new School();
        try {
            populateSchool(school);
        } catch (Exception e) {
            System.err.println("Zaludnienie szkoły nieudane.");
            e.printStackTrace();
            return;
        }
        //printInfo(school.getTeachers());

        // yay, javowo!
        ArrayList<Pupil> pupils = school.getPupils();
        for (Pupil pupil : pupils) {
            printInfo(pupil);
        }

        ArrayList<Teacher> teachers = school.getTeachers();
        for(Teacher teacher : teachers) {
            printInfo(teacher);
        }
    }
}


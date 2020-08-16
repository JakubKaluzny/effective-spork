package pl.rehost.l3;

import java.util.ArrayList;

public class School {

    private ArrayList<Teacher> teachers;
    private ArrayList<Pupil> pupils;
    //nie podoba mi sie, ciekawe czy mozna to zrobic generykami zeby byl tylko 1 zestaw metod

    public void setPupils(ArrayList<Pupil> pupils) {
        this.pupils = pupils;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Pupil> getPupils() {
        return pupils;
    }

    public ArrayList <Teacher> getTeachers() {
        return teachers;
    }

}

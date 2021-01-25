package collections.Junade;


import java.util.ArrayList;

public class Persons implements Comparable<Persons>
{
    public ArrayList<Persons> list = new ArrayList<>();
    private String fName, lName;
    private int age;

    public Persons()
    {

    }

    public Persons(String fnm, String snm, int ag)
    {
        this.fName=fnm;
        this.lName=snm;
        this.age=ag;
    }

    public String addFirstName(String fName)
    {
        return fName;
    }

    public String addLastName(String lName)
    {
        return lName;
    }

    public int addAge(int age)
    {
        return age;
    }

    public String toString()
    {
        return "Names: " + fName + " " + lName + ", Ages: " + age;
    }

    public int compareTo(Persons nm)
    {
        return (this.fName).compareTo(nm.fName);
    }
}

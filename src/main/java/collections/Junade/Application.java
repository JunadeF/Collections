package collections.Junade;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Application
{
    public static void main(String[] args)
    {
        String [] firstName = {"Tahrik", "Shane", "Jay-Dean", "Monique", "Eben"};

        String [] lastName = {"Jacobs", "Daniels", "Jacobus", "Chavda", "Stein"};

        int [] age = {31, 29, 22, 35, 30};

        Persons p = new Persons();

            for(int i=0; i<firstName.length; i++)

            {
                p.addFirstName(firstName[i]);
                p.addLastName(lastName[i]);
                p.addAge(age[i]);
                p.list.add(new Persons(firstName[i], lastName[i], age[i]));

            }

            //Set data structure
            Set set = new HashSet();
            set.add(p.list.add(new Persons("Junade", "Frizlar", 32)));

            //Print the list before sorting
            System.out.println("Before sorting the list!\n*-*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");

            System.out.println(p.list.toString());

            //Sorting the list
            Collections.sort(p.list);
            System.out.println("");

            //Print the list after sorting
            System.out.println("After sorting the list by first name!\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");

            System.out.println(p.list.toString());

            //Map data structure
            Map map = new HashMap();

            for(int i=0; i<p.list.size(); i++)

            {
                map.put("key"+i, p.list.get(i));
            }

            //Print using map data structure
            System.out.println("");

            System.out.println("Print out the map data structure!\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");

            for(int i=0; i<p.list.size(); i++) {
                System.out.println(map.get("key" + i));
            }
    }
}


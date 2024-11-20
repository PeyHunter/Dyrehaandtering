import java.util.ArrayList;
import java.util.Collections;

public class Zoo
{

    protected ArrayList<Dyr> zoo;

    public Zoo()
    {
        zoo = new ArrayList<>();

        zoo.add(new Hund("Figo", "Labrador", 23));
        zoo.add(new Hund("Doggy", "Chiwawa", 10));
        zoo.add(new Hund("Helga", "New Finderlander", 50));
        zoo.add(new Hund("Miko", "Labrador", 19));

        zoo.add(new Falk("Henrik1"));
        zoo.add(new Falk("Hunter1"));


        zoo.add(new Haj("Heeejjjj"));
        zoo.add(new Haj("Børge"));
    }

    public void udskrivHunde()
    {
        for (int i = 0; i < zoo.size(); i++)
        {
            if (zoo.get(i) instanceof Hund)
                System.out.println(zoo.get(i).givLyd() + "\n" + " " + zoo.get(i).getName());
            ;
        }
    }

    public ArrayList<Hund> sorterHunde()
    {
        ArrayList<Hund> sorterDogs = new ArrayList();
        for (int i = 0; i < zoo.size(); i++)
        {
            Dyr dyrene = zoo.get(i);
            if (dyrene instanceof Hund) {
                sorterDogs.add((Hund) dyrene);
            }
        }
        Collections.sort(sorterDogs);
        return sorterDogs;
    }


    public void udskriHajer()
    {
        for (int i = 0; i < zoo.size(); i++)
        {
            if (zoo.get(i) instanceof Haj)
                System.out.println(zoo.get(i).givLyd() + "\n" + " " + zoo.get(i).getName());
        }
    }


    public void udskrivNames()
    {
        for (int i = 0; i < zoo.size(); i++)

        {
            System.out.println(
                    "Dyrets Art: " + zoo.get(i).getType() + "\n" +
                            "Dyretype: " + zoo.get(i).getType() + "\n" +
                            "Dyrets Navn: " + zoo.get(i).getName() + "\n" +
                            "Dyrets lyd " + zoo.get(i).givLyd() + "\n");
        }
    }


}

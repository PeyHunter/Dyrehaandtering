import java.util.ArrayList;

public class Zoo
{

    protected ArrayList<Dyr> zoo;

    public Zoo()
    {
        zoo = new ArrayList<>();

        zoo.add(new Hund("Figo"));
        zoo.add(new Hund("Doggy"));
        zoo.add(new Hund("Helga"));
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
                System.out.println(zoo.get(i).givLyd() + "\n" + " " + zoo.get(i).getName());;
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
                                "Dyrets lyd " + zoo.get(i).givLyd() +  "\n");
        }
    }


}

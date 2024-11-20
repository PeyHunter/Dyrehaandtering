import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zoo
{
    public static void main(String[] args)
    {
        ArrayList<Dyr> zoo = new ArrayList<>();

        zoo.add(new Hund("Figo"));
        zoo.add(new Hund("Doggy"));
        zoo.add(new Hund("Helga"));

        zoo.add(new Falk("Henrik1"));
        zoo.add(new Falk("Hunter1"));


        Hund hund1 = new Hund("Rosa");

        System.out.println(zoo.get(0).givLyd());


        for (int i = 0; i < zoo.size(); i++)
            {
                if (zoo.get(i) instanceof Hund)
                System.out.println(zoo.get(i).givLyd());
            }





    }
}
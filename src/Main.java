import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        Zoo zoo = new Zoo();


        zoo.udskrivNames();
        zoo.udskriHajer();


        zoo.udskrivHunde();

        System.out.println("\n Sorterede Hunde: ");
        ArrayList<Hund> sorteredeHunde = zoo.sorterHunde();
        for (int i = 0; i < sorteredeHunde.size(); i++)
        {
                Hund dog = sorteredeHunde.get(i);
            System.out.println(dog);

        }






    }
}
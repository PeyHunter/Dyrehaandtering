public class Hund extends Pattedyr
{

    public Hund(String name) {
        super(name);  // Only pass name, type is set automatically in Pattedyr
    }



    public String givLyd(){
        return "vov-vov";
    }

    public String toString()
    {
        return "Hund: " + getName() + "Dyrelyd: " + givLyd();
    }


}

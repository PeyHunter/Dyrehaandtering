public class Falk extends Fugl implements kanFlyve
{

    public Falk(String name)
    {
        super(name);
    }

    public String givLyd()
    {
        return "paaakaaaauuwww";
    }


    public void flyv() {
        System.out.println(getName() + " flyver højt op i luften!");
    }

    public String toString()
    {
        return "Falk: " + getName() + "Dyrelyd: " + givLyd();
    }

}

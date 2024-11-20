public class Haj extends Fisk implements kanSvoemme
{

    public Haj(String name) {
        super(name);  // Only pass name, type is set automatically in Pattedyr
    }



    public String givLyd(){
        return "blob-blob";
    }


    public void kanSvoem()
    {
        System.out.println("Haj kan svoem");
    }

    public String toString()
    {
        return "Haj: " + getName() + "Dyrelyd: " + givLyd();
    }


}

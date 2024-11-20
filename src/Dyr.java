public abstract class Dyr
{

    protected String name;
    protected String type;

    public Dyr()
    {
    }

    public Dyr(String name, String type)
    {
        this.name = name;
        this.type = type;
    }




    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public String givLyd()
    {
     return "ubestemt dyrelyd";
    }





}

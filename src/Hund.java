public class Hund extends Pattedyr implements Comparable<Hund>
{
    public Hund()
    {
    }

    protected int sizeKg;
    protected String species;

    public Hund(String name, String species, int sizeKg)
    {
        super(name);  // Only pass name, type is set automatically in Pattedyr
        this.species = species;
        this.sizeKg = sizeKg;
    }


    public String givLyd()
    {
        return "vov-vov";
    }

    public int getSizeKg()
    {
        return sizeKg;
    }

    public String getSpecies()
    {
        return species;
    }


    public String toString()
    {
        return "Hund: " + getName() + " - Breed: " + species + " - Weight: " + sizeKg + "kg";
    }

    public int compareTo (Hund other)
    {
        return Integer.compare(this.sizeKg, other.sizeKg);
    }

}

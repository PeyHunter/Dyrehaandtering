import java.util.regex.Pattern;

public abstract class Pattedyr extends Dyr
{
    public Pattedyr() {}

    public Pattedyr(String name) {
        super(name, "Pattedyr");  // Pass only name, type is set by default
    }

    public String givLyd(){
        return "jeg er et pattedyr";
    }



}

// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;

/**
 * 
 */
public class Person
{
    private int alter;
    private String name;
    private String adr;

    /**
     * 
     */
    public Person(String name_neu, int alter_neu)
    {
        name = name_neu;
        adr = "Frankfurt";
        alter = alter_neu;
    }

    /**
     * 
     */
    public void ausgeben()
    {
        System.out.println(adr);
        System.out.println(name);
    }
}

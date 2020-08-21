package be.intecbrussel.hoofdstuk9;

public class Pet
{
    private String name;

    public Pet(String nameP)
    {
        this.name = nameP;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return getName();
    }
}

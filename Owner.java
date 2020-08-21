package be.intecbrussel.hoofdstuk9;

public class Owner
{
    private String name;
    private Pet myPet;

    public Owner(String nameP)
    {
        this.name = nameP;
    }

    public Pet getPet()
    {
        return myPet;
    }
    public void setPet(Pet myPetP)
    {
        this.myPet = myPetP;
    }

    public String getName()
    {
        return name;
    }
}

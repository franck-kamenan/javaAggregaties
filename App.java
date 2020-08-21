package be.intecbrussel.hoofdstuk9;

public class App
{
    public static void main(String[] args)
    {
        Pet toutou = new Pet("Toutou");
        System.out.println(toutou.getName());
        Owner prop = new Owner("Lel");
        prop.setPet(toutou);
        System.out.println(prop.getPet());
    }
}

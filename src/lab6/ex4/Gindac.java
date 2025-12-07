package lab6.ex4;

class Insecta
{
    private int i = 9;
    protected int j;
    Insecta()
    {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insecta.x1 initializata");
    static int printInit(String s)
    {
        System.out.println(s);
        return 47;
    }
}
public class Gindac extends Insecta
{
    private int k = printInit("Gindac.k initializat");
    public Gindac()
    {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Gindac.x2 initializat");
    public static void main(String[] args)
    {
        System.out.println("Gindac constructor");
        Gindac b = new Gindac();
    }
}
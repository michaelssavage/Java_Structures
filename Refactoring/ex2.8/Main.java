public class Main
{
    public static void main(String [] args)
    {
        Price cp = new ChildrensPrice();
        Price nrp = new NewReleasePrice();
        Price reg = new RegularPrice();
        
        boolean ok = true;
        
        for(int i = 1; i < 10; i++)
            System.out.print(cp.getCharge(i) + " ");
        System.out.println();
        for(int i = 1; i < 10; i++)
            System.out.print(nrp.getCharge(i) + " ");
        System.out.println();
        for(int i = 1; i < 10; i++)
            System.out.print(reg.getCharge(i) + " ");
        System.out.println();
    }
}

public class Task1Number5 {
    public static void main(String[] args)
    {
        int s=5, p=8;
        for(int i=0; i<args.length; i++)
        {
            int atata=Integer.parseInt(args[i]);
            s=s + atata;
            p=p * atata;
        }
        System.out.println("Сумма = " + s);
        System.out.println("Произведение = "+ p);
    }
}

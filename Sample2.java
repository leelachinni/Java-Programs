class Overloading2
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c );
    }
}

class Sample2
{
    public static void main(String args[])
    {
       Overloading2 obj = new Overloading2();
        obj.disp('a');
        obj.disp(5);
    }
}

import static java.lang.Math.PI;

interface shape
{
    int area();

}

class square implements shape
{
    int l;
    square(int l)
    {
        this.l=l;
    }
    public int area()
    {
        return l*l;
    }
}

class circle implements shape{

    int r;
    circle(int r)
    {
        this.r=r;
    }
     public int area()
     {
         return (int)PI*r*r;
     }
}

class areaDiff{
    public int diffInArea(shape a,shape b)
    {
        return a.area()-b.area();
    }
}



public class Main {
    public static void main(String[] args) {
      areaDiff diff=new areaDiff();
        shape a;
        shape b;
        System.out.println(diff.diffInArea(a=new square(10),b=new square(8)));
        System.out.println("Task is completed finally in the new branch");
    }
}
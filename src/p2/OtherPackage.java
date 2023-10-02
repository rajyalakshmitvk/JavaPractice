package p2;
class OtherPackage
{
    OtherPackage()
    {
        System.out.println("Different Package Non Subclass");
        p1.Protection p=new p1.Protection();
        //System.out.println("n_pro="+p.n_pro);
        System.out.println("n_pub="+p.n_pub);
    }
}
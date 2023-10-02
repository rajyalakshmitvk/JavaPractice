/*
Covariant return type refers to return type of an overriding
method. It allows to narrow down return type of an overridden
method without any need to cast the type or check the return type.
Covariant return type works only for non-primitive return types.

1) Covariant return type assists to stay away from the
confusing type casts in the class hierarchy and makes the code
more usable, readable, and maintainable.

2) In the method overriding, the covariant return type provides
the liberty to have more to the point return types.

3) Covariant return type helps in preventing the run-time
ClassCastExceptions on returns.
 */
class A1 {
    A1 foo()
    {
        return this;
    }
}
// A2 is the child class of A1
class A2 extends A1 {
    @Override
    A2 foo()
    {
        return this;
    }
}
// A3 is the child class of A2
class A3 extends A2
{
    @Override
    A3 foo()
    {
        return this;
    }
}

public class CovariantEx{
    // main method
    public static void main(String args[])
    {
        A1 a1 = new A1();
        a1.foo();
        A2 a2 = new A2();
        a2.foo();
        A3 a3 = new A3();
        a3.foo();
    }
}

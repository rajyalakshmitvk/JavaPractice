public class Exercise1 {
    public int Fibonacci (int num) {
        if( num == 0 || num == 1)
            return num;
        else
            return Fibonacci( num - 1 ) + Fibonacci( num - 2 );
    }
}

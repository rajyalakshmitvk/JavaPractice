package Training;

// A Java program to count all possible paths
// from top left to bottom right

class NumberOfPaths {

    // Returns count of possible paths to reach
    // cell at row number m and column number n
    // from the topmost leftmost cell (cell at 1, 1)
    static int numberOfPaths(int m, int n)
    {
        // If either given row number is first or
        // given column number is first
        if (m == 1 || n == 1){
            System.out.println("m"+m+"n"+n);
            return 1;
        }
        // If diagonal movements are allowed then
        // the last addition is required.
        int res = numberOfPaths(m - 1, n)
                + numberOfPaths(m, n - 1);
        System.out.println("m"+m+"n"+n+"res"+res);
        return res;
        // + numberOfPaths(m-1, n-1);
    }

    // Driver code
    public static void main(String args[])
    {
        System.out.println(numberOfPaths(3, 3));
    }
}

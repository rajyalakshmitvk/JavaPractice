public class DisplayMatrix {
    public static void main(String[] args) {
        int[][] a = new int[][]{ {1,2,3}, {4,5,6}, {7,8,9}};
        for (int[] ints : a) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

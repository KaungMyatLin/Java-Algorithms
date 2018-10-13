package findNumberofTriangleDots;

public class FindNumberofTriangleDots {

    public static void main(String[] args) {
        System.out.println( triangleDots(5) );
    }

    public static Integer triangleDots(int numOfSideDots )
    {
        int total = 0;
        if (numOfSideDots <= 0) return null;
        if (numOfSideDots == 1) return 1;

        return total = numOfSideDots * (numOfSideDots + 1) / 2;
    }
}
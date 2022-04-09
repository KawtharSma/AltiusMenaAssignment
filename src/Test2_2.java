import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2_2 {


    public static void main(String[] args) {

        Scanner sc = null;
        try {
            File file = new File("inputs/assignment02-2.txt"); // java.io.File
            sc = new Scanner(file);     // java.util.Scanner
            String line;

            int length=0;
            length=sc.nextInt();

            int[] a = new int[length];

            int i=0;
            while (sc.hasNext() && i!=length )
            {
                a[i]=sc.nextInt();
                i++;
            }


            System.out.println(Distance.minimumDistances(a));


        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            if (sc != null) sc.close();
        }



    }
}

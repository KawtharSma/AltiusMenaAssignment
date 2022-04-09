import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_2 {

    public static void main(String[] args) {

        Scanner sc = null;
        try {
            File file = new File("inputs/assignment01-2.txt"); // java.io.File
            sc = new Scanner(file);     // java.util.Scanner
            String line;

            int t=0;
            t=sc.nextInt();

            int n;
            int m;
            List<Integer> inputs1 =new ArrayList<>() ;
            List<Integer>  inputs2 =new ArrayList<>() ;

            for (int i=0; i< t; i++) {

                n = sc.nextInt();
                for(int j=0; j<n; j++){
                    inputs1.add(sc.nextInt());
                }
                m=sc.nextInt();
                for(int j=0; j<m; j++){
                    inputs2.add(sc.nextInt());
                }

                SinglyLinkedListNode list1 = SinglyLinkedListNode.PopulateList(inputs1);
                SinglyLinkedListNode list2 = SinglyLinkedListNode.PopulateList(inputs2);
                System.out.println(SinglyLinkedListNode.CompareLists(list1,list2));
                inputs1.clear();
                inputs2.clear();

            }

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


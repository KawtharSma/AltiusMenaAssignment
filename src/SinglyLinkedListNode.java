import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode (int data){
        this.data=data;
        this.next=null;

    }

   public SinglyLinkedListNode (int data, SinglyLinkedListNode head){
     this.data=data;
     head.next=this;

   }
   public static SinglyLinkedListNode PopulateList (List<Integer>  inputs){

       SinglyLinkedListNode head = new SinglyLinkedListNode(inputs.get(0));
       SinglyLinkedListNode list=head;
        for (int i=1; i<inputs.size(); i++)
       {
           head= new SinglyLinkedListNode(inputs.get(i),head);
       }
        return list;


   }

    public static int CompareLists(SinglyLinkedListNode list1, SinglyLinkedListNode list2) {
        if(list1 == null && list2 == null){
            return 1;
        } else if ( list1 == null || list2 == null){
            return 0;
        } else if (list1.data != list2.data) {
            return 0;
        }
        return (CompareLists(list1.next,list2.next));


    };


}

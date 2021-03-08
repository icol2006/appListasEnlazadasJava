/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistas;


public class AppListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("10");
        list.addLast("11");
        list.addLast("12");

        
        list.print();
        list.count();
        
        list.replace("12", "10zy");
        list.print();
        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.addLast("109");
        list2.addLast("107");
        
        //list.concatenateList(list, list2);
       // list.print();
       // list.deleteNode("13");
    
        //list.exist("10d");
         // list.showByPosition(44);
        //list.extract(6);
        //list.print();
      
        
                
    }
    
}

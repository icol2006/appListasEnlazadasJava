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
        list.addLast("13");
        list.addLast("14");
        list.addFirst("9");
        list.addFirst("8");
        list.print();
        list.count();
        list.deleteNode("13");
           list.print();
        //list.exist("10d");
          list.showByPosition(44);
        //list.extract(6);
        //list.print();
      
        
                
    }
    
}

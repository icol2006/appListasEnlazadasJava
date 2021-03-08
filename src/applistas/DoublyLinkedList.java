/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistas;

public class DoublyLinkedList {
    
    private Node tail;
    private Node head;
    
    public void addLast(String value) {
        Node node = new Node(value);
        if (tail == null && head == null) {
            tail = node;
            head = node;
        } else {
            tail.setNextElement(node);
            node.setPreviousElement(tail);
            tail = node;
        }
    }
    
    public void addFirst(String value) {
        Node node = new Node(value);
        if (tail == null && head == null) {
            tail = node;
            head = node;
        } else {
            node.setNextElement(head);
            head.setPreviousElement(node);
            head = node;
        }
    }
    
    public int count() {
        int cont = 0;
        for (Node i = head; i != null; i = i.getNextElement()) {
            cont++;
        }
        return cont;
    }
    
    public void exist(String x) {
        boolean res = false;
        
        Node reco = head;
        while (reco != null) {
            if (reco.getValue().equals(x)) {
                res = true;
                reco = null;
            } else {
                reco = reco.getNextElement();
            }
        }
        System.out.println(res);
    }
    
    public Node find(String x) {
        
        Node reco = head;
        while (reco != null) {
            if (reco.getValue().equals(x)) {
                break;
            } else {
                reco = reco.getNextElement();
            }
        }
        
        return reco;
    }
    
     public Node replace(String search, String newValue) {
        
        Node reco = head;
        while (reco != null) {
            if (reco.getValue().equals(search)) {
                reco.value=newValue;
                break;
            } else {
                reco = reco.getNextElement();
            }
        }
        
        return reco;
    }
    
    public void showByPosition(int pos) {
        if (pos <= count()) {
            String informacion;
            if (pos == 0) {
                informacion = head.value;
            } else {
                Node reco;
                reco = head;
                for (int f = 0; f <= pos - 2; f++) {
                    reco = reco.getNextElement();
                }
                informacion = reco.value;
            }
            System.out.println(informacion);
        }
        
    }
    
    public void extractByPosition(int pos) {
        if (pos <= count()) {
            String informacion;
            if (pos == 0) {
                informacion = head.value;
                head = head.getNextElement();
                if (head != null) {
                    head.previousElement = null;
                }
            } else {
                Node reco;
                reco = head;
                for (int f = 0; f <= pos - 2; f++) {
                    reco = reco.getNextElement();
                }
                Node prox = reco.getNextElement();
                reco.nextElement = prox.nextElement;
                Node siguiente = prox.getNextElement();
                if (siguiente != null) {
                    siguiente.previousElement = reco;
                }
                informacion = prox.value;
            }
            System.out.println(informacion);
        }
        
    }
    
    public void deleteNode(String value) {
        Node del = find(value);
        // Base case
        if (head == null || del == null) {
            return;
        }

        // If node to be deleted is head node
        if (head == del) {
            head = del.nextElement;
        }

        // Change next only if node to be deleted
        // is NOT the last node
        if (del.nextElement != null) {
            del.nextElement.previousElement = del.previousElement;
        }

        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.previousElement != null) {
            del.previousElement.nextElement = del.nextElement;
        }

        // Finally, free the memory occupied by del
        return;
    }
    
    public void concatenateList(DoublyLinkedList list1, DoublyLinkedList list2) {
        
        Node reco = list2.head;
        while (reco != null) {
              list1.addLast(reco.value);
            reco = reco.getNextElement();     
        }
        
    }
    
    public void print() {
        for (Node i = head; i != null; i = i.getNextElement()) {
            System.out.printf("\t %s ", i.toString());
        }
        System.out.println();
    }
}

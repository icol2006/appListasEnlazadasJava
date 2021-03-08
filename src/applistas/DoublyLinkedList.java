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
    
    public String extract (int pos) {
        if (pos <= count())    {
            String informacion;
            if (pos == 1) {
                informacion = head.value;
                head = head.getNextElement();
                if (head!=null)
                    head.previousElement=null;
            } else {
                Node reco;
                reco = head;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.getNextElement();
                Node prox = reco.getNextElement();
                reco.nextElement = prox.nextElement;
                Node siguiente=prox.getNextElement();
                if (siguiente!=null)
                    siguiente.previousElement=reco;
                informacion = prox.value;
            }
            return informacion;
        }
        else
            return Integer.MAX_VALUE+"";
    }

    public void print() {
        for (Node i = head; i != null; i = i.getNextElement()) {
            System.out.printf("\t %s ", i.toString());
        }
        System.out.println();
    }
}

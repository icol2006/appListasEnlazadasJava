/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistas;


public class Node {
    public String value;
    public Node nextElement;
    public Node previousElement;
 
    public Node(String value) {
        this.value = value;
    }
 
    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }
 
    public Node getNextElement() {
        return nextElement;
    }
 
    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }
 
    public Node getPreviousElement() {
        return previousElement;
    }
 
    public void setPreviousElement(Node previousElement) {
        this.previousElement = previousElement;
    }
 
    @Override
    public String toString() {
        return "Node [value=" + value + ", nextElement=" + ((nextElement != null) ? nextElement.getValue()
                : null) + ", previousElement=" +( (previousElement != null) ? previousElement.getValue() : null) + "]";
    }
 
}
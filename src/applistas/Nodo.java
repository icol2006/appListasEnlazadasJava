package applistas;


public class Nodo {
    public String valor;
    public Nodo elementoSig;
    public Nodo elementoAnt;
 
    public Nodo(String valor) {
        this.valor = valor;
    }
 
    public String getValor() {
        return valor;
    }
 
    public void setValor(String valor) {
        this.valor = valor;
    }
 
    public Nodo getElementoSig() {
        return elementoSig;
    }
 
    public void setElementoSig(Nodo nextElement) {
        this.elementoSig = nextElement;
    }
 
    public Nodo getElementoAnt() {
        return elementoAnt;
    }
 
    public void setElementAnt(Nodo previousElement) {
        this.elementoAnt = previousElement;
    }
 
    @Override
    public String toString() {
        return "   [Valor=" + valor + ", ElementoSiguiente=" + ((elementoSig != null) ? elementoSig.getValor()
                : null) + ", ElementoAnterior=" +( (elementoAnt != null) ? elementoAnt.getValor() : null) + "]";
    }
 
}
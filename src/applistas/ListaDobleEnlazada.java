package applistas;

public class ListaDobleEnlazada {
    
    private Nodo colaLista;
    private Nodo cabezaLista;
    
    public void agregar(String value) {
        Nodo node = new Nodo(value);
        if (colaLista == null && cabezaLista == null) {
            colaLista = node;
            cabezaLista = node;
        } else {
            colaLista.setElementoSig(node);
            node.setElementAnt(colaLista);
            colaLista = node;
        }
    }
   
    public int contarElementos() {
        int cont = 0;
        for (Nodo i = cabezaLista; i != null; i = i.getElementoSig()) {
            cont++;
        }
        return cont;
    }
    
    public void existeElemento(String x) {
        boolean res = false;
        
        Nodo actual = cabezaLista;
        while (actual != null) {
            if (actual.getValor().equals(x)) {
                res = true;
                actual = null;
            } else {
                actual = actual.getElementoSig();
            }
        }
        System.out.println(res);
    }
    
    public Nodo find(String x) {
        
        Nodo actual = cabezaLista;
        while (actual != null) {
            if (actual.getValor().equals(x)) {
                break;
            } else {
                actual = actual.getElementoSig();
            }
        }   
        return actual;
    }
    
     public Nodo remplazarElemento(String search, String newValue) {
        
        Nodo actual = cabezaLista;
        while (actual != null) {
            if (actual.getValor().equals(search)) {
                actual.valor=newValue;
                break;
            } else {
                actual = actual.getElementoSig();
            }
        }
        
        return actual;
    }
    
    public void mostrarPorPosicion(int posicion) {
        Nodo resultado=null;
        if (posicion <= contarElementos()) {
            String informacion;
            if (posicion == 0) {
                resultado=cabezaLista;
            } else {
                Nodo actual;
                actual = cabezaLista;
                for (int x = 0; x <= posicion - 1; x++) {
                    actual = actual.getElementoSig();
                }
                //informacion = actual.valor;
                resultado=actual;
            }
            if(resultado!=null)
            System.out.println( resultado.toString());       
        }
        
    }
    
    public void extraerPorPosicion(int pos) {
  
        if (pos <= contarElementos()) {
           
            if (pos == 0) {
                cabezaLista = cabezaLista.getElementoSig();
                if (cabezaLista != null) {
                    cabezaLista.elementoAnt = null;
                }
            } else {
                Nodo actual;
                actual = cabezaLista;
                for (int x = 0; x <= pos - 2; x++) {
                    actual = actual.getElementoSig();
                }
                Nodo prox = actual.getElementoSig();
                actual.elementoSig = prox.elementoSig;
                Nodo siguiente = prox.getElementoSig();
                if (siguiente != null) {
                    siguiente.elementoAnt = actual;
                }
            }
    
        }
        
    }
    
    public void borrarNodo(String value) {
        Nodo nodoBorrar = find(value);
        
        if (cabezaLista == null || nodoBorrar == null) {
            return;
        }

        if (cabezaLista == nodoBorrar) {
            cabezaLista = nodoBorrar.elementoSig;
        }

        if (nodoBorrar.elementoSig != null) {
            nodoBorrar.elementoSig.elementoAnt = nodoBorrar.elementoAnt;
        }

        if (nodoBorrar.elementoAnt != null) {
            nodoBorrar.elementoAnt.elementoSig = nodoBorrar.elementoSig;
        }

        return;
    }
    
    public void concatenarListas(ListaDobleEnlazada list1, ListaDobleEnlazada list2) {
        
        Nodo actual = list2.cabezaLista;
        while (actual != null) {
              list1.agregar(actual.valor);
            actual = actual.getElementoSig();     
        }
        
    }
    
    public void imprimir() {
        for (Nodo x = cabezaLista; x != null; x = x.getElementoSig()) {
            System.out.printf( x.toString());
        }
        System.out.println();
    }
}


package applistas;

public class AppListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDobleEnlazada list = new ListaDobleEnlazada();
        list.agregar("10");
        list.agregar("11");
        list.agregar("12");

        list.imprimir();

        //Contar elementos
        list.contarElementos();

        //Mostrar elemento por posicion
        System.out.println("Mostrar elemento por posicion (0)");
        list.mostrarPorPosicion(2);

        System.out.println("Existe 10z");
        list.existeElemento("10z");

        System.out.println("Agregar 14");
        list.agregar("14");
        list.imprimir();

        System.out.println("Extraer posicion 0");
        list.extraerPorPosicion(0);
        list.imprimir();

        ListaDobleEnlazada list2 = new ListaDobleEnlazada();
        list2.agregar("109");
        list2.agregar("107");

        System.out.println("Unir listas");
        list.concatenarListas(list, list2);
        list.imprimir();

        System.out.println("Remplazar 10 por 10zy");
        list.remplazarElemento("12", "10zy");
        list.imprimir();

        //list.concatenateList(list, list2);
        // list.print();
        // list.deleteNode("13");
        //list.exist("10d");
        //list.extract(6);
        //list.print();
    }

}

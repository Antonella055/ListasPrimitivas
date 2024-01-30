package lista;

public class Main {

    //Prueba
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(10);
        for (int i = 10; i < 20; i++) {
            lista.insertarFinal(i);
        }
        System.out.println("Siplemente enlazada");
        System.out.println("Antes");
        lista.print();
        System.out.println("Eliminar");
        lista.EliminarFinal();
        lista.print();
        
        System.out.println("Insertar");
        lista.insertarFinal(55);
        lista.print();
        
        ListaDoble listadoble = new ListaDoble();
        for (int i = 0; i < 10; i++) {
            listadoble.insertarFinal(i);
        }
        
        
        System.out.println("Doblemente enlazada");
        System.out.println("Antes");
        listadoble.print();
        listadoble.insertarxIndice(55, 3);
        System.out.println("Despues");
        listadoble.print();
        
        ListaCircular listaCircular = new ListaCircular();
        for (int i = 0; i < 10; i++) {
            listaCircular.insertarFinal(i);
        }
        
        
        
         System.out.println(" Lista Circular");
        System.out.println("ANTES");
        listaCircular.print();
        
      
        System.out.println("DELETE");
        listaCircular.EliminarFinal();
        listaCircular.print();
        /*
        System.out.println("Insert");
        lista.insertFinal(55);
        lista.print();*/
  
    }
    
}

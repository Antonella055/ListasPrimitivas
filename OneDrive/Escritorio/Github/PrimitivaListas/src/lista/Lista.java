package lista;

public class Lista implements ILista{
    private Nodo head;
    private int size;

    public Lista() {
        this.head = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public void insertarInicio(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
        } else {
           nodo.setNext(getHead());
           setHead(nodo);
        }
        size++;
    }
    
    @Override
    public void insertarFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
        } else {
           Nodo pointer = getHead();
           while (pointer.getNext() != null) {
               pointer = pointer.getNext();
           }
           pointer.setNext(nodo);
        }
        size++;
    }
    
    @Override
    public void insertarxIndice(Object element, int index) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
        } else {
            if (index < 0) {
                System.out.println("Index Error");
            } else if (index > size) {
                System.out.println("Index Error");
            } else if (index == size) {
                insertarFinal(element);
            } else if (index == 0) {
                insertarInicio(element);
            } else {
                Nodo pointer = getHead();
                int aux = 0; 
                while (pointer.getNext() != null && aux < index - 1) {
                    pointer = pointer.getNext();
                    aux++;
                }
                nodo.setNext(pointer.getNext());
                pointer.setNext(nodo); 
            }
        }
        size++;
    }
    
    @Override
    public Object EliminarInicio(){
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer.getElement();
        }
        return null;
    }
    
    @Override
    public Object EliminarFinal(){
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
            size--;
            return pointer.getElement();
        }
        return null;
    }
    
    @Override
    public Object EliminarxIndice(int index) {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            if (index < 0) {
                System.out.println("Index Error");
            } else if (index >= size) {
                System.out.println("Index Error");
            } else if (index == 0) {
                return EliminarInicio();
            } else if (index == size-1) {
                return EliminarFinal();
            } else {
                Nodo pointer = getHead();
                int aux = 0; 
                while (pointer.getNext() != null && aux < index - 1) {
                    pointer = pointer.getNext();
                    aux++;
                }
                Nodo pointer2 = pointer.getNext();
                pointer.setNext(pointer2.getNext());
                pointer2.setNext(null);
                size--;
                return pointer.getElement();
            }
        }
        return null;
    }
    
    public void print() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.println("[ "+pointer.getElement() + " ]");
            pointer = pointer.getNext();
        }
    }
    
    @Override
    public boolean isEmpty() {
        return getHead() == null;
    }

    
}

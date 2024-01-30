
package lista;



public class ListaDoble implements ILista{
    private NodoLDoble head, tail;
    private int size;
    
    public ListaDoble() {
        this.head = this.tail = null;
        size = 0;
    }

    public NodoLDoble getHead() {
        return head;
    }

    public void setHead(NodoLDoble head) {
        this.head = head;
    }

    public NodoLDoble getTail() {
        return tail;
    }

    public void setTail(NodoLDoble tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void insertarInicio(Object element) {
        NodoLDoble NodoLDoble = new NodoLDoble(element);
        if (isEmpty()) {
            setHead(NodoLDoble);
            setTail(NodoLDoble);
        } else {
            getHead().setPrevious(NodoLDoble);
            NodoLDoble.setNext(getHead());
            setHead(NodoLDoble);
        }
        size++;
    }

    @Override
    public void insertarFinal(Object element) {
        NodoLDoble NodoLDoble = new NodoLDoble(element);
        if (isEmpty()) {
            setHead(NodoLDoble);
            setTail(NodoLDoble);
        } else {
            NodoLDoble.setPrevious(getTail());
            getTail().setNext(NodoLDoble);
            setTail(NodoLDoble);
        }
        size++;
    }

    @Override
    public void insertarxIndice(Object element, int index) {
        NodoLDoble NodoLDoble = new NodoLDoble(element);
        if (isEmpty()) {
            insertarInicio(element);
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
                if ((index > (int)(size/2))) {
                    NodoLDoble pointer = getTail();
                    int end = size - index;
                    int aux = 0;    
                    while (aux < end) {
                        pointer = pointer.getPrevious();
                        aux++;
                    }
                    NodoLDoble pointer2 = pointer.getNext();
                    NodoLDoble.setNext(pointer2);
                    NodoLDoble.setPrevious(pointer);
                    pointer.setNext(NodoLDoble);
                    pointer2.setPrevious(NodoLDoble);
                } else {
                    int aux = 1; 
                    NodoLDoble pointer = getHead();
                    while (aux < index) {
                        pointer = pointer.getNext();
                        aux++;
                    }
                    NodoLDoble pointer2 = pointer.getNext();
                    NodoLDoble.setNext(pointer2);
                    NodoLDoble.setPrevious(pointer);
                    pointer.setNext(NodoLDoble);
                    pointer2.setPrevious(NodoLDoble);
                }
                size++;
            }
        }
    }

    @Override
    public Object EliminarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object EliminarFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object EliminarxIndice(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }
    
    public void print() {
        NodoLDoble pointer = getHead();
        while (pointer != null) {
            System.out.println("[ "+pointer.getElement() + " ]");
            pointer = pointer.getNext();
        }
    }
    
}

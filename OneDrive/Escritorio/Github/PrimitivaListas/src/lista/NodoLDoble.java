
package lista;

public class NodoLDoble {
    private NodoLDoble next, previous;
    private Object element;

    public NodoLDoble(Object element) {
        this.next = this.previous = null;
        this.element = element;
    }

    public NodoLDoble getNext() {
        return next;
    }

    public void setNext(NodoLDoble next) {
        this.next = next;
    }

    public NodoLDoble getPrevious() {
        return previous;
    }

    public void setPrevious(NodoLDoble previous) {
        this.previous = previous;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
    
    
    
    
    
}

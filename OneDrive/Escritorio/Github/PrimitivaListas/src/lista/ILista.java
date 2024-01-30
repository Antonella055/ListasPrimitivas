package lista;

public interface ILista {
    public void insertarInicio(Object element);
    public void insertarFinal(Object element);
    public void insertarxIndice(Object element, int index);
    public Object EliminarInicio();
    public Object EliminarFinal();
    public Object EliminarxIndice(int index);
    public boolean isEmpty();
}


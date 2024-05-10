public class Nodo{
    private Nodo siguiente;
    private int dato;

    public Nodo(int dato){
        this.dato = dato;
        this.siguiente =null;
    }

    public int getDato(){
        return this.dato;
    }
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    public void enlazar(Nodo n){
        this.siguiente = n;
    }
}
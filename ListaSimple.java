public class ListaSimple {
    private Nodo prim;
    private Nodo ult;

    public ListaSimple(){
        this.prim =null;
        this.ult = null;
    }

    public Nodo Primero(){
        return this.prim;
    }
    public Nodo Ultimo(){
        return this.ult;
    }

    public boolean ListaVacia(){
        return this.prim==null;
    }
    public void AgregarPrimero(int n){
        Nodo nuevo = new Nodo(n);
        if(ListaVacia()){
            this.prim = nuevo;
            this.ult = nuevo;
        } else{
            this.prim.enlazar(nuevo);
            nuevo = this.prim;
        }
    }
    public void AgregarUltimo(int n){
        Nodo nuevo = new Nodo(n);
        if(ListaVacia()){
            this.prim=nuevo;
            this.ult=nuevo;
        }else{
            this.ult.enlazar(nuevo);
            this.ult = nuevo;
        }
    }
    public void QuitarPrimero(){
        if(ListaVacia()){
            System.out.println("Esta vacia");
        } else{
            if(this.prim == this.ult){
                this.prim=null;
                this.ult=null;
            } else{
                this.prim = this.prim.getSiguiente();
            }
        }
    }
    public void QuitarUltimo(){
        if(ListaVacia()){
            System.out.println("Esta vacia");
        } else{
            if(this.prim == this.ult){
                this.prim=null;
                this.ult=null;
            } else{
                Nodo aux;
                aux = this.ult;
                this.ult =null;
                aux.getSiguiente() =this.ult;
            }
        }
    }
}

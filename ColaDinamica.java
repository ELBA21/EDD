public class ColaDinamica {
    private Nodo prim;
    private Nodo ult;

    public ColaDinamica(){
        this.prim=null;
        this.ult =null;
    }
    public boolean ColaVacia(){
        return this.prim==null;
    }
    public void AgregarDato(int n){
        Nodo nuevo = new Nodo(n);
        if (ColaVacia()) {
            this.prim = nuevo;
            this.ult = nuevo;
        } else{
            nuevo.enlazar(this.ult);
            nuevo = this.ult;
        }
    }

    public void QuitarDato(){
        if(ColaVacia()){
            System.out.println("Cola Vacia");
        }else{
            if(this.prim== this.ult){
                this.prim = null;
                this.ult = null;
            } else{
                this.prim=this.prim.getSiguiente();
            }
        }
    }
    public void mostrar(){
        if(ColaVacia()){
            System.out.println("Cola Vacia");
        } else{
            Nodo aux = this.prim;
            while (aux!=null) {
                System.out.println(aux.getDato());
                aux = aux.getSiguiente();
            }
        }
    }

}

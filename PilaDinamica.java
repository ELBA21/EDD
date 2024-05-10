import javax.swing.Painter;

public class PilaDinamica {
    private Nodo cima;

    public PilaDinamica(){
        this.cima =null;
    }
    public boolean PilaVacia(){
        return this.cima==null;
    }
    public Object VerCimaNodo(){
        if(PilaVacia()){
            return null;
        } else{
            return this.cima.getDato();
        }
    }
    public void AgregarDato(int n){
        Nodo nuevo = new Nodo(n);
        if (PilaVacia()){
            this.cima = nuevo;
        } else{
            this.cima.enlazar(nuevo);
            this.cima = nuevo;
        }
    }
    public void QuitarDato(){
        Nodo aux;
        if(PilaVacia()){
            System.err.println("No hay nada");
        } else{
            aux = this.cima;
            this.cima = this.cima.getSiguiente();
            aux.enlazar(null);
        }
    }
    public void PilaMostrar(){
        Nodo aux;
        if(PilaVacia()){
            System.out.println("Pila vacia");
        } else{
            aux = this.cima;
            while (aux!=null) {
                System.out.println(aux.getDato());
                aux=aux.getSiguiente();
            }
        }
    }
    public void invertir(){
        PilaDinamica aux = new PilaDinamica();
        Nodo original=this.cima;
        //invirtiendo
        while(original!=null){
          aux.AgregarDato(original.getDato());
          original=original.getSiguiente();
        }
        //mostrar lo invertido
        while(aux.cima!=null){
          System.out.println(aux.cima.getDato());
          aux.QuitarDato();
        }
      }
}



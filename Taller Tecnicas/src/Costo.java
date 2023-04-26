public class Costo{
private String[] ingredientes;
private int manoObra;

public Costo(String[] ingredientes, int manoObra) {
    this.ingredientes=ingredientes;
    this.manoObra=manoObra;
}

public void setIngredientes(String[] ingredientes){
    this.ingredientes = ingredientes;
}
public void setManoObra(int manoObra){
    this.manoObra = manoObra;
}

public String[] getIngredientes(){
    return this.ingredientes;
}

public int manoObra(){
    return this.manoObra;
}


}
package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //Atributo de clase, incluid this delante del atributo hace referencia al atributo de la clase y no a una local
        this.b = arg2; //De todas formas, se puede trabajar sin this ya que el IDE lo valida de todas formas, OPCIONAL!
        //return a + b;
        return sumarConRetorno();
    }
    
}

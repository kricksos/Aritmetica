package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) { //psvm + tabulador
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado: " +  resultado);
        
        resultado = aritmetica1.sumarConArgumentos(1, 2);
        System.out.println("resultado = " + resultado);
        System.out.println(aritmetica1.sumarConArgumentos(5, 8));
    }
}

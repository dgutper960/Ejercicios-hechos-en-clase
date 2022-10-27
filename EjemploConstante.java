public class EjemploConstante {
    final static int MAX = Integer.MAX_VALUE;
    public static void main(String[] args ){
        Integer a,b,c;
        a=7;
        b=8;
        c=3;
        Integer r1=a+b;
        Integer r2=r1*c;
        System.out.println(r1 + r2);
        //Potencia a elevado a b
        Double poten=Math.pow(a,b);
        System.out.println(poten);
            System.out.println(MAX);
        //Valor máximo de los enteros y añadir a constante máximo de los enteros. La constante se crea en campos.
        Integer comp=Math.max(a,MAX);
        System.out.println(comp);
    }
}
    
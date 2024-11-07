
//int=>double=>string
public class Main {
    public static void main(String []args){
        int val1=25;
        double con1;
        String con2;

        con1=(double)val1;
        con2 = String.valueOf(val1);

        System.out.println(" el valor int: "+val1+
                "\n el valor double es : "+con1+
                "\n el valor string es : "+con2);


    }
}

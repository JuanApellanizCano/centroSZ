
public class perro{

    public static void main(String args[]){
        System.out.print("Perro");
        Ladrar(grande);
        Ladrar(pequeño);
    }

    public static void Ladrar(String tamañoraza){
        if(tamañoraza == "grande")
            System.out.print("Woof! Woof!");
        if(tamañoraza == "pequeño")
            System.out.print("Guau!");
    }
        
}

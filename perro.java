
public class perro{

    public static void main(String args[]){
        System.out.print("Perro");
        Ladrar(grande);
        Ladrar(pequeño);
    }

    public static void Ladrar(String tamañoraza){
        if(tamañoraza == "grande")
            System.out.print("Se que los gatos son mejores");
        if(tamañoraza == "pequeño"){
            System.out.print("Los perros pequeños tambien se llaman ratas");
        //ESTE ES EL CAMBIO EN EL CÓDIGO:
        System.out.print("Guau! Guau!");
        }
    }
        
}

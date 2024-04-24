 /* Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata */

 import java.util.LinkedList;

 public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Kiwi"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Grapefruit"));
        fruits.add(new Fruit("Pineapple"));

        System.out.println("The list of fruits is: " + fruits);

        //aggiungo un elemento al primo e uno all'ultimo posto della lista
        fruits.addFirst(new Fruit("Orange"));
        fruits.addLast(new Fruit("Grapes"));

        System.out.println("The new list of fruits is: " + fruits);

    }
}

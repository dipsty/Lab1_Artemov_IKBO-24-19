package LAB1;

public class DOG_TEST {
    public static void main(String[] args) {
        DOG DLM = new DOG(10 , 40);
        System.out.println("The length of the head is " + DLM.getHead() + " centimeters." +
                " The length of the torso is " + DLM.getTorso() + " centimeters." +
                " Whole dog's length is " + (DLM.getHead() + DLM.getTorso() + " centimeters.")
        );
    }

}

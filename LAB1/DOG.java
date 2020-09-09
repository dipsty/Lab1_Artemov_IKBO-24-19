package LAB1;

public class DOG {
//Переменные
    public int Head;
    public int Torso;
//Конструкторы
    public DOG(){
        Head = 10;
        Torso = 30;
    }

    public DOG(int HeadLength){
        Head = HeadLength;
        Torso = 30;
    }

    public DOG(int HeadLength, int TorsoLength){
        Head = HeadLength;
        Torso = TorsoLength;
    }

//Методы
    public int getHead(){

        return Head;
    }
    public int getTorso(){

        return Torso;
    }

}

package LAB1;

public class BALL {
    //Переменные
    public int RedBall;
    public int BlueBall;
    public int GreenBall;

    //Конструкторы
    public BALL(){
        RedBall = 10;
        BlueBall = 20;
        GreenBall = 30;
    }

    public BALL(int RedBallPrice, int BlueBallPrice, int GreenBallPrice) {
        RedBall = RedBallPrice;
        BlueBall = BlueBallPrice;
        GreenBall = GreenBallPrice;
    }
    //Методы
    public int getRedBall(){
        return RedBall;
    }

    public int getBlueBall(){
        return BlueBall;
    }

    public int getGreenBall(){
        return GreenBall;
    }
}

package LAB1;

public class BALL_TEST {
    public static void main(String [] args) {
        BALL BallPrice = new BALL(20, 30, 45);
        System.out.println(
                "The price of the red ball is " + BallPrice.RedBall + " dollars." +
                " The price of the blue ball is " + BallPrice.BlueBall + " dollars. " +
                        "The price of the green ball is " + BallPrice.GreenBall + " dollars. "
        );
    }


}

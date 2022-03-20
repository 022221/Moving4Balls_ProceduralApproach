import processing.core.PApplet;

public class Moving4Balls extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    static int speedOfBall_1 = 0;
    static int speedOfBall_2 = 0;
    static int speedOfBall_3 = 0;
    static int speedOfBall_4 = 0;

    public static void main(String[] args) {
        PApplet.main("Moving4Balls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawBall(speedOfBall(1), (float) 1 / 5); //ball-1
        drawBall(speedOfBall(2), (float) 2 / 5); //ball-2
        drawBall(speedOfBall(3), (float) 3 / 5); //ball-3
        drawBall(speedOfBall(4), (float) 4 / 5); //ball-3
    }

    private void drawBall(int speedOfBall, float fractionOfHeight) {
        ellipse(speedOfBall, fractionOfHeight * HEIGHT, DIAMETER, DIAMETER);
    }

    private int speedOfBall(int unitsPerFrame) {
        switch (unitsPerFrame) {
            case 1:
                speedOfBall_1 = speedOfBall_1 + 1;
                return speedOfBall_1;
            case 2:
                speedOfBall_2 = speedOfBall_2 + 2;
                return speedOfBall_2;
            case 3:
                speedOfBall_3 = speedOfBall_3 + 3;
                return speedOfBall_3;
            case 4:
                speedOfBall_4 = speedOfBall_4 + 4;
                return speedOfBall_4;
        }
        return 0;
    }
}


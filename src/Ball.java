

public class Ball {
    
    private int ballX;
    private int ballY;
    private int xChange = 10; // change x speed of ball
    private int yChange = 10; // change y speed of ball
    private int xDir = 1;
    private int yDir = 1;
    
    public Ball (int x, int y) {
        ballX = x;
        ballY = y;
    }
    
    public int setBallX() {
        if ((ballX + xChange * xDir < BounceBallPanel.sLeft) ||
                (ballX + xChange * xDir > BounceBallPanel.sRight)) {
            xDir = xDir * -1;
        }
        ballX = ballX + xChange * xDir;
        return ballX;
    }
    
    public int setBallY() {
        if ((ballY + yChange * yDir < BounceBallPanel.sTop) ||
                (ballY + yChange * yDir > BounceBallPanel.sBottom)) {
            yDir = yDir * -1;
        }
        ballY = ballY + yChange * yDir;
        return ballY;
    }
    
    public void setXChange(int x) {
        xChange = x;
    }
    
    public void setYChange(int y) {
        yChange = y;
    }
}

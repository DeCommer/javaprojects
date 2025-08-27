import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MouseJiggler {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                boolean toggle = true;

                @Override
                public void run() {
                    Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                    int x = (int) mouseLocation.getX();
                    int y = (int) mouseLocation.getY();
                    if (toggle) {
                        robot.mouseMove(x + 100, y - 100);
                    } else {
                        robot.mouseMove(x - 100, y + 100);
                    }
                    toggle = !toggle;
                }
            }, 0, 100);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

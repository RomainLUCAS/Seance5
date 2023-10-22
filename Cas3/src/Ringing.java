// En train de sonner
public class Ringing implements State {
    public void click() {
        System.out.println("Sonnerie coupée");
        AlarmClock.getInstance().alarmThread.interrupt();
        AlarmClock.getInstance().setState(new On());

    }
}

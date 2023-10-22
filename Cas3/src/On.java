// Activé
public class On implements State {
    public On() {
        Thread alarmThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);

                    AlarmClock.getInstance().setState(new Ringing());
                    while (true)
                    {
                        System.out.println("Alarm sonne");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    AlarmClock.getInstance().setState(new Off());
                }
            }
        });
        AlarmClock.getInstance().setState(new Ringing());
        AlarmClock.getInstance().alarmThread = alarmThread;
        AlarmClock.getInstance().alarmThread.start();
    }
    public void click() {
        System.out.println("Désactivation du réveil");
        AlarmClock.getInstance().alarmThread.interrupt();
        AlarmClock.getInstance().setState(new Off());
    }
}

public class AlarmClock {
    private static AlarmClock Instance = null;
    public static AlarmClock getInstance() {
        if (Instance == null) {
            Instance = new AlarmClock();
        }
        return Instance;
    }

    State state;
    Thread alarmThread;
    public AlarmClock() {
        state = new Off();
    }
    public void setState(State state) {
        this.state = state;
    }

    public void click() {
        state.click();
    }



}

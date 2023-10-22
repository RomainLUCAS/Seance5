// désactivé
public class Off implements State{
    public void click() {
        System.out.println("Lancement du réveil");
        AlarmClock.getInstance().setState(new On());
    }

}

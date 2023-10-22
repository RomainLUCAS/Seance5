import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    Thread alarmThread;

    public static void main(String[] args) throws InterruptedException, IOException {

        AlarmClock.getInstance().click();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String bidon = reader.readLine();
            AlarmClock.getInstance().click();
        }

    }
}
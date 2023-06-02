import com.mrboomdev.binacty.api.client.ClientHolder;
import com.mrboomdev.binacty.api.entry.ScriptEntry;

public class Main {

    public static void main(String[] args) {
        var client = new ClientHolder() {

            @Override
            public void setReady() {
                System.out.println("Client is Ready!");
            }

            @Override
            public void setStatus(String status) {
                System.out.printf("Set Client Status: %s", status + "\n");
            }
        };

        var entry = new ScriptEntry(client) {
            @Override
            public void init() {
                this.setStatus("Script Started.");
                this.ready();
            }
        };

        entry.init();
        entry.start();
        entry.finish();
    }
}
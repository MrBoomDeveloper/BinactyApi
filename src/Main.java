import com.mrboomdev.binacty.client.BinactyClient;
import com.mrboomdev.binacty.frontend.graphics.widget.complex.SubtitlesWidget;
import com.mrboomdev.binacty.screens.flatworld.FlatWorldScreen;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var client = new TestClient();
        client.create();
    }

    private static class TestClient extends BinactyClient {
        FlatWorldScreen world;

        @Override
        public void create() {
            super.create();
            this.world = new FlatWorldScreen();

            var subtitles = new SubtitlesWidget()
                .setAuto(true)
                .setOnLineStartListener((line) -> System.out.println("Started line: " + line.text))
                .setLines(List.of(
                    new SubtitlesWidget.SubtitlesLine("Hello, everyone!", .1f, 10),
                    new SubtitlesWidget.SubtitlesLine("Welcome to Binacty", .1f, 12)
                            .setOnStartListener(() -> System.out.println("Hi!"))
                            .setOnEndListener(() -> System.out.println("Bye!")),
                    new SubtitlesWidget.SubtitlesLine("The best mobile game engine!", .1f, 16)
            ));
            world.ui.addWidget(subtitles);

            setScreen(world);
        }
    }
}
package nachricht.strategy.pattern;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AlsTextSpeichern implements SpeicherTyp {

    @Override
    public void speichern(String name, String content, String metadata) {
        try {
            try (BufferedWriter out = new BufferedWriter(new FileWriter("SavedFiles/" + name + ".txt"))) {
                out.write(content + "\n\n\n------------------------\n------------------------\nMetadata: " + metadata);
            }
        } catch (IOException e) {
            System.out.println("Exception ");

        }
    }

}

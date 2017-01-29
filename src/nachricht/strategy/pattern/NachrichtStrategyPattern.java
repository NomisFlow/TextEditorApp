package nachricht.strategy.pattern;

import java.time.LocalDateTime;

public class NachrichtStrategyPattern {

    SpeicherTyp speichertyp;
    String author;
    String title;
    LocalDateTime date;
    String text = "Example";
    String info;
    String metadata;

    public static void main(String[] args) {
        NachrichtStrategyPattern n = new NachrichtStrategyPattern();
        GUI g = new GUI();

    }

    public NachrichtStrategyPattern() {

        speichernAls(new AlsTextSpeichern());
    }

    public void textSchreiben(String t) {
        text += " " + t;
    }

    public void speichernAls(SpeicherTyp s) {
        this.speichertyp = s;
        getInfo();
        s.speichern(title, text, metadata);
    }

    private String getInfo() {
        date = LocalDateTime.now();

        try {
            info = date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear() + "    " + date.getHour() + ":" + date.getMinute();
        } catch (Exception e) {
            info = "01.01.1970 6:42";
        }

        metadata = author + "  " + date;

        return metadata;

    }

    public String setTitle(String s) {
        title = s;
        return title;
    }

    public String setAuthor(String s) {
        author = s;
        return author;
    }

}

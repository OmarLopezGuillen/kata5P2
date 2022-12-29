package main;

import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailHistogramReader;
import view.MailListReaderBD;

public class Kata5P2 {

    private static String nameFile;
    private static List<Mail> mailList;
    private static ArrayList<Mail> mailList2;
    private static Histogram<String> histogram;
    private static HistogramDisplay histogramdisplay;
    public static void main(String[] args) {
        MailListReaderBD database = new MailListReaderBD();
        MailHistogramBuilder.buildt(database.read());
        HistogramDisplay display = new HistogramDisplay(MailHistogramBuilder.buildt(database.read()));
        display.execute();
    }

    private static void input() {
        mailList2 = MailHistogramReader.read(nameFile);
        MailListReaderBD emails = new MailListReaderBD();
        mailList = emails.read();
    }

    private static void process() {
        histogram = MailHistogramBuilder.buildt(mailList);
    }
    private static void output() {
        histogramdisplay = new HistogramDisplay( histogram);
        histogramdisplay.execute();
    }
    
}
package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailHistogramReader {
    public static ArrayList<Mail> read(String nameFile) {
        ArrayList<Mail> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(nameFile)));
            while(true){
                String line = reader.readLine();
                if (line == null) break;

                if (Mail.isMail(line)){
                    list.add(new Mail(line));
                }
            }
        }
        catch(FileNotFoundException exception) {
            System.out.println("Error MailHistogramReader::read (FileNotFound)" + exception.getMessage());
        }
        catch(IOException exception){
            System.out.println("Error MailHistogramReader::read (IO)" + exception.getMessage());
        }

        return list;
    }
}
package Controller;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Mail> mails = MailListReader.
                read("C:\\Users\\Miguel\\OneDrive\\#UNI\\17-18\\Kata4IS2\\mails.txt");

        Histogram<String> histogram = MailHistogramBuilder.build(mails);

        HistogramDisplay histo = new HistogramDisplay(histogram);

        histo.execute();

    }

}
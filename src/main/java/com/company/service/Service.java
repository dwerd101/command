package com.company.service;

import com.company.model.Offer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {

    List<Offer> records ;

    public Service() {
        this.records = new ArrayList<>();
    }

    public void input() {
        //List<>
        try (BufferedReader br = new BufferedReader(new FileReader("book.csv"))) {
            String line;
            long id =0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); //s , l , 4
                if( values[0].equals("S")) {

                }
                records.add(new Offer(id, values[0], values[1], Long.parseLong(values[2]), Long.parseLong(values[3])));
                id++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

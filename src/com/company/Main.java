package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    private String _faloVardas = "duomenys.txt";
    private FileReader _in;
    private BufferedReader _bufferis;
    private FileWriter _out;

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.failoAtidarymas();
        obj.skaitymasIsFailo();
    }

    public void failoAtidarymas(){
        try {
            _in = new FileReader(_faloVardas);
            _bufferis = new BufferedReader(_in);
        }catch (Exception klaida){

        }
    }

    public void skaitymasIsFailo(){
        try{
            String eilute = _bufferis.readLine();
            while (eilute != null){
                System.out.println(eilute);
                eilute = _bufferis.readLine();
            }
            _bufferis.close();
            _in.close();
        }catch (Exception e){

        }

    }

}

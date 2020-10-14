package com;

public class Main {
    public static void main(String args[]){
        try {
            firstPage frame = new firstPage();
            Thread zing =new Thread(frame);
            zing.start();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
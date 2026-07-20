//package com.cognizant;

import java.util.Scanner;
import java.util.concurrent.Flow;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main() {
//        Logger instance= Logger.getInstance();
//        instance.log("Formatted log");
//        }
//    }
//}


public class Main{
    public static void main(String[] args){
        Channel channel = new Channel();
        Subscriber rohit= new Subscriber("Rohit");
        channel.subscribe(new Subscriber("Anurag"));
        channel.subscribe(rohit);
        channel.publish("upload video");

        channel.unsubscribe(rohit);
    }
}
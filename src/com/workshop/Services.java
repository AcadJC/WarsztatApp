package com.workshop;

public class Services {
    public static String[] list = {
            "General Review",
            "Air Conditioning Review",
            "Engine Repair",
            "Renewing Varnish",
            "Tires swap",
            "Oil and Filter Change"
    };

    public void ListPrint() {
        for(int i = 0; i<list.length; i++) {
            System.out.println(" [" + i + "]  -  " + list[i]);
        }
    }
}

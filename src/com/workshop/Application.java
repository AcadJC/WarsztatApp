package com.workshop;

import com.workshop.Services;
import static com.util.feature.Windows.clrcls;

public class Application {
    private Services srv = new Services();

    public void HeaderPrint() {
        clrcls();
        System.out.println("Car workshop client[Version: 2.1.7]");
        System.out.println("(c) 2020 AcadJC Developers. All rights reserved.");
        System.out.println("");
    }

    public void SelectServicePrint() {
        System.out.println("Please select the service you want to use.");
        srv.ListPrint();
    }
}

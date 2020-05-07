package com.workshop;

public class Car
{
    enum Brand
    {
        Audi,
        BMW,
        Citroen,
        Fiat,
        Honda,
        Mercedes,
        Opel,
        Seat
    };

    enum Color
    {
        Czerwony,
        Niebieski,
        Pomaranczowy,
        Zolty,
        Zielony,
        Czarny,
        Rozowy,
        Granatowy
    };

    public static String[] params = {
        "Car Height",
        "Car Weight",
        "Engine Weight"
    };
}

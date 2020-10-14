package ru.geekbrains.java.HomeWork.java_two.hw_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] text = {"риф", "лампа", "предок", "день", "таящийся", "порог", "мансарда", "лампа", "книга", "ужас", "книга", "наследство", "безумие", "тень", "таящийся", "океан", "звёзды", "дерево", "холм", "время"};

        HashSet<String> listText = new HashSet<>();
        addElements(text, listText);
        System.out.println(listText);

        HashMap<String, Integer> hm = new HashMap<>();

        for (String word : text)
        {
            if (!hm.containsKey(word))
            {
                hm.put(word, 0);
            }
            hm.put(word, hm.get(word) + 1);
        }
        for (String word : hm.keySet())
        {
            System.out.println(word + " " + hm.get(word));
        }
    }


    public static void addElements(String[] text, HashSet<String> listText) {
        for (int i = 0; i < text.length; i++) {
            listText.add(text[i]);
        }
    }


}
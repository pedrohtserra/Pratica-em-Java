package Estruturas;

import java.util.*;

public class Main {
    public static void main (String[] args){
        List<String> list = new ArrayList<>();
        list.add("Pedro Henrique");
        list.add("Pedro Henriquelson");
        list.add("Pedrito Henrique");
        System.out.println("list: " + list);

        Set<String> setStrings = new HashSet<>();
        setStrings.add("Hello");
        setStrings.add("Pedro");
        setStrings.add("Pedro");
        System.out.println("setStrings: " + setStrings);
        System.out.println(setStrings.contains("Pedro"));

        Map<String, String> map = new HashMap<>();
        map.put("nome", "Pedro Henrique");
        map.put("sobrenome", "Toniolo Serra");
        System.out.println(map.get("nome"));

        Queue<String> queue = new LinkedList<>();
        queue.add("Pedro");
        queue.add("Hello");
        queue.add("Carlos");
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.peek());
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.remove());
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);

        List<String> pedros = list.stream().filter(nome -> nome.startsWith("Pedro")).map(String::toUpperCase).toList();
        System.out.println("Lista de Pedros: " + pedros);
    }
}

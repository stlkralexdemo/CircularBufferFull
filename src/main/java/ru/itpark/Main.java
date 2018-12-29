package ru.itpark;

public class Main {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(10);

        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4);
        buffer.add(5);
        buffer.add(6);
        buffer.add(7);
        buffer.add(8);
        buffer.add(9);
        buffer.add(10);
        buffer.add(11);
        buffer.add(12);

        System.out.println(buffer.getBuffer());
    }

}

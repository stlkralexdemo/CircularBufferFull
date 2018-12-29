package ru.itpark;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CircularBuffer {
    int maxSize;

    public CircularBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    private Queue<Integer> buffer = new ArrayDeque<>();

    public void add(int value) {
        buffer.add(value);
        if (buffer.size() > maxSize) buffer.remove();
    }

    public List<Integer> getBuffer(){
        return new ArrayList<>(buffer);
    }

}


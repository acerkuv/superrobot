package org.example.simplerobot;

import java.util.*;

import static java.lang.System.out;

public class Robot implements Behavior{
    private int x;
    private int y;
    private final  Set<String> trace = new HashSet<>();
    Robot(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void move(Step s) {
        switch (s){
            case UP -> this.y++;
            case DOWN -> this.y--;
            case LEFT -> this.x--;
            case RIGHT -> this.x++;
        }
        isIntersection();
    }
    //Пересечение со старым следом определяется в момент,
    // когда нельзя записать в коллекуию уникальных значеней Set
    private void isIntersection(){
        int[]t = new int[]{this.x, this.y};
        if (!this.trace.add(Arrays.toString(t)))
            out.println("Я уже тут был " + Arrays.toString(t));
        }

    public String readTrace(){
        StringBuilder s = new StringBuilder();
        for (String i: this.trace) s.append(i);
        return s.toString();
    }

}

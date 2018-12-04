package com.practica.java.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class PriorityQueueTest {
    private PriorityQueue priorityQueue;

    @Before
    public void setUp() throws Exception {
        priorityQueue = new PriorityQueue(10);
    }

    @Test
    public void insert() {
        priorityQueue.insert(9);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(7);
        priorityQueue.insert(1);

        Assert.assertEquals(1,priorityQueue.remove());
    }

    @Test
    public void remove() {
    }

    @Test
    public void size() {
        priorityQueue.insert(9);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(7);
        priorityQueue.insert(1);

        Assert.assertEquals(5,priorityQueue.size());
    }


    @Test
    public void testMouseRobot() {


        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int xCenter = (int) b.getX();
        int yCenter = (int) b.getY();
        double radius = 100; //px
        int angle = 0;

        try

        {
            System.out.println("xCenter=" + xCenter);
            System.out.println("yCenter=" + yCenter);

            Robot r = new Robot();
            while (1 == 1) {

                Thread.sleep(15);

                int xPoint = xCenter + ((Double)(radius * Math.cos(Math.toRadians(angle)))).intValue();
                int yPoint = yCenter + ((Double)(radius * Math.sin(Math.toRadians(angle)))).intValue();
                //System.out.println("XPoint=" + xPoint + "; YPoint=" + yPoint);

                r.mouseMove(xPoint, yPoint);

                if (angle == 360) {
                    angle = 0;
                } else {
                    angle = angle + 2;
                }
            }
        } catch(
                Exception e)

        {
            System.out.println(e.toString());
        }
    }

}
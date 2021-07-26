package com.tms.homework;

import com.tms.homework.hands.IHand;
import com.tms.homework.hands.SonyHand;
import com.tms.homework.hands.SumsungHand;
import com.tms.homework.hands.ToshibaHand;
import com.tms.homework.heads.IHead;
import com.tms.homework.heads.SonyHead;
import com.tms.homework.heads.SumsungHead;
import com.tms.homework.heads.ToshibaHead;
import com.tms.homework.legs.ILeg;
import com.tms.homework.legs.SonyLeg;
import com.tms.homework.legs.SumsungLeg;
import com.tms.homework.legs.ToshibaLeg;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SonyHand sonyHand = new SonyHand(150);
        SumsungHand sumsungHand = new SumsungHand(200);
        ToshibaHand toshibaHand = new ToshibaHand(100);
        List<IHand> hands = new ArrayList<>();
        hands.add(sonyHand);
        hands.add(sumsungHand);
        hands.add(toshibaHand);

        for (IHand hand : hands) {
            hand.upHand();
            System.out.println("Цена элемента рука " + hand.getPrice());
        }

        SonyHead sonyHead = new SonyHead(250);
        SumsungHead sumsungHead = new SumsungHead(400);
        ToshibaHead toshibaHead = new ToshibaHead(500);
        List<IHead> heads = new ArrayList<>();
        heads.add(sonyHead);
        heads.add(sumsungHead);
        heads.add(toshibaHead);

        for (IHead head : heads) {
            head.speek();
            System.out.println("Цена элемента голова " + head.getPrice());
        }

        SonyLeg sonyLeg = new SonyLeg(125);
        SumsungLeg sumsungLeg = new SumsungLeg(110);
        ToshibaLeg toshibaLeg = new ToshibaLeg(130);
        List<ILeg> legs = new ArrayList<>();
        legs.add(sonyLeg);
        legs.add(sonyLeg);
        legs.add(toshibaLeg);
        for (ILeg leg : legs) {
            leg.step();
            System.out.println("Цена элемента нога " + leg.getPrice());
        }

        Robot robot1 = new Robot(sumsungHead, toshibaHand, sonyLeg);
        Robot robot2 = new Robot(sonyHead, sumsungHand, toshibaLeg);
        Robot robot3 = new Robot(toshibaHead, sonyHand, sumsungLeg);
        List<IRobot> robots = new ArrayList<>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);

        for (IRobot robot : robots) {
            robot.toString();
            System.out.println();
            robot.action();
            System.out.println();
            System.out.println("Цена данного экземпляра " + robot.getPrice());

        }


        //System.out.println(Collections.max();


    }
}

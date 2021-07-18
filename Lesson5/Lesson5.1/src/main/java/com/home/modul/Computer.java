package com.home.modul;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram;
    private int hdd;
    private int resourseCycles;

    public Computer(String cpu, int ram, int hdd, int resourseCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resourseCycles = resourseCycles;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResourseCycles() {
        return resourseCycles;
    }

    public void setResourseCycles(int resourseCycles) {
        this.resourseCycles = resourseCycles;
    }

    public void info() {
        System.out.println("CPU " + cpu + "RAM " + ram + "HDD " + hdd + "Ресурс полных циклов " + resourseCycles);
        System.out.printf("CPU %s RAM %d HDD %d Ресурс полных циклов %d", cpu, ram, hdd, resourseCycles);

    }

    public void on() {
        System.out.println("Computer ON");
        if (checkAction()) {
            off();
        } else {
            burned();
        }

    }

    private void burned() {
        System.out.println("Computer on fire");
    }

    private boolean checkAction() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        return true;
    }

    public void off() {
        resourseCycles--;
        System.out.println("Computer OFF");

    }

    private boolean cheackResourseCicle() {
        return true;

    }

}

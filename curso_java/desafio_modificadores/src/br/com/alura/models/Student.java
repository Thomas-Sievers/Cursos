package br.com.alura.models;

public class Student {
    private String name;
    private int numberGrades;
    private double allGrades;

    public String getName(){
        return name;
    }

    public int getNumberGrades(){
        return numberGrades;
    }

    public double getAllGrades(){
        return allGrades;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumberGrades(int numberGrades){
        this.numberGrades = numberGrades;
    }

    public void setAllGrades(double allGrades){
        this.allGrades = allGrades;
    }

    public void studentGrades(double studentGrade){
        allGrades += studentGrade;
        numberGrades ++;
    }

    public double studentAverage(){
        return allGrades/numberGrades;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(numberGrades);
        System.out.println(allGrades);
        System.out.println(studentAverage());
    }
}

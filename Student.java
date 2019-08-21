
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudenttestscore;

/**
 *
 * @author mache9294
 */
public class Student {

    private String name;
    private int test1;
    private int test2;
    private int test3;
    private int index;
    private double average;

    public Student() {
        name = "ghost";
        test1 = 50;
        test2 = 50;
        test3 = 50;
    }

    public Student(String name, int test1, int test2, int test3, int index, double average) {
        this();
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.index = index;
        this.average = (double) (test1 + test2 + test3) / 3.0;
    }

    public int highScore() {
        int ret = test3;
        if (test1 > test2 && test1 > test3) {
            ret = test1;
        } else if (test2 > test3 && test2 > test1) {
            ret = test2;
        }
        return ret;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the test1
     */
    public int getTest1() {
        return test1;
    }

    /**
     * @param test1 the test1 to set
     */
    public void setTest1(int test1) {
        this.test1 = test1;
    }

    /**
     * @return the test2
     */
    public int getTest2() {
        return test2;
    }

    /**
     * @param test2 the test2 to set
     */
    public void setTest2(int test2) {
        this.test2 = test2;
    }

    /**
     * @return the test3
     */
    public int getTest3() {
        return test3;
    }

    /**
     * @param test3 the test3 to set
     */
    public void setTest3(int test3) {
        this.test3 = test3;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the average
     */
    public double getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(double average) {
        this.average = average;
    }

}

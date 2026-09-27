package org.example;

public class childClass extends absClass{
    int data2;

    public childClass(int data1, int data2) {
        super(data1);
        this.data2 = data2;
    }
    @Override
    public boolean method2() {
        return false;
    }
}

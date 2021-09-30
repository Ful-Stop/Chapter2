package com.company;

public class BoxBox {
    private double height, length, width;
    private String color;
    private boolean hasALid;

    public BoxBox(double h, double w, double l, String c, boolean lid) {
        height = h;
        width = w;
        length = l;
        color = c;
        hasALid = lid;
    }

    public BoxBox(double h, double w, double l){    //if you only want to tell the size of the box, default will be white and true for color and lid
        height = h;
        width = w;
        length = l;
        color = "white";
        hasALid = true;
    }

    public BoxBox(){    //default constructor
        height = 1d;
        width = 6d;
        length = 12d;
        color = "white";
        hasALid = true;
    }

    //  accessor methods
    public void setHeight(double h){
        if(h < 0) {
            Math.abs(h);
            height = h;
        }
        else if(h > 0)  {
            height = h;
        }
    }

    public double getHeight(){
        return height;
    }

    public double volume(){
        return length * width * height;
    }

    public String toString(){
        String s = "A box with dimensions " + height + ", " + width + ", " + length;
        s += ". It's color is " + color + " and it has a lid? " + hasALid;
        return s;
    }

    public static void main(String[] args) {
        // create instances of BoxBox
        BoxBox b1 = new BoxBox(5d, 3d, 7d, "red", false);
        BoxBox b2 = new BoxBox(4.5, 3.7, 7.8);
        BoxBox b3 = new BoxBox();

        System.out.println(b1.getHeight());
        b1.setHeight(-9.9);
        System.out.println(b1.getHeight());
        //System.out.println(b1.height=-12d); much better to do via get and set methods like we've done above with height so we can set gates that must be passed, like the input being a positive number
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());

        int x = 5;
        String name = "mario kart";
        System.out.println(x);
        System.out.println(name);
        System.out.println(b1);

    }
}

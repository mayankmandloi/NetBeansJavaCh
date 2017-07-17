/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbhumi;

/**
 *
 * @author web-bhumi
 */
public class ThisKeyword {

    int rollno;
    String name;
    float fee;

    ThisKeyword(int r, String name, float fee) {
        System.out.println(r+ " " + name + " " + fee);
        rollno=r;
        this.name=name;
        this.fee=fee;
        System.out.println(this.rollno + " " + this.name + " " + this.fee);

    }
    

    
    
    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class TestThis1 {

    public static void main(String args[]) {
        ThisKeyword s1 = new ThisKeyword(111, "ankit", 5000f);
        ThisKeyword s2 = new ThisKeyword(112, "sumit", 6000f);
        s1 = new ThisKeyword(113, "Adarsh", 4000f);
        s1.display();
        s2.display();
    }
}

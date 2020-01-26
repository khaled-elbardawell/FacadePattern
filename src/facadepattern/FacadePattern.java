/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern;

class facade{
    private circle c;
    private rectangle r;
    public facade(){
        this.c=new circle();
        this.r=new rectangle();
    }
    public void drawCircle(){
        c.draw();
    }
     public void drawRectangle(){
        r.draw();
    }
}

interface shape{
    public void draw();
}
class circle implements shape{

    @Override
    public void draw() {
        System.out.println("circle draw .. ");
    }
    
}

class rectangle implements shape{

    @Override
    public void draw() {
      System.out.println("rectangle draw .. ");   
    }
}

public class FacadePattern {

    public static void main(String[] args) {
       facade f=new facade();
       f.drawCircle();
       f.drawRectangle();
    }
    
}

package structurial.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PaintFabric {
    private Map<String,Paint> paints;
    public PaintFabric() {
       paints = new HashMap<String, Paint>();
    }
    public Paint getPaint(String paintName){
       Paint paint = paints.get(paintName);
       if(paint == null){
           switch(paintName){
               case "red" :{
                   paint = new RedPaint();
                   break;
               }
               case "green":{
                   paint =new GreenPaint();
                   break;
               }
           }
           paints.put(paintName,paint);
       }
       return paint;
    }
}

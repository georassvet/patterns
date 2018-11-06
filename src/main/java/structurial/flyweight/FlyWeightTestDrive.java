package structurial.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightTestDrive {
    public static void main(String[] args) {

        PaintFabric paintFabric = new PaintFabric();

        List<Paint> paintList = new ArrayList<Paint>();
        paintList.add(paintFabric.getPaint("red"));
        paintList.add(paintFabric.getPaint("red"));
        paintList.add(paintFabric.getPaint("red"));
        paintList.add(paintFabric.getPaint("red"));
        paintList.add(paintFabric.getPaint("red"));
        paintList.add(paintFabric.getPaint("red"));
        paintList.add(paintFabric.getPaint("green"));
        paintList.add(paintFabric.getPaint("green"));
        paintList.add(paintFabric.getPaint("green"));
        paintList.add(paintFabric.getPaint("green"));
        paintList.add(paintFabric.getPaint("green"));
        paintList.add(paintFabric.getPaint("green"));
        paintList.add(paintFabric.getPaint("green"));

        for (Paint paint :paintList){
            paint.paint();
        }

    }
}

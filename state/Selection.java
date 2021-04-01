package state;

public class Selection implements Tool {
    @Override
    public void mouseDown(){
        System.out.println("Selection icon.");
    }

    @Override
    public void mouseUp(){
        System.out.println("draw dashed rectangle.");
    }
}

public class SafeToFile implements Visitor {
    String saveToFile;

    public void setSTF(String stf){
        this.saveToFile = stf;
    }

    @Override
    public void visit(Rectangle element) {
        System.out.println("Saving the rectangle... with width = " + element.getWidth() + (" height = ") + element.getHeight()
                                + (" at position ") + element.getxPos() +(", ") + element.getyPos()+ (" as ") + saveToFile);
    }

    @Override
    public void visit(Triangle element) {
        System.out.println("Saving the triangle...with base = " + element.getBase() + (" height = ") + element.getHeight()
                                + (" at position ") + element.getxPos() +(", ") + element.getyPos()+ (" as ") + saveToFile);
    }

    @Override
    public void visit(Circle element) {
        System.out.println("Saving the circle... with radius = " + element.getRadius() + (" at position ") 
                                + element.getxPos() +(", ") + element.getyPos()+ (" as ") + saveToFile);

    }

    
    
}

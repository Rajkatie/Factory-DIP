import com.automation.abstraction.Shape;
import com.automation.abstraction.ShapeFactory;
import com.automation.impl.ShapeFactoryImp;

public class main

{
    public static void main(String[] args) {


        try {

            ShapeFactory shapeFactory = new ShapeFactoryImp();

           Shape shape = shapeFactory.MakeShape("circle");

            System.out.println("shape:: " + shape.Draw());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

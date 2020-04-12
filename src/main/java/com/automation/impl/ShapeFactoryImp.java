package com.automation.impl;

import com.automation.abstraction.Shape;
import com.automation.abstraction.ShapeFactory;


public class ShapeFactoryImp implements ShapeFactory {
    @Override
    public Shape MakeShape(String shapeName) {

        if (shapeName.toLowerCase().equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return new Square();
    }
}

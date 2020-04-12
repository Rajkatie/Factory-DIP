package com.automation.impl;

import com.automation.abstraction.Shape;

public class Square implements Shape
{
    @Override
    public String Draw()
    {
        return "Square draw...";
    }
}
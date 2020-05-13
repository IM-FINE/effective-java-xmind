package com.jyh.item21;

public class ClassIml implements InterfaceWithDefault
{
    @Override
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

    @Override
    public int addThree(int num1, int num2, int num3)
    {
        return num1 * num2 * num3 * 2;
    }


}

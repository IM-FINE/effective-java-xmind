package com.jyh.item21;

public interface InterfaceWithDefault
{
    int add(int num1, int num2);

    default int addThree(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }

}

package com.rahul.output.constructor;

class CodeA
{
    public String type = "A ";
    public CodeA() {
        System.out.print("CodeA ");
    }
}

public class CodeB extends CodeA
{
    public CodeB() {
        System.out.print("CodeB ");
    }

    void go()
    {
        type = "B ";
        System.out.print(this.type + super.type);
    }

    public static void main(String[] args)
    {
        new CodeB().go();
    }
}
/* o/p  CodeA CodeB B B
* don't know reason for last B */
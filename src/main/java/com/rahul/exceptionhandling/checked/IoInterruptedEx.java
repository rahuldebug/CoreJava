package com.rahul.exceptionhandling.checked;

import java.io.FileNotFoundException;
import java.io.IOException;

// I/O exception is parent of file not found exception
// Interrupted exception
public class IoInterruptedEx {
    public static void main(String[] args) {
        String str = "abc";
        try {
            method1(str);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        // we cannot add any other type of catch block other than declared in throws
        // add parent exception at end else message will come exception already caught
        //
    }

    private static void method1(String str) throws InterruptedException, IOException {
        if (str.equals("abc")) {
            throw new InterruptedException("interrupted exception");
        } else {
            throw new IOException("io exception thrown");
        }
    }
}

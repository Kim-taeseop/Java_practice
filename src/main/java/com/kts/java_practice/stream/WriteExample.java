package com.kts.java_practice.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

// OutputStream 의 write() 사용
public class WriteExample {
    public static void main(String[] args) throws Exception{
        OutputStream os = new FileOutputStream("/Users/kts/tabby/stream/test1.db");

        byte a =10;
        byte b =20;
        byte c =30;

        os.write(a);
        os.write(b);
        os.write(c);

        os.flush();
        os.close();
    }
}

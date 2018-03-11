package org.dy.test;

public class PngSaver implements ImageSaver {
    @Override
    public void save(){
        System.out.println("保存 PNG 图片");
    }
}

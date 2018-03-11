package org.dy.test;

public class EncryptUncrypt {
    public static String EAndU(String value, char secret){
        byte[] bt = value.getBytes();
        for (int i=0;i<bt.length;i++){
            bt[i] = (byte)(bt[i]^(int)secret);
        }
        return new String(bt,0,bt.length);
    }
}

package vkgraberpost;

import java.math.BigInteger;
import java.security.*;
import javax.swing.JOptionPane;

public class Lib {
    
    //=====Функция MD5 =========================================================
    public static String md5(String str) {
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            digest = messageDigest.digest();
        } catch(NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);
        while(md5Hex.length() < 32) {
            md5Hex = "0" + md5Hex;
        }
        return md5Hex;
    }
    //=====Функция MD5 end =====================================================
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Skaylee
 */
public class fungsi {
    public static float uangmakan(int gaji){
        return (float) (0.1*gaji);
    }
    
public static float transport(int gaji){
    return (float) (0.1*gaji);
}

public static float totalg(float makan, float transport, int gaji){
    return makan+transport+gaji;
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nyobajava;

/**
 *
 * @author Havid
 */
public class NyobaJava {
    
    float gpa;
    public NyobaJava(int GPA){
     this.gpa =GPA;
    }

    public double Grade(){
        double valueGrade;
        valueGrade = gpa+10;
        
        return valueGrade;
    }
    public void Cetak (){
        System.out.println("GPA is " + Grade ());
    }
    public static void main (String[] args){
        NyobaJava results = new NyobaJava(100);
        results.Cetak();
    }
}

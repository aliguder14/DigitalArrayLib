/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DigitArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ali.guder
 */
public class DigitArray implements Comparable<DigitArray> {
    
    private final List<Byte> digitList;
    private final Integer num;
    private final Long longNum;    
    

    
    public DigitArray(int num) {
        
        this.num = num;
        this.longNum =null;
        List<Byte> tempDigitList = new ArrayList<>();
        
        for (int subNum = num; subNum > 0; subNum /= 10) {
            
            byte digit = (byte)(subNum % 10);
            tempDigitList.add(digit);
        }
        
        digitList = Collections.unmodifiableList(tempDigitList);
    }
    
    public DigitArray(Integer num) {
        
        this.num = num;
        this.longNum = null;
        List<Byte> tempDigitList = new ArrayList<>();
        
        for (int subNum = num; subNum > 0; subNum /= 10) {
            
            byte digit = (byte)(subNum % 10);
            tempDigitList.add(digit);
        }
        
        digitList = Collections.unmodifiableList(tempDigitList);
    }

    public DigitArray(long num) {
        
        this.longNum = num;
        this.num = null;
        List<Byte> tempDigitList = new ArrayList<>();
        
        for (long subNum = num; subNum > 0; subNum /= 10) {
            
            byte digit = (byte)(subNum % 10);
            tempDigitList.add(digit);
        }
        
        digitList = Collections.unmodifiableList(tempDigitList);
    }
    
    public DigitArray(Long num) {
        
        this.longNum = num;
        this.num = null;
        List<Byte> tempDigitList = new ArrayList<>();
        
        for (long subNum = num; subNum > 0; subNum /= 10) {
            
            byte digit = (byte)(subNum % 10);
            tempDigitList.add(digit);
        }
        
        digitList = Collections.unmodifiableList(tempDigitList);
    }
    
    public int Get(int i) {
        
        return  digitList.get(i-1);
    }
    
    public int GetFirst() {
        
        return  digitList.get(1);
    }
    
    public int GetLast() {
        
        return  digitList.get(digitList.size()-1);
    }
    
    public int sumOfDigits() {
        
        int sum = digitList.stream().mapToInt((value) -> value).sum();       
        return  sum;
    }
    
    public int countOfDigits() {
        
        return digitList.size();
    }
    
    public  int getValue() {
        return this.num;
    }

    public  long getLongValue() {
        return this.longNum;
    }
    
    public boolean equals(int num) {
        
        return  this.num == num;
    }
    
    public boolean equals(long num) {
        
        return  this.longNum == num;
    }
    
    public boolean equals(DigitArray arr) {
        
        return  arr.getValue() == this.num || arr.getLongValue() == this.longNum;
    }
    
    public boolean equals(Integer num) {
        
        return  this.num.equals(num);
    }

    @Override
    public int compareTo(DigitArray arr) {
        
        if (arr.getValue() < this.num || arr.getLongValue() < this.longNum) {
            
            return 1;
        }
        
        else if(arr.getValue() == this.num || arr.getLongValue() == this.longNum) {
            
            return  0;
        }
        
        return -1;
    }
    
    public int compareTo(int num) {
        
        if (num < this.num) {
            
            return 1;
        }
        
        else if(num == this.num) {
            
            return  0;
        }
        
        return -1;
    }
    
    public int compareTo(Integer num) {
        
        if (num < this.num) {
            
            return 1;
        }
        
        else if(num.equals(this.num)) {
            
            return  0;
        }
        
        return -1;
    }
}

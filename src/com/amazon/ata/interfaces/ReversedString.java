package com.amazon.ata.interfaces;

public class ReversedString implements CharSequence {

    private final String original;

    public ReversedString(final String chars) {
        this.original = chars;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        
        String substring = original.substring(original.length() - end, original.length() - start);
        
        StringBuilder reversed = new StringBuilder(substring).reverse();
        return reversed.toString();
    }

    @Override
    public String toString() {
        
        return new StringBuilder(original).reverse().toString();
    }

    
    public static void main(String[] args) {
        ReversedString reversedString = new ReversedString("cat");

        
        System.out.println(reversedString.charAt(0)); 

        
        System.out.println(reversedString.length()); 

        
        CharSequence subSequence = reversedString.subSequence(0, 2);
        System.out.println(subSequence); 

        
        System.out.println(reversedString.toString()); 
    }
}

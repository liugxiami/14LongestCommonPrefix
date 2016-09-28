package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String[] strs={"abcdefg","aacjjj","abcdepp","abcdefp"};
        System.out.println(longestCommonPrefix(strs));
    }
    //Write a function to find the longest common prefix string amongst an array of Strings.
    public static String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0)return null;
        int maxLen=strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < maxLen; j++) {                     //不断更新最好的公共前缀。
                if(strs[i].charAt(j)!=strs[i-1].charAt(j))maxLen=j;//其实更strs[0]比较就行了。
            }
        }
        return strs[0].substring(0,maxLen);
    }
}

package com.praveen.service;

import org.springframework.stereotype.Service;

@Service
public class StringServiceImp implements StringService{
    @Override
    public String compress(String input) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < input.length(); i++) {
            countConsecutive++;

            if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
                compressed.append(input.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.toString();
    }
}

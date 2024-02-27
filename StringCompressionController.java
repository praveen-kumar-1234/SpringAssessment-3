package com.praveen.controller;

import com.praveen.model.StringCompress;
import com.praveen.service.StringServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringCompressionController {

    @Autowired
    private StringServiceImp service;

    @PostMapping("/compress")
    @ResponseBody
    public String compressString(@RequestBody StringCompress stringCompress) {
        String compressedString = service.compress(stringCompress.getInput());
        return (compressedString.length() < stringCompress.getInput().length()) ? compressedString : stringCompress.getInput();
    }


}

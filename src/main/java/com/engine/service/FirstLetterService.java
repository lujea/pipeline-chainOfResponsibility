/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.engine.service;

import com.engine.handlers.ITaskHandler;
import com.engine.input.InputDocument;
import com.engine.input.TaggingResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ludovic 
 * class that retrieves the first letter of the text
 */
public class FirstLetterService implements ITaskHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public TaggingResult doAction(InputDocument doc) {
        TaggingResult res = new TaggingResult();
        String firstLetter = doc.getCnt().substring(0, 1);
        res.setFirstLetter(firstLetter);
        logger.info("First letter: {}", firstLetter);
        return res;
    }

}

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
 * Class that computes the length of the document
 */
public class TextSizeService implements ITaskHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public TaggingResult doAction(InputDocument doc) {
        TaggingResult res = new TaggingResult();
        int textSize = doc.getCnt().length();
        res.setLen(textSize);
        logger.info("text size {}", textSize);
        return res;
    }

}

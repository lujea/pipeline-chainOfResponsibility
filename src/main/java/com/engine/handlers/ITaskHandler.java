/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.engine.handlers;

import com.engine.input.InputDocument;
import com.engine.input.TaggingResult;

/**
 *
 * @author ludovic
 */
//Interface that every task should implement
public interface ITaskHandler {
    
    public TaggingResult doAction(InputDocument doc);
    
}

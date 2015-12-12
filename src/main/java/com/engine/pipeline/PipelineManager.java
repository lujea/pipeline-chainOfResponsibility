/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.engine.pipeline;

import com.engine.handlers.ITaskHandler;
import com.engine.input.InputDocument;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ludovic
 */
public class PipelineManager {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //contains the list of actual actions in the pipeline
    List<ITaskHandler> handlers;
        
    public PipelineManager() {
    }

    public void doAction(InputDocument testDoc) {
        logger.info("Inside pipeline");
        for (ITaskHandler handler : handlers) {            
            handler.doAction(testDoc);
        }
    }    

    public void setHandlers(List<ITaskHandler> handlers) {
        this.handlers = handlers;
    }

}

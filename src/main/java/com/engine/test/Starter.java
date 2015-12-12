/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.engine.test;

import com.engine.input.InputDocument;
import com.engine.pipeline.PipelineManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ludovic
 */
public class Starter {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("pipelineConfig.xml");
        PipelineManager pipeline = (PipelineManager) context.getBean(PipelineManager.class);

        String[] docArray = {"This is doc 1", "Another document"};
        
        for (String doc : docArray){
            InputDocument in = new InputDocument();
            in.setCnt(doc);
            pipeline.doAction(in);
        }

    }

}

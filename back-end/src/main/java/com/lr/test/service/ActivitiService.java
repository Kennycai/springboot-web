package com.lr.test.service;



import org.activiti.engine.task.Task;

import java.util.List;

/**
 * @author kenny.cai
 */
public interface ActivitiService {
    void startProcess();
    List<Task> getTasks(String assigness);
}

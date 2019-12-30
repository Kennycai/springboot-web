package com.lr.test.service.impl;

import com.lr.test.service.ActivitiService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;

import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kenny.cai
 */
@Service
public class ActivitServiceImpl implements ActivitiService {
    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Override
    @Transactional
    public void startProcess() {
        runtimeService.startProcessInstanceByKey("oneTaskProcess");
    }

    @Override
    public List<Task> getTasks(String assignee) {
        return taskService.createTaskQuery().processDefinitionId("oneTaskProcess:1:3").list();
    }
}

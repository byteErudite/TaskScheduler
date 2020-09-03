package com.vaibhav.controller;

import com.vaibhav.common.TaskSearchRequest;
import com.vaibhav.hibernate.entity.Task;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.vaibhav.common.Constants.DEFAULT_SIZE_VALUE_STRING;
import static com.vaibhav.common.Constants.FORWARD_SLASH;
import static com.vaibhav.common.Constants.SEARCH;
import static com.vaibhav.common.Constants.TASK;

@RestController
@RequestMapping(value = TASK)
public class TaskController {

//    @PostMapping(value = FORWARD_SLASH
//            + SEARCH, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public List<Task> searchTasks(@RequestBody final TaskSearchRequest activitySearchRequest,
//                                      @RequestParam(required = false, defaultValue = DEFAULT_SIZE_VALUE_STRING) @Min(value = 1)  Integer size) throws CustomException {
//        {
}

package com.register.web.controllers;
import com.register.web.models.IsolationCenter;
import com.register.web.repositories.IsolationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/api/isolationcenter")
public class IsolationCenterContoller {

    @Autowired
    private IsolationCenterRepository isolationCenterRepository;

    @GetMapping("list")
    public List<IsolationCenter> getIsolationCenters() {
        return isolationCenterRepository.findAll();
    }
}

package com.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class MonServiceImpl implements MonService {
    @Override
    public String getMessage() {
        return "Message from Service";
    }
}

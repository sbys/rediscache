package com.example.rediscache.service;

import com.example.rediscache.bean.Person;

public interface DemoService {
    public Person save(Person person);
    public void remove(Long id);
    public Person findOne(Person person);
}

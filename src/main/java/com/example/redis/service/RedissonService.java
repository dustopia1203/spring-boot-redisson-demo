package com.example.redis.service;

import org.springframework.stereotype.Service;

@Service
public interface RedissonService {

    void setCache(String key, Object object);

    Object getCache(String key);

    void deleteCache(String key);

}

package com.example.redis.service.impl;

import com.example.redis.service.RedissonService;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedissonServiceImpl implements RedissonService {

    private final RedissonClient client;

    @Override
    public void setCache(String key, Object object) {
        RBucket<Object> bucket = client.getBucket(key);
        bucket.set(object);
    }

    @Override
    public Object getCache(String key) {
        RBucket<Object> bucket = client.getBucket(key);
        return bucket.get();
    }

    @Override
    public void deleteCache(String key) {
        RBucket<Object> rMap = client.getBucket(key);
        rMap.delete();
    }

}

package com.example.redis;

import com.example.redis.model.Client;
import com.example.redis.service.RedissonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/redis")
@RequiredArgsConstructor
public class RedisController {

    private final RedissonService redissonService;

    @GetMapping("")
    public Object getCache() {
        return redissonService.getCache("client");
    }

    @PostMapping("")
    public void setCache(@RequestBody Client client) {
        redissonService.setCache("client", client);
    }

    @DeleteMapping("")
    public void deleteCache() {
        redissonService.deleteCache("client");
    }

}

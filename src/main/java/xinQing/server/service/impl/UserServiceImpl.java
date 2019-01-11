package xinQing.server.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import xinQing.api.dto.UserDto;
import xinQing.api.service.UserApi;

import java.util.ArrayList;
import java.util.List;

/**
 * 注意：这里是dubbo的@Service
 * `@Component` 被Spring管理，声明一个Bean
 * `@Service`就是dubbo本身的注解,用于声明接口暴露
 */
@Component
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserApi {

    public List<UserDto> findAll() {
        Jedis jedis = new Jedis("132.232.175.240", 6379);
        Gson gson = new Gson();
        List<UserDto> userDtos = gson.fromJson(jedis.get("dubboserver"), new TypeToken<ArrayList<UserDto>>() {
        }.getType());
        jedis.close();
        return userDtos;
    }
}

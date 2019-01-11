package xinQing.server.service.impl;

import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("132.232.175.240", 6379);
        //        userDtos.add(new UserDto(1L,"xxbjiy@163.com"));
//        userDtos.add(new UserDto(2L,"xxbjiy@vip.qq.com"));
//        Gson gson = new Gson();
//        jedis.set("dubboserver",gson.toJson(userDtos));

        System.out.println(jedis.get("dubboserver"));
    }
}

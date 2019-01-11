package xinQing;

public class Main {
    public static void main(String[] args) {
        com.alibaba.dubbo.container.Main.main(args);
        /* 官方提供的入口方法 更安全 输出信息更精简有效
        配置信息必须放至resources/META-INF/spring 会自动扫描
        无需springmvc配置文件*/
    }
}

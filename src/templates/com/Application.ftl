package  com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * Spring Boot 应用启动类
 *
 *
 * @author qiumingyuan
 *
 */
@EnableScheduling
@EnableCaching
//@ImportResource(locations = { "classpath:dubbo/dubbo-all.xml" })
//@ComponentScan({"com"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);
    }
}

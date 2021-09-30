package superisesmthef.tbclothingcollocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TbClothingCollocationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TbClothingCollocationApplication.class, args);
    }

}

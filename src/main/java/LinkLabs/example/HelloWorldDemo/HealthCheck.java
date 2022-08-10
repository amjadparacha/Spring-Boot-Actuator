package LinkLabs.example.HelloWorldDemo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class HealthCheck implements HealthIndicator {


    @Override
    public Health health() {
        int errorCode = check();
        if(errorCode != 0) {
            return Health.down()
                    .withDetail("Error Code", errorCode).build();
        }
        return Health.up()
                .withDetail("Health is good", 100).build();
    }

    public int check() {
        // Our logic to check health
        return 0;
    }
}

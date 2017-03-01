package io.unicorn;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * Created by Abderrazak BOUADMA
 * on 01/03/2017.
 */
public class FakeHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("DataBase", "Database Is okay").build();
    }
}

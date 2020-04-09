package com.jamesball.cockpit;

import com.jamesball.cockpit.domain.Goal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class CockpitApplicationRunner implements CommandLineRunner {

    private MongoTemplate mongoTemplate;

    public CockpitApplicationRunner(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        Goal emptyGoal = new Goal();
        mongoTemplate.save(emptyGoal);

        System.out.println("Application started ...");
    }

}

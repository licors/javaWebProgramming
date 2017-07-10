package next.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import core.jdbc.ConnectionManager;
import next.model.Answer;

public class AnswerDaoTest {
	@Before
    public void setup() {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(new ClassPathResource("jwp.sql"));
        DatabasePopulatorUtils.execute(populator, ConnectionManager.getDataSource());
    }

    @Test
    public void findAll() throws Exception {
    	AnswerDao answerDao = new AnswerDao();
    	List<Answer> answers= answerDao.findAllByQuestionId((long) 7);
    	assertEquals(2, answers.size());
    	answers= answerDao.findAllByQuestionId((long) 8);
    	assertEquals(3, answers.size());
    }
}

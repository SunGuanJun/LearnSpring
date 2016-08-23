package orders.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@ComponentScan
@EnableMongoRepositories("orders.db")
public class MongoConfig extends AbstractMongoConfiguration{
	
	@Override
	protected String getDatabaseName(){
		return "OrderDB";
	}
	
	@Override
	@Bean
	public Mongo mongo() throws Exception{
		return new MongoClient("10.240.136.3");
	}
}

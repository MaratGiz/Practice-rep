
//import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.yaml.snakeyaml.Yaml;
//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


public class Connection {
	public static void main(String[] args) throws FileNotFoundException {
		
		org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Connection.class);
	    logger.trace("hello");
	    
//	    BasicConfigurator.configure();
	    
	    PropertyConfigurator.configure("/home/student/Practice/MavenProj/log4j.properties");
	    
		String path = args[0];
		

				
// 		/home/student/Practice/MavenProj/users.yml
		InputStream inputStream = new FileInputStream(new File(path));
		
		Yaml yaml = new Yaml();
		Map<String, Object> data = yaml.load(inputStream); 
		
		System.out.println(data);
		
		
	}
}

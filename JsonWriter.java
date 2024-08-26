package semestre1;

import java.io.File;
import java.io.IOException;
import org.codehausjackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonWriter{
	public static void main(String[] args){
		Country countryObj = new Country();
		countryObj.name = "India";
		countryObj.population = 100000;

		List<String> listOfStates = new ArrayList<String>();
		listOfStates.add("Madhya Predesh");
		listOfStates.add("Maharastra");
		listOfStates.add("Rajasthan");

		countryObj.states = listOfStates;
		ObjectMapper mapper = new ObjectMapper();

		try{
			//Writing to a file
			mapper.writeValue(new File("\\country.json"), countryObj);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

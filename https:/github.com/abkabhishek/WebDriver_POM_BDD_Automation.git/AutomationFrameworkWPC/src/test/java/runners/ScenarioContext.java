package runners;


import java.util.HashMap;
import java.util.Map;
import statics.Context;

public class ScenarioContext {
	 
	private  Map<String, Object> sc;

	    public ScenarioContext(){
	    	sc = new HashMap<>();
	    }

	    public void set(String key, Object value) {
	    	sc.put(key.toString(), value);
	    }

	    public Object get(String key){
	        return sc.get(key.toString());
	    }

	    public Boolean check(String key){
	        return sc.containsKey(key.toString());
	    }

}
package entities;

import java.util.HashMap;
import java.util.Map;

/**
  * @author Kuan Tian
  * 2019-05-04
  */

// store the log as a hashmap, each index to an entry
public class Log {
	private int index = 1;
	private Map<Integer,Entry> log;
	
	public Log() {
		log = new HashMap<Integer,Entry>();
	}
	
	// append a new entry containing term and command
	public void append(Entry entry) {
		index += 1;
		log.put(index,entry);
	}
	
	// get the last index in the log
	public int getLastLogIndex() {
		return index;
	}
	
	// get the term of the last entry in the log
	public int getLastLogTerm() {
		return log.get(index).getEntryTerm();
	}
	
	// get the last command
	public String getLastCommand() {
		return log.get(index).getCommand();
	}
	
	// get term of the entry given the index
	public int getEntryTerm(int i) {
		if(log.get(i)==null) return -1;
		return log.get(i).getEntryTerm();
	}
	
	// get the commadn give the index
	public String getCommand(int i ) {
		if(log.get(i)==null) return "Null";
		return log.get(i).getCommand();
	}
}

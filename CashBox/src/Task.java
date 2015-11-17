import java.util.List;
/*
 * Класс хранит в себе описание задач/действий покупателя и время выполнения.
 */
public class Task {
	
	private List<String> description;
    private long duration;
    
    public Task(List<String> description, long duration) {
        this.description = description;
        this.duration = duration;
    }
    
    public void setDescription(List<String> deskription){
    	this.description = deskription;
    }
    
    public List<String> getDescription(){
    	return this.description;
    }
    
    public void setDuration(long duration) {
        this.duration = duration;
    }
 
    public long getDuration() {
        return this.duration;
    }

}

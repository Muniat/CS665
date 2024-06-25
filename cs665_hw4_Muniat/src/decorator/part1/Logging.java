package decorator.part1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//logging decorator
public class Logging extends TransactionDecorator{

	public Logging(Transaction decoratedTransaction) {
		super(decoratedTransaction);
	}
	
	public String getDescription() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        // Setting the time zone to EDT (Eastern Daylight Time)
        dateFormat.setTimeZone(TimeZone.getTimeZone("EDT"));
        // current date and time
        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        
		return "Logging @" + formattedDate + " -> " + super.getDescription();
	}
}

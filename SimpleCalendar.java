
import java.util.GregorianCalendar;

import javax.swing.JFrame;
/**
 * Main Method to run SimpleCalendar
 */
public class SimpleCalendar {
	public static void main(String[] args) throws Exception {
		JFrame.setDefaultLookAndFeelDecorated(true);
		EventModel model = new EventModel(new GregorianCalendar());
		CalendarFrame sc = new CalendarFrame(model);
	}
}

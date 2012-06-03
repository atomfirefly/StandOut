package wei.mark.example;

import wei.mark.standout.StandOutWindow;
import android.app.Activity;
import android.os.Bundle;

public class StandOutExampleActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		StandOutWindow.closeAll(this, StandOutMultiWindow.class);

		// show a MultiWindow, SimpleWindow, and MostBasicWindow
		
		StandOutWindow.show(this, StandOutSimpleWindow.class,
				StandOutWindow.DEFAULT_ID);
		StandOutWindow.show(this, StandOutMultiWindow.class,
				StandOutWindow.DEFAULT_ID);
		StandOutWindow.show(this, StandOutMostBasicWindow.class,
				StandOutWindow.DEFAULT_ID);

		finish();
	}
}
package the.ThemeLearning;

import the.centro.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
/*
 * 
 * 
 */
public class HomeActivity extends Activity {

	/**
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	/**
	 * test method
	 * @param userId user identificator
	 * @param userName user full name
	 * @return user is valid
	 */
	public boolean testMethod(int userId, String userName)
	{
		return true;
	}

}

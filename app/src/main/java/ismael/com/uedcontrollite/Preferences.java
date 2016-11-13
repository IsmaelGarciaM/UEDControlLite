package ismael.com.uedcontrollite;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by ismael on 13/11/16.
 */

public class Preferences extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

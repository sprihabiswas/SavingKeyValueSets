package skillbooting.savingkeyvaluesets;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    String KEY="skillbooting.sprihabiswas.KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.et_type);
        tv=(TextView)findViewById(R.id.et_result);
    }

    /**
     * You can create a new shared preference file or access an existing one by calling one of two methods:
     * getSharedPreferences() — Use this if you need multiple shared preference files identified by name,
     * which you specify with the first parameter. You can call this from any Context in your app.
     * getPreferences() — Use this from an Activity if you need to use only one shared preference file for the activity.
     * Because this retrieves a default shared preference file that belongs to the activity, you don't need to supply a name.
     */

    //When naming your shared preference files, you should use a name that's uniquely identifiable to your app,
    // such as "com.example.myapp.PREFERENCE_FILE_KEY"

    //If you create a shared preferences file with MODE_WORLD_READABLE or MODE_WORLD_WRITEABLE,
    // then any other apps that know the file identifier can access your data.

    public void writeToSP(String x)
    {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY, x);
        editor.commit();

    }
    public String readFromSP()
    {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        String n=sharedPref.getString(KEY,"");
        return n;

    }
    public void button_clicked(View v)
    {
        writeToSP(et.getText().toString());
        tv.setText(readFromSP());
    }

}

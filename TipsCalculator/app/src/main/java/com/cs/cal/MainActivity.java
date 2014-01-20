package com.cs.cal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    EditText total, rate, number;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        total = (EditText) findViewById(R.id.total);
        rate = (EditText) findViewById(R.id.rate);
        number = (EditText) findViewById(R.id.num);
        result = (TextView) findViewById(R.id.result);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }


    public void cal(View view){
        Log.d("here", "here");
        //if (checkEmpty(total) && checkEmpty(rate) && checkEmpty(number)){
            String t = total.getText().toString();
            //double r = Double.parseDouble(rate.getText().toString());
            //double n = Double.parseDouble(number.getText().toString());
            Log.d("check", t );//+ "," + r + "," + n);
            //double res = (t * (1 + r / 100)) / n;
            //DecimalFormat two = new DecimalFormat("#.##");
            //result.setText(Double.valueOf(two.format(res)) + "");
        //}
    }

    private boolean checkEmpty(EditText editText) {
        if (editText.getText().toString().equals(null)) {
            editText.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            return false;
        }
        return true;
    }

}

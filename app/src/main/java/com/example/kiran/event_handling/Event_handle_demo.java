package com.example.kiran.event_handling;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Kiran on 14-11-2015.
 */

public class Event_handle_demo extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        /*Mostly use full for reusable*/
        findViewById(R.id.Member_class_button).setOnClickListener(new handle_click());
        /*
        * here onLongClickListener object object had gien for as
        * argument for the setOnLongClickListener*/
        findViewById(R.id.Member_class_button).setOnLongClickListener(onLongClickHandler);
        findViewById(R.id.Member_class_button).setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                v.setBackgroundColor(Color.GREEN);
                return false;
            }
        });
    }
    /*
     * displaythe layout code
     * */
   public class handle_click implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"handle onclick through member class",Toast.LENGTH_LONG).show();
        }
    }
    /*creating the object for the onclick interface class
    * here the object is */
    protected View.OnLongClickListener onLongClickHandler=new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            String view_name=v.toString();
            Toast.makeText(getApplicationContext(),view_name,Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(),"onLongclick for the button",Toast.LENGTH_LONG).show();
            return false;
        }
    };
}

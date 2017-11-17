package com.example.daisuke.name_app;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MYNAME = "com.example.daisuke.name_app.MYNANE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getScore(View view){
        //EditTextを取得
        EditText myEditText = (EditText)findViewById(R.id.myEditText);
        //EditTextの中身を取得
        String myName = myEditText.getText().toString().trim();

        //中身を見て条件分岐
        if(myName.equals("")){
            //エラー処理
            /*
            * 1.setError
            * 2.Toast
            * 3.Dialog
            * */
            myEditText.setError("Please enter your name!");
            /*
            Toast.makeText(
                    this,
                    "Please enter your name!",
                    Toast.LENGTH_LONG
            ).show();
            */
            /*
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder
                    .setTitle("Error!")
                    .setMessage("Please enter your name!")
                    .setPositiveButton("OK",null);

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            */

        }else{
            //次の画面へ
            Intent  intent = new Intent(this,MyResult.class);
            intent.putExtra(EXTRA_MYNAME,myName);
            startActivity(intent);

        }
    }
}

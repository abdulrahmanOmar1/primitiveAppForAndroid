package com.example.myapplicationl7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnSearch;
    private TextView txtReaslt;
    private Spinner spnBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSearch=findViewById(R.id.btnSearch);
        txtReaslt=findViewById(R.id.txtReaslt);
        spnBooks=findViewById(R.id.spnBooks);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cat=spnBooks.getSelectedItem().toString();
                txtReaslt.setText(cat);
                DataBase db=new DataBase();
                List<Book> res=db.getbooks(cat);
                String str="";
                for(Book b:res){
                    str += b.getTitle() + "\n";
                }
                txtReaslt.setText(str);
            }
        });

    }

}
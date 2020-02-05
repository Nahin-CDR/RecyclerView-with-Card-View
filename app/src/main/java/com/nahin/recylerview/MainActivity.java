package com.nahin.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.Normalizer2;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        getSupportActionBar().hide();

        mRecyclerView = (RecyclerView)findViewById( R.id.recyclerViewID );
        mRecyclerView.setLayoutManager(new LinearLayoutManager( this ) );

        myAdapter=new MyAdapter( this,getMylist() );
        mRecyclerView.setAdapter( myAdapter );




    }

    private ArrayList<Model>getMylist(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle( "Recent Corona Virus Attack" );
        m.setDescription( "Contrary to popular belief, Lorem Ipsum is not simply random text." +
                "It has roots in a piece of classical Latin literature from 45 BC" +
                "It has roots in a piece of classical Latin literature from 45 BC");
        models.add( m );


        Model m1 = new Model();
        m1.setTitle( "Recent Corona Virus Attack on Bangladesh" );
        m1.setDescription( "Contrary to popular belief, Lorem Ipsum is not simply random text."+
                "Recent Corona Virus Attack" +
                "looked up one of the more obscure Latin words, consectetur," );
        models.add( m1 );


        Model m2 = new Model();
        m2.setTitle( "News feed 3" );
        m2.setDescription( "Contrary to popular belief, Lorem Ipsum is not simply random text" +
                "        It has roots in a piece of classical Latin literature from 45 BC," +
                "        making it over 2000 years old. Richard McClintock,");
        models.add( m2 );


        Model m3 = new Model();
        m3.setTitle( "News feed 4" );
        m3.setDescription( "TContrary to popular belief, Lorem Ipsum is not simply random text." +
                "        It has roots in a piece of classical Latin literature from 45 BC," +
                "        making it over 2000 years old. Richard McClintock," );
        models.add( m3 );

        return models;
    }
}

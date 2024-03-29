package com.goodapps.guilleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Phrase> phraseList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readFromDatabase();

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        writeOnDatabase();


    }

    public void readFromDatabase(){
        DatabaseReference mDatabase;

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Phrases").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                            Phrase phrase = postSnapshot.getValue(Phrase.class);
                            phraseList.add(phrase);
                            //Date es phrase en remote y phrase es date en remote... TODO
                        }
                        PhraseRecyclerAdapter adapter = new PhraseRecyclerAdapter(phraseList);
                        recyclerView.setAdapter(adapter);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        //Toast.makeText(getApplicationContext(),"Failed to read from database",Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public void writeOnDatabase(){
        //RUN ONLY ONCE
        DatabaseReference mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.getRoot().child("Phrases").child("1").setValue(new Phrase("8/3 0:27", "cocaina encima de la cisterna", -1));
        mDatabase.getRoot().child("Phrases").child("2").setValue(new Phrase("8/3 0:27", "me he fumado un trocolo", -1));
        mDatabase.getRoot().child("Phrases").child("3").setValue(new Phrase("8/3 0:27", "unos navajazos y pa casa", -1));
        mDatabase.getRoot().child("Phrases").child("4").setValue(new Phrase("8/3 0:27", "..... y el diablo ya", -1));
        mDatabase.getRoot().child("Phrases").child("5").setValue(new Phrase("8/3 0:28", "real hasta la muerte", -1));
        mDatabase.getRoot().child("Phrases").child("6").setValue(new Phrase("8/3 0:29", " ver si esta el payo ese", -1));
        mDatabase.getRoot().child("Phrases").child("7").setValue(new Phrase("8/3 0:29", "nos la fuckamos", -1));
        mDatabase.getRoot().child("Phrases").child("8").setValue(new Phrase("8/3 0:32", "payo feo", -1));
        mDatabase.getRoot().child("Phrases").child("9").setValue(new Phrase("8/3 0:32", "Nos damos de bucos", -1));
        mDatabase.getRoot().child("Phrases").child("10").setValue(new Phrase("8/3 0:42", "sma di los planes bakan", -1));
        mDatabase.getRoot().child("Phrases").child("11").setValue(new Phrase("8/3 0:45", "revia en la resi, siestecita con las payas y marruneo por discoteca", -1));
        mDatabase.getRoot().child("Phrases").child("12").setValue(new Phrase("9/3 15:59", "Quien venga le prometo cocaina", -1));
        mDatabase.getRoot().child("Phrases").child("13").setValue(new Phrase("9/3 23:21", "Calmamos un poquito los animos con un buen tema directo a sus celulares", -1));
        mDatabase.getRoot().child("Phrases").child("14").setValue(new Phrase("9/3 23:28", "Y tengo un machetaso en la espalda", -1));
        mDatabase.getRoot().child("Phrases").child("15").setValue(new Phrase("9/3 23:29", "Y las raxetas muevan los mejillones @Isma2g", -1));
        mDatabase.getRoot().child("Phrases").child("16").setValue(new Phrase("10/3 11:57", "Coca chavales", -1));
        mDatabase.getRoot().child("Phrases").child("17").setValue(new Phrase("10/3 15:46", "Si os quedais boomboneo raul y yo somos reales", -1));
        mDatabase.getRoot().child("Phrases").child("18").setValue(new Phrase("10/3 16:17", "Despacito", -1));
        mDatabase.getRoot().child("Phrases").child("19").setValue(new Phrase("10/3 16:17", "Sola", -1));
        mDatabase.getRoot().child("Phrases").child("20").setValue(new Phrase("10/3 16:17", "La mafia del amor", -1));
        mDatabase.getRoot().child("Phrases").child("21").setValue(new Phrase("10/3 17:52", "A meternos ice", -1));
        mDatabase.getRoot().child("Phrases").child("22").setValue(new Phrase("10/3 19:48", "Para meternos droga", -1));
        mDatabase.getRoot().child("Phrases").child("23").setValue(new Phrase("10/3 19:53", "Y nos metemos la droga", -1));
        mDatabase.getRoot().child("Phrases").child("24").setValue(new Phrase("10/3 19:53", "Y nos damos con los puertas", -1));
        mDatabase.getRoot().child("Phrases").child("25").setValue(new Phrase("13/3 21:50", "Ahora que", -1));
        mDatabase.getRoot().child("Phrases").child("26").setValue(new Phrase("13/3 23:19", "Deep house y porrazo", -1));
        mDatabase.getRoot().child("Phrases").child("27").setValue(new Phrase("15/3 22:15", "barra en el maletero", -1));
        mDatabase.getRoot().child("Phrases").child("28").setValue(new Phrase("16/3 17:54", "Buscas movida o k", -1));
        mDatabase.getRoot().child("Phrases").child("29").setValue(new Phrase("16/3 18:17", "Si hubiera sonado i love pussy de los santos la hubieramos cantado", -1));
        mDatabase.getRoot().child("Phrases").child("30").setValue(new Phrase("16/3 22:49", "Soy un antisistema", -1));
        mDatabase.getRoot().child("Phrases").child("31").setValue(new Phrase("16/3 22:54", "El puto capitalismo hermano vota pablemos", -1));
        mDatabase.getRoot().child("Phrases").child("32").setValue(new Phrase("17/3 14:24", "Va dale mambo", -1));
        mDatabase.getRoot().child("Phrases").child("33").setValue(new Phrase("17/3 14:24", "Nos vamos a drogar", -1));
        mDatabase.getRoot().child("Phrases").child("34").setValue(new Phrase("18/3 0:03", "ahora todos esos raperos dicen que no son raperos soy cantante maleante reggaetonero", -1));
        mDatabase.getRoot().child("Phrases").child("35").setValue(new Phrase("18/3 11:47", "Y cuando aterricemos presos a guantanamo", -1));
        mDatabase.getRoot().child("Phrases").child("36").setValue(new Phrase("18/3 11:47", "Un submarino con los vapes como locos", -1));
        mDatabase.getRoot().child("Phrases").child("37").setValue(new Phrase("22/3 20:14", "Bifrutas con cocaina", -1));
        mDatabase.getRoot().child("Phrases").child("38").setValue(new Phrase("23/3 15:33", "Que ahora estara clave", -1));
        mDatabase.getRoot().child("Phrases").child("39").setValue(new Phrase("23/3 15:33", "Para unos trompos", -1));
        mDatabase.getRoot().child("Phrases").child("40").setValue(new Phrase("23/3 15:34", "Y para kelo con las venas bien abiertas", -1));
        mDatabase.getRoot().child("Phrases").child("41").setValue(new Phrase("26/3 15:05", "Por mamaguevo", -1));
        mDatabase.getRoot().child("Phrases").child("42").setValue(new Phrase("28/3 0:06", "Yo estoy tirado en la cama leyendo a nietzsche y con cafe quijano", -1));
        mDatabase.getRoot().child("Phrases").child("43").setValue(new Phrase("28/3 0:09", "Lo que te digo, que se acojona", -1));
        mDatabase.getRoot().child("Phrases").child("44").setValue(new Phrase("28/3 0:10", "De ir a la cantera a trompear", -1));
        mDatabase.getRoot().child("Phrases").child("45").setValue(new Phrase("28/3 0:22", "Hay que ahorrar para las AK47 de LA", -1));
        mDatabase.getRoot().child("Phrases").child("46").setValue(new Phrase("28/3 23:37", "Vamos neno tictac", -1));
        mDatabase.getRoot().child("Phrases").child("47").setValue(new Phrase("31/3 0:42", "Fokin china", -1));
        mDatabase.getRoot().child("Phrases").child("48").setValue(new Phrase("31/3 20:00", "tramadita padreee woooo", -1));
        mDatabase.getRoot().child("Phrases").child("49").setValue(new Phrase("31/3 20:16", "Y yo llevo barba de moro", -1));
        mDatabase.getRoot().child("Phrases").child("50").setValue(new Phrase("31/3 20:27", "Porque segun vengas te vas a volver en la ambulancia", -1));
        mDatabase.getRoot().child("Phrases").child("51").setValue(new Phrase("31/3 20:30", "Digo porque te iba a matar", -1));

    }
}
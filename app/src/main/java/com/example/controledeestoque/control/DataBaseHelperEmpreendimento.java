package com.example.controledeestoque.control;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.controledeestoque.model.Empreendimento;

public class DataBaseHelperEmpreendimento {
    DataBaseHelper dbHelper;

    public DataBaseHelperEmpreendimento(Context context) {
        dbHelper = new DataBaseHelper(context);
    }

    public long cadastrar(Empreendimento empreendimento){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        long newId = db.insert("empreendimento", null, empreendimento.getContentValues());
        return newId;
    }


}

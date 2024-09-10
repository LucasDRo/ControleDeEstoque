package com.example.controledeestoque.control;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.controledeestoque.model.Empreendimento;

import java.util.Date;

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

    public Empreendimento consultar (String nome){
        Empreendimento empreendimento = null;
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM empreendimento WHERE nomeFantasia = ?", new String[]{nome});

        if(cursor.moveToNext()){
            String nomeFantasia = cursor.getString(cursor.getColumnIndexOrThrow("nomeFantasia"));
            String razaoSocial = cursor.getString(cursor.getColumnIndexOrThrow("razaoSocial"));
            double cnpj = cursor.getDouble(cursor.getColumnIndexOrThrow("cnpj"));
            double inscEstadual = cursor.getDouble(cursor.getColumnIndexOrThrow("inscEstadual"));
            String bairro = cursor.getString(cursor.getColumnIndexOrThrow("bairro"));
            String rua = cursor.getString(cursor.getColumnIndexOrThrow("rua"));
            int num = cursor.getInt(cursor.getColumnIndexOrThrow("num"));
            String estado = cursor.getString(cursor.getColumnIndexOrThrow("estado"))
            String cidade = cursor.getString(cursor.getColumnIndexOrThrow("cidade"));


            empreendimento = new Empreendimento(nomeFantasia, razaoSocial, cnpj, inscEstadual, bairro, rua, num, estado, cidade);
        }
        cursor.close();

        return empreendimento;
    }

}

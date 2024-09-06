package com.example.controledeestoque.control;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "locadora.db";
    private static final int DATABASE_VERSION = 1;

    public DataBaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //TABELA EMPREENDIMENTO
        db.execSQL("CREATE TABLE empreendimento(" +
                "id INTEGER PRIMARY KEY," +
                "nomeFantasia TEXT," +
                "razaoSocial TEXT," +
                "cnpj DOUBLE," +
                "inscEstadual DOUBLE," +
                "bairro TEXT," +
                "rua TEXT," +
                "num INTEGER," +
                "estado TEXT," +
                "cidade TEXT)");

        //TABELA ITEM
        db.execSQL("CREATE TABLE item(" +
                "id INTEGER PRIMARY KEY," +
                "idEmp INTEGER," +
                "nome TEXT," +
                "qtde int," +
                "codigo TEXT," +
                "categoria TEXT," +
                "FOREIGN KEY (idEmp) REFERENCES empreendimento(id))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

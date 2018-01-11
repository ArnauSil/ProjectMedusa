package com.example.arnausilberman.projectmedusa.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by stevejobs on 18/12/2017.
 */

public class DBOpenHelper extends SQLiteOpenHelper {

     private static final String LOGTAG="MEDUSA",
                                 DATABASE_NAME="medusa.db";

     private static final int DATABASE_VER=1;

     //la tabla user y todos sus columnas
     public static final String TABLE_USER="usuario",
                                COLUMN_ID="user_id",
                                COLUMN_NAME="name",
                                COLUMN_EMAIL="email",
                                COLUMN_PASSWORD="password";

     private static final String CREATE_TABLE =
             "CREATE TABLE " + TABLE_USER + " (" +
             COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
             COLUMN_NAME +  " TEXT, " +
             COLUMN_EMAIL + " TEXT, " +
             COLUMN_PASSWORD + " TEXT " +
             ")";


    public DBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Log.i(LOGTAG,"Se ha actalizado la tabla");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int old_ver, int new_ver) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        onCreate(db);
    }
}

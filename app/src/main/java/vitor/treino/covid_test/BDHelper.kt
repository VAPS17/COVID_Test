package vitor.treino.covid_test

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BDHelper(context: Context?) : SQLiteOpenHelper(context, DB_Name, null, DB_Version){

    override fun onCreate(db: SQLiteDatabase?){
        if (db != null) {
            HospitalTable(db).create()
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    companion object{
        const val DB_Name = "covid.db"
        const val DB_Version = 1
    }
}
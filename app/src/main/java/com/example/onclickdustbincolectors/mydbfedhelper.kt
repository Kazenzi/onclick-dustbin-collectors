package com.example.onclickdustbincolectors

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class mydbfedhelper(context: Context) :SQLiteOpenHelper(context,"FEDDB",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE FEEDBACK(USERID INTEGER PRIMARY KEY AUTOINCREMENT, USER TEXT,PHONE TEXT,FEEDBACK TEXT)")
        db?.execSQL("INSERT INTO FEDDB(USER,PHONE,FEEDBACK)VALUES('KKKKK','0712435678','YOUR SERVICES ARE GREAT')")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }
}
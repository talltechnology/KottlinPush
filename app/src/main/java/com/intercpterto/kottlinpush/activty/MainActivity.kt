package com.intercpterto.kottlinpush.activty

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.intercpterto.kottlinpush.R
import cn.jpush.android.api.JPushInterface
import android.content.Intent.ACTION_DELETE
import android.R.attr.action
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.util.Log
import org.json.JSONObject


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}

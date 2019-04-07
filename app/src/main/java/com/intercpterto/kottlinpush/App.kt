package com.intercpterto.kottlinpush

import android.app.Application
import cn.jpush.android.api.JPushInterface
import android.content.Intent.ACTION_DELETE
import android.R.attr.action



/**
 * Created by WXY on 2019/4/7.
 */
class App: Application() {
    override fun onCreate() {
        super.onCreate()
             JPushInterface.setDebugMode(true)
             JPushInterface.init(this)
    }
}
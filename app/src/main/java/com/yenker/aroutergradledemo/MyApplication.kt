package com.yenker.aroutergradledemo

import android.app.Application


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ARouter.init(this)
        if (BuildConfig.DEBUG) {
            //ARouter.getInstance().
        }
    }
}
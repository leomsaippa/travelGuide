package com.lsaippa.travelguide

import android.app.Application
import com.lsaippa.travelguide.di.component.AppInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class TravelGuideApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector() = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }
}
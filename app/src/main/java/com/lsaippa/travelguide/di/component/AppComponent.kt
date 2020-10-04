package com.lsaippa.travelguide.di.component

import android.app.Application
import com.lsaippa.travelguide.TravelGuideApplication
import com.lsaippa.travelguide.di.builder.ActivityBuilder
import com.lsaippa.travelguide.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class),(AppModule::class),(ActivityBuilder::class)])
interface AppComponent {

    fun inject(application: TravelGuideApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun appModule(application: Application): Builder

        fun build(): AppComponent
    }
}
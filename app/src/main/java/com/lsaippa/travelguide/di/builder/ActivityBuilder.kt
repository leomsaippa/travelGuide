package com.lsaippa.travelguide.di.builder

import com.lsaippa.travelguide.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(FragmentProviderModule::class)])
    abstract fun bindMainActivity(): MainActivity

}
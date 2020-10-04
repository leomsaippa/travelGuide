package com.lsaippa.travelguide.di.builder

import com.lsaippa.travelguide.ui.login.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentProviderModule {

    @ContributesAndroidInjector
    abstract fun contributeLogin() : LoginFragment
}
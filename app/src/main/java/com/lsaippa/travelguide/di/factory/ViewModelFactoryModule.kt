package com.lsaippa.travelguide.di.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lsaippa.travelguide.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Suppress("unused")
@Module
abstract class ViewModelFactoryModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Singleton
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @Singleton
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}
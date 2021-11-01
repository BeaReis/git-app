package bootcamp.inter.apprepository.presenter.di

import bootcamp.inter.apprepository.presenter.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresenterModule {

    fun load() {
        loadKoinModules(viewModelModule())
    }

    private fun  viewModelModule(): Module {
        return module {
            viewModel() { MainViewModel(get()) }
        }
    }
}
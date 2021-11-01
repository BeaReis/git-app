package bootcamp.inter.apprepository

import android.app.Application
import bootcamp.inter.apprepository.data.di.DataModule
import bootcamp.inter.apprepository.domain.di.DomainModule
import bootcamp.inter.apprepository.presenter.di.PresenterModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresenterModule.load()
    }
}
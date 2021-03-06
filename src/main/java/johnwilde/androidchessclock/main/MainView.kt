package johnwilde.androidchessclock.main

import com.hannesdorfmann.mosby3.mvp.MvpView
import io.reactivex.Observable

interface MainView : MvpView {
    fun drawerOpened() : Observable<Any>
    fun playPauseIntent() : Observable<Any>
    fun snackBarDismissed() : Observable<Any>
    fun goForward() : Observable<Any>
    fun goBack() : Observable<Any>

    fun render(viewState: MainViewState)
}
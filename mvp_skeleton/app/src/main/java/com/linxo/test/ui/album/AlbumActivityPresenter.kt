package com.linxo.test.ui.album

import android.util.Log
import com.linxo.test.api.Webservice
import com.linxo.test.ui.base.BaseActivityPresenter
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * AlbumActivity's Presenter
 */
class AlbumActivityPresenter :
    BaseActivityPresenter<IAlbumActivityMvpView>(),
    IAlbumActivityMvpPresenter<IAlbumActivityMvpView> {

    private var selectedFolderId = 0

    override fun init(activity: IAlbumActivityMvpView) {
        super.init(activity)
        selectedFolderId = this.getActivity().intent.getIntExtra(
            AlbumActivity.GALLERY_SELECTED_ITEM_ID, 0)
    }

    override fun onResume() {
        super.onResume()
        loadData()
    }

    /**
     * Load data from Fake API
     */
    private fun loadData() {
        mvpView.showLoading()
        disposableManager.add(Observable.fromCallable {
            Webservice.instance!!.sync()
        }
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mvpView.hideLoading()
                mvpView.refreshFolder()
            }) { throwable ->
                mvpView.hideLoading()
                Log.e("FOLDER_LOAD_DATA", throwable.message!!)
            })
    }
}
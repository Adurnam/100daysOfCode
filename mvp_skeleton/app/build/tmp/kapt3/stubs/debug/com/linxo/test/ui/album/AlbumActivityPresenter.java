package com.linxo.test.ui.album;

import java.lang.System;

/**
 * AlbumActivity's Presenter
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/linxo/test/ui/album/AlbumActivityPresenter;", "Lcom/linxo/test/ui/base/BaseActivityPresenter;", "Lcom/linxo/test/ui/album/IAlbumActivityMvpView;", "Lcom/linxo/test/ui/album/IAlbumActivityMvpPresenter;", "()V", "selectedFolderId", "", "init", "", "activity", "loadData", "onResume", "app_debug"})
public final class AlbumActivityPresenter extends com.linxo.test.ui.base.BaseActivityPresenter<com.linxo.test.ui.album.IAlbumActivityMvpView> implements com.linxo.test.ui.album.IAlbumActivityMvpPresenter<com.linxo.test.ui.album.IAlbumActivityMvpView> {
    private int selectedFolderId = 0;
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.NotNull()
    com.linxo.test.ui.album.IAlbumActivityMvpView activity) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     * Load data from Fake API
     */
    private final void loadData() {
    }
    
    public AlbumActivityPresenter() {
        super();
    }
}
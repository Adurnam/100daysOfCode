package com.linxo.test.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/linxo/test/ui/base/BaseActivityPresenter;", "V", "Lcom/linxo/test/ui/base/IBaseActivityMvpView;", "Lcom/linxo/test/ui/base/IBaseActivityMvpPresenter;", "()V", "disposableManager", "Lcom/linxo/test/utils/DisposableManager;", "getDisposableManager", "()Lcom/linxo/test/utils/DisposableManager;", "setDisposableManager", "(Lcom/linxo/test/utils/DisposableManager;)V", "mvpView", "getMvpView", "()Lcom/linxo/test/ui/base/IBaseActivityMvpView;", "setMvpView", "(Lcom/linxo/test/ui/base/IBaseActivityMvpView;)V", "Lcom/linxo/test/ui/base/IBaseActivityMvpView;", "getActivity", "Landroid/app/Activity;", "init", "", "activity", "onPause", "onResume", "onStart", "onStop", "app_debug"})
public abstract class BaseActivityPresenter<V extends com.linxo.test.ui.base.IBaseActivityMvpView> implements com.linxo.test.ui.base.IBaseActivityMvpPresenter<V> {
    @org.jetbrains.annotations.NotNull()
    private com.linxo.test.utils.DisposableManager disposableManager;
    @org.jetbrains.annotations.NotNull()
    public V mvpView;
    
    @org.jetbrains.annotations.NotNull()
    public final com.linxo.test.utils.DisposableManager getDisposableManager() {
        return null;
    }
    
    public final void setDisposableManager(@org.jetbrains.annotations.NotNull()
    com.linxo.test.utils.DisposableManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final V getMvpView() {
        return null;
    }
    
    public final void setMvpView(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.NotNull()
    V activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Activity getActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    public BaseActivityPresenter() {
        super();
    }
}
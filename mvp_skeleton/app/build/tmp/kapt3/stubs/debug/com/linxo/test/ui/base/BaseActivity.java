package com.linxo.test.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0014J\b\u0010 \u001a\u00020\u001aH\u0014J\b\u0010!\u001a\u00020\u001aH\u0014J\b\u0010\"\u001a\u00020\u001aH\u0014J\r\u0010\u000e\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\rJ\b\u0010#\u001a\u00020\u001aH\u0014J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0016R\u0014\u0010\u0007\u001a\u00020\b8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/linxo/test/ui/base/BaseActivity;", "V", "Lcom/linxo/test/ui/base/IBaseActivityMvpView;", "T", "Lcom/linxo/test/ui/base/IBaseActivityMvpPresenter;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "layoutResourceId", "", "getLayoutResourceId", "()I", "presenter", "getPresenter", "()Lcom/linxo/test/ui/base/IBaseActivityMvpPresenter;", "setPresenter", "(Lcom/linxo/test/ui/base/IBaseActivityMvpPresenter;)V", "Lcom/linxo/test/ui/base/IBaseActivityMvpPresenter;", "progressBarHandler", "Lcom/linxo/test/utils/ProgressBarHandler;", "getProgressBarHandler", "()Lcom/linxo/test/utils/ProgressBarHandler;", "setProgressBarHandler", "(Lcom/linxo/test/utils/ProgressBarHandler;)V", "unbinder", "Lbutterknife/Unbinder;", "hideLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "setUp", "setUpProgressBar", "showLoading", "app_debug"})
public abstract class BaseActivity<V extends com.linxo.test.ui.base.IBaseActivityMvpView, T extends com.linxo.test.ui.base.IBaseActivityMvpPresenter<V>> extends androidx.appcompat.app.AppCompatActivity implements com.linxo.test.ui.base.IBaseActivityMvpView {
    @org.jetbrains.annotations.NotNull()
    protected T presenter;
    private butterknife.Unbinder unbinder;
    @org.jetbrains.annotations.Nullable()
    private com.linxo.test.utils.ProgressBarHandler progressBarHandler;
    private java.util.HashMap _$_findViewCache;
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutResourceId();
    
    @org.jetbrains.annotations.NotNull()
    protected final T getPresenter() {
        return null;
    }
    
    protected final void setPresenter(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.linxo.test.utils.ProgressBarHandler getProgressBarHandler() {
        return null;
    }
    
    protected final void setProgressBarHandler(@org.jetbrains.annotations.Nullable()
    com.linxo.test.utils.ProgressBarHandler p0) {
    }
    
    /**
     * Init Resources and Presenter
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract T setPresenter();
    
    /**
     * SetUp
     */
    protected void setUp() {
    }
    
    private final void setUpProgressBar() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    /**
     * Display loader to screen
     */
    @java.lang.Override()
    public void showLoading() {
    }
    
    /**
     * Hide loader to screen
     */
    @java.lang.Override()
    public void hideLoading() {
    }
    
    public BaseActivity() {
        super();
    }
}
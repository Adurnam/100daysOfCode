package com.linxo.test.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&\u00a8\u0006\u000e"}, d2 = {"Lcom/linxo/test/ui/base/IBaseActivityMvpPresenter;", "V", "Lcom/linxo/test/ui/base/IBaseActivityMvpView;", "", "getActivity", "Landroid/app/Activity;", "init", "", "activity", "(Lcom/linxo/test/ui/base/IBaseActivityMvpView;)V", "onPause", "onResume", "onStart", "onStop", "app_debug"})
public abstract interface IBaseActivityMvpPresenter<V extends com.linxo.test.ui.base.IBaseActivityMvpView> {
    
    public abstract void init(@org.jetbrains.annotations.NotNull()
    V activity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Activity getActivity();
    
    public abstract void onStart();
    
    public abstract void onResume();
    
    public abstract void onPause();
    
    public abstract void onStop();
}
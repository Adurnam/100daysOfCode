package com.linxo.test.ui.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\u00020\u00022\u00020\u0004:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8UX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/linxo/test/ui/album/AlbumActivity;", "Lcom/linxo/test/ui/base/BaseActivity;", "Lcom/linxo/test/ui/album/IAlbumActivityMvpView;", "Lcom/linxo/test/ui/album/IAlbumActivityMvpPresenter;", "Lcom/linxo/test/ui/album/adapter/AlbumAdapter$Callback;", "()V", "albums", "Ljava/util/ArrayList;", "Lcom/linxo/test/dto/AlbumModel;", "Lkotlin/collections/ArrayList;", "folderDetailAdapter", "Lcom/linxo/test/ui/album/adapter/AlbumAdapter;", "layoutResourceId", "", "getLayoutResourceId", "()I", "rvFolder", "Landroidx/recyclerview/widget/RecyclerView;", "getRvFolder", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvFolder", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetailItemClick", "", "position", "refreshFolder", "setPresenter", "setUp", "setUpRecyclerView", "setUpValues", "Companion", "app_debug"})
public final class AlbumActivity extends com.linxo.test.ui.base.BaseActivity<com.linxo.test.ui.album.IAlbumActivityMvpView, com.linxo.test.ui.album.IAlbumActivityMvpPresenter<com.linxo.test.ui.album.IAlbumActivityMvpView>> implements com.linxo.test.ui.album.IAlbumActivityMvpView, com.linxo.test.ui.album.adapter.AlbumAdapter.Callback {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.linxo.test.R.id.rv_folder)
    public androidx.recyclerview.widget.RecyclerView rvFolder;
    private com.linxo.test.ui.album.adapter.AlbumAdapter folderDetailAdapter;
    private java.util.ArrayList<com.linxo.test.dto.AlbumModel> albums;
    public static final int ALBUM_SPAN_COUNT = 1;
    public static final int GALLERY_SPAN_COUNT = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GALLERY_SELECTED_ITEM_ID = "GALLERY_SELECTED_ITEM_ID";
    public static final com.linxo.test.ui.album.AlbumActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRvFolder() {
        return null;
    }
    
    public final void setRvFolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @androidx.annotation.LayoutRes()
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void setUp() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.linxo.test.ui.album.IAlbumActivityMvpPresenter<com.linxo.test.ui.album.IAlbumActivityMvpView> setPresenter() {
        return null;
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void setUpValues() {
    }
    
    @java.lang.Override()
    public void refreshFolder() {
    }
    
    @java.lang.Override()
    public void onDetailItemClick(int position) {
    }
    
    public AlbumActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/linxo/test/ui/album/AlbumActivity$Companion;", "", "()V", "ALBUM_SPAN_COUNT", "", "GALLERY_SELECTED_ITEM_ID", "", "GALLERY_SPAN_COUNT", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
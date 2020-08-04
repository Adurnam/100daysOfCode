package com.linxo.test.ui.album.adapter;

import java.lang.System;

/**
 * Adapter class of Album Activity
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u0015\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/linxo/test/ui/album/adapter/AlbumAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/linxo/test/ui/album/adapter/AlbumHolder;", "()V", "callback", "Lcom/linxo/test/ui/album/adapter/AlbumAdapter$Callback;", "items", "Ljava/util/ArrayList;", "Lcom/linxo/test/dto/AlbumModel;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCallback", "setData", "", "Callback", "app_debug"})
public final class AlbumAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.linxo.test.ui.album.adapter.AlbumHolder> {
    private com.linxo.test.ui.album.adapter.AlbumAdapter.Callback callback;
    private java.util.ArrayList<com.linxo.test.dto.AlbumModel> items;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.linxo.test.ui.album.adapter.AlbumHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.linxo.test.ui.album.adapter.AlbumHolder holder, int position) {
    }
    
    /**
     * Set data from request
     */
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.linxo.test.dto.AlbumModel> items) {
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.linxo.test.ui.album.adapter.AlbumAdapter.Callback callback) {
    }
    
    public AlbumAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/linxo/test/ui/album/adapter/AlbumAdapter$Callback;", "", "onDetailItemClick", "", "position", "", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onDetailItemClick(int position);
    }
}
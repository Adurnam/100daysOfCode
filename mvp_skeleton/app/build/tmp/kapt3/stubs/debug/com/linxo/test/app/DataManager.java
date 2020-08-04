package com.linxo.test.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/linxo/test/app/DataManager;", "", "()V", "pictures", "Ljava/util/ArrayList;", "Lcom/linxo/test/dto/AlbumModel;", "getPictures", "()Ljava/util/ArrayList;", "setPictures", "(Ljava/util/ArrayList;)V", "convertJsonResponse", "", "Lcom/linxo/test/dto/AlbumData$PictureDataInformation;", "sync", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)[Lcom/linxo/test/dto/AlbumData$PictureDataInformation;", "onSyncResponse", "", "response", "", "Companion", "app_debug"})
public final class DataManager {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.linxo.test.dto.AlbumModel> pictures;
    @org.jetbrains.annotations.Nullable()
    private static com.linxo.test.app.DataManager instance;
    public static final com.linxo.test.app.DataManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.linxo.test.dto.AlbumModel> getPictures() {
        return null;
    }
    
    public final void setPictures(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.linxo.test.dto.AlbumModel> p0) {
    }
    
    /**
     * Creating a model object from the response
     */
    public final void onSyncResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
    }
    
    /**
     * Convert Json object to list, using AlbumData
     */
    private final com.linxo.test.dto.AlbumData.PictureDataInformation[] convertJsonResponse(org.json.JSONObject sync) {
        return null;
    }
    
    public DataManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/linxo/test/app/DataManager$Companion;", "", "()V", "instance", "Lcom/linxo/test/app/DataManager;", "getInstance", "()Lcom/linxo/test/app/DataManager;", "setInstance", "(Lcom/linxo/test/app/DataManager;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.linxo.test.app.DataManager getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.linxo.test.app.DataManager p0) {
        }
        
        private Companion() {
            super();
        }
    }
}
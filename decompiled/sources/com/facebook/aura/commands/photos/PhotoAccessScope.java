package com.facebook.aura.commands.photos;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PhotoAccessScope {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PhotoAccessScope[] $VALUES;
    public static final PhotoAccessScope FULL;
    public static final PhotoAccessScope SELECTED;
    public final String wireValue;

    static {
        PhotoAccessScope photoAccessScope = new PhotoAccessScope("FULL", 0, "full");
        FULL = photoAccessScope;
        PhotoAccessScope photoAccessScope2 = new PhotoAccessScope("SELECTED", 1, "selected");
        SELECTED = photoAccessScope2;
        PhotoAccessScope[] photoAccessScopeArr = {photoAccessScope, photoAccessScope2};
        $VALUES = photoAccessScopeArr;
        $ENTRIES = C3cG.A0w(photoAccessScopeArr);
    }

    public static Ey9<PhotoAccessScope> getEntries() {
        return $ENTRIES;
    }

    public static PhotoAccessScope valueOf(String str) {
        return (PhotoAccessScope) Enum.valueOf(PhotoAccessScope.class, str);
    }

    public static PhotoAccessScope[] values() {
        return (PhotoAccessScope[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public PhotoAccessScope(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

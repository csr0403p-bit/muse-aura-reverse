package com.facebook.aura.sharedcontent;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SharedContentType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SharedContentType[] $VALUES;
    public static final SharedContentType ARTIFACT;
    public static final SharedContentType SPACE;

    static {
        SharedContentType sharedContentType = new SharedContentType("SPACE", 0);
        SPACE = sharedContentType;
        SharedContentType sharedContentType2 = new SharedContentType("ARTIFACT", 1);
        ARTIFACT = sharedContentType2;
        SharedContentType[] sharedContentTypeArr = {sharedContentType, sharedContentType2};
        $VALUES = sharedContentTypeArr;
        $ENTRIES = C3cG.A0w(sharedContentTypeArr);
    }

    public static Ey9<SharedContentType> getEntries() {
        return $ENTRIES;
    }

    public static SharedContentType valueOf(String str) {
        return (SharedContentType) Enum.valueOf(SharedContentType.class, str);
    }

    public static SharedContentType[] values() {
        return (SharedContentType[]) $VALUES.clone();
    }

    public SharedContentType(String str, int i) {
    }
}

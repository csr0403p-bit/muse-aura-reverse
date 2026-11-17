package com.facebook.aura.localbrowser.core;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BrowserArgType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserArgType[] $VALUES;
    public static final BrowserArgType ARRAY;
    public static final BrowserArgType BOOLEAN;
    public static final BrowserArgType INTEGER;
    public static final BrowserArgType NUMBER;
    public static final BrowserArgType OBJECT;
    public static final BrowserArgType STRING;

    static {
        BrowserArgType browserArgType = new BrowserArgType("STRING", 0);
        STRING = browserArgType;
        BrowserArgType browserArgType2 = new BrowserArgType("INTEGER", 1);
        INTEGER = browserArgType2;
        BrowserArgType browserArgType3 = new BrowserArgType("NUMBER", 2);
        NUMBER = browserArgType3;
        BrowserArgType browserArgType4 = new BrowserArgType("BOOLEAN", 3);
        BOOLEAN = browserArgType4;
        BrowserArgType browserArgType5 = new BrowserArgType("OBJECT", 4);
        OBJECT = browserArgType5;
        BrowserArgType browserArgType6 = new BrowserArgType("ARRAY", 5);
        ARRAY = browserArgType6;
        BrowserArgType[] browserArgTypeArr = {browserArgType, browserArgType2, browserArgType3, browserArgType4, browserArgType5, browserArgType6};
        $VALUES = browserArgTypeArr;
        $ENTRIES = C3cG.A0w(browserArgTypeArr);
    }

    public static Ey9<BrowserArgType> getEntries() {
        return $ENTRIES;
    }

    public static BrowserArgType valueOf(String str) {
        return (BrowserArgType) Enum.valueOf(BrowserArgType.class, str);
    }

    public static BrowserArgType[] values() {
        return (BrowserArgType[]) $VALUES.clone();
    }

    public BrowserArgType(String str, int i) {
    }
}

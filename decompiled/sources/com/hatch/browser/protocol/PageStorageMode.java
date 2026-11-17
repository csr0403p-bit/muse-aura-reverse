package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PageStorageMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PageStorageMode[] $VALUES;
    public static final Companion Companion;
    public static final PageStorageMode EPHEMERAL;
    public static final PageStorageMode SHARED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        PageStorageMode pageStorageMode = new PageStorageMode("SHARED", 0);
        SHARED = pageStorageMode;
        PageStorageMode pageStorageMode2 = new PageStorageMode("EPHEMERAL", 1);
        EPHEMERAL = pageStorageMode2;
        PageStorageMode[] pageStorageModeArr = {pageStorageMode, pageStorageMode2};
        $VALUES = pageStorageModeArr;
        $ENTRIES = C3cG.A0w(pageStorageModeArr);
        Companion = new Companion();
    }

    public static Ey9<PageStorageMode> getEntries() {
        return $ENTRIES;
    }

    public static PageStorageMode valueOf(String str) {
        return (PageStorageMode) Enum.valueOf(PageStorageMode.class, str);
    }

    public static PageStorageMode[] values() {
        return (PageStorageMode[]) $VALUES.clone();
    }

    public PageStorageMode(String str, int i) {
    }
}

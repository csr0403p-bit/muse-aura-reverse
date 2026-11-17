package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PageReadKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PageReadKind[] $VALUES;
    public static final Companion Companion;
    public static final PageReadKind HTML;
    public static final PageReadKind TEXT;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        PageReadKind pageReadKind = new PageReadKind("TEXT", 0);
        TEXT = pageReadKind;
        PageReadKind pageReadKind2 = new PageReadKind("HTML", 1);
        HTML = pageReadKind2;
        PageReadKind[] pageReadKindArr = {pageReadKind, pageReadKind2};
        $VALUES = pageReadKindArr;
        $ENTRIES = C3cG.A0w(pageReadKindArr);
        Companion = new Companion();
    }

    public static Ey9<PageReadKind> getEntries() {
        return $ENTRIES;
    }

    public static PageReadKind valueOf(String str) {
        return (PageReadKind) Enum.valueOf(PageReadKind.class, str);
    }

    public static PageReadKind[] values() {
        return (PageReadKind[]) $VALUES.clone();
    }

    public PageReadKind(String str, int i) {
    }
}

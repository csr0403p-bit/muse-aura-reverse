package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PageEdge {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PageEdge[] $VALUES;
    public static final PageEdge BOTTOM;
    public static final Companion Companion;
    public static final PageEdge TOP;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        PageEdge pageEdge = new PageEdge("TOP", 0);
        TOP = pageEdge;
        PageEdge pageEdge2 = new PageEdge("BOTTOM", 1);
        BOTTOM = pageEdge2;
        PageEdge[] pageEdgeArr = {pageEdge, pageEdge2};
        $VALUES = pageEdgeArr;
        $ENTRIES = C3cG.A0w(pageEdgeArr);
        Companion = new Companion();
    }

    public static Ey9<PageEdge> getEntries() {
        return $ENTRIES;
    }

    public static PageEdge valueOf(String str) {
        return (PageEdge) Enum.valueOf(PageEdge.class, str);
    }

    public static PageEdge[] values() {
        return (PageEdge[]) $VALUES.clone();
    }

    public PageEdge(String str, int i) {
    }
}

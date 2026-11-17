package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ViewEdge {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ViewEdge[] $VALUES;
    public static final ViewEdge BOTTOM;
    public static final Companion Companion;
    public static final ViewEdge TOP;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ViewEdge viewEdge = new ViewEdge("TOP", 0);
        TOP = viewEdge;
        ViewEdge viewEdge2 = new ViewEdge("BOTTOM", 1);
        BOTTOM = viewEdge2;
        ViewEdge[] viewEdgeArr = {viewEdge, viewEdge2};
        $VALUES = viewEdgeArr;
        $ENTRIES = C3cG.A0w(viewEdgeArr);
        Companion = new Companion();
    }

    public static Ey9<ViewEdge> getEntries() {
        return $ENTRIES;
    }

    public static ViewEdge valueOf(String str) {
        return (ViewEdge) Enum.valueOf(ViewEdge.class, str);
    }

    public static ViewEdge[] values() {
        return (ViewEdge[]) $VALUES.clone();
    }

    public ViewEdge(String str, int i) {
    }
}

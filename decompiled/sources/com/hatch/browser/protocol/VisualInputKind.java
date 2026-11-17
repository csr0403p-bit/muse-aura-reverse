package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class VisualInputKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VisualInputKind[] $VALUES;
    public static final VisualInputKind CLEANUP_RELEASE;
    public static final VisualInputKind CLICK;
    public static final Companion Companion;
    public static final VisualInputKind DRAG;
    public static final VisualInputKind MOUSE_DOWN;
    public static final VisualInputKind MOUSE_MOVE;
    public static final VisualInputKind MOUSE_UP;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        VisualInputKind visualInputKind = new VisualInputKind("CLICK", 0);
        CLICK = visualInputKind;
        VisualInputKind visualInputKind2 = new VisualInputKind("MOUSE_DOWN", 1);
        MOUSE_DOWN = visualInputKind2;
        VisualInputKind visualInputKind3 = new VisualInputKind("MOUSE_MOVE", 2);
        MOUSE_MOVE = visualInputKind3;
        VisualInputKind visualInputKind4 = new VisualInputKind("MOUSE_UP", 3);
        MOUSE_UP = visualInputKind4;
        VisualInputKind visualInputKind5 = new VisualInputKind("DRAG", 4);
        DRAG = visualInputKind5;
        VisualInputKind visualInputKind6 = new VisualInputKind("CLEANUP_RELEASE", 5);
        CLEANUP_RELEASE = visualInputKind6;
        VisualInputKind[] visualInputKindArr = {visualInputKind, visualInputKind2, visualInputKind3, visualInputKind4, visualInputKind5, visualInputKind6};
        $VALUES = visualInputKindArr;
        $ENTRIES = C3cG.A0w(visualInputKindArr);
        Companion = new Companion();
    }

    public static Ey9<VisualInputKind> getEntries() {
        return $ENTRIES;
    }

    public static VisualInputKind valueOf(String str) {
        return (VisualInputKind) Enum.valueOf(VisualInputKind.class, str);
    }

    public static VisualInputKind[] values() {
        return (VisualInputKind[]) $VALUES.clone();
    }

    public VisualInputKind(String str, int i) {
    }
}

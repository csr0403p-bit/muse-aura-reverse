package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ScrollDirection {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ScrollDirection[] $VALUES;
    public static final Companion Companion;
    public static final ScrollDirection DOWN;
    public static final ScrollDirection LEFT;
    public static final ScrollDirection RIGHT;
    public static final ScrollDirection UP;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ScrollDirection scrollDirection = new ScrollDirection("UP", 0);
        UP = scrollDirection;
        ScrollDirection scrollDirection2 = new ScrollDirection("DOWN", 1);
        DOWN = scrollDirection2;
        ScrollDirection scrollDirection3 = new ScrollDirection("LEFT", 2);
        LEFT = scrollDirection3;
        ScrollDirection scrollDirection4 = new ScrollDirection("RIGHT", 3);
        RIGHT = scrollDirection4;
        ScrollDirection[] scrollDirectionArr = {scrollDirection, scrollDirection2, scrollDirection3, scrollDirection4};
        $VALUES = scrollDirectionArr;
        $ENTRIES = C3cG.A0w(scrollDirectionArr);
        Companion = new Companion();
    }

    public static Ey9<ScrollDirection> getEntries() {
        return $ENTRIES;
    }

    public static ScrollDirection valueOf(String str) {
        return (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
    }

    public static ScrollDirection[] values() {
        return (ScrollDirection[]) $VALUES.clone();
    }

    public ScrollDirection(String str, int i) {
    }
}

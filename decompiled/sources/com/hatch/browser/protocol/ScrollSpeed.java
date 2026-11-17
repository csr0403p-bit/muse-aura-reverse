package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ScrollSpeed {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ScrollSpeed[] $VALUES;
    public static final Companion Companion;
    public static final ScrollSpeed FAST;
    public static final ScrollSpeed NORMAL;
    public static final ScrollSpeed SLOW;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ScrollSpeed scrollSpeed = new ScrollSpeed("SLOW", 0);
        SLOW = scrollSpeed;
        ScrollSpeed scrollSpeed2 = new ScrollSpeed("NORMAL", 1);
        NORMAL = scrollSpeed2;
        ScrollSpeed scrollSpeed3 = new ScrollSpeed("FAST", 2);
        FAST = scrollSpeed3;
        ScrollSpeed[] scrollSpeedArr = {scrollSpeed, scrollSpeed2, scrollSpeed3};
        $VALUES = scrollSpeedArr;
        $ENTRIES = C3cG.A0w(scrollSpeedArr);
        Companion = new Companion();
    }

    public static Ey9<ScrollSpeed> getEntries() {
        return $ENTRIES;
    }

    public static ScrollSpeed valueOf(String str) {
        return (ScrollSpeed) Enum.valueOf(ScrollSpeed.class, str);
    }

    public static ScrollSpeed[] values() {
        return (ScrollSpeed[]) $VALUES.clone();
    }

    public ScrollSpeed(String str, int i) {
    }
}

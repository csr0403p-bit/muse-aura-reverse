package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NamedKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NamedKey[] $VALUES;
    public static final NamedKey ARROW_DOWN;
    public static final NamedKey ARROW_LEFT;
    public static final NamedKey ARROW_RIGHT;
    public static final NamedKey ARROW_UP;
    public static final NamedKey BACKSPACE;
    public static final Companion Companion;
    public static final NamedKey DELETE;
    public static final NamedKey END;
    public static final NamedKey ENTER;
    public static final NamedKey ESCAPE;
    public static final NamedKey HOME;
    public static final NamedKey INSERT;
    public static final NamedKey NUMPAD_ENTER;
    public static final NamedKey PAGE_DOWN;
    public static final NamedKey PAGE_UP;
    public static final NamedKey SPACE;
    public static final NamedKey TAB;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        NamedKey namedKey = new NamedKey("ENTER", 0);
        ENTER = namedKey;
        NamedKey namedKey2 = new NamedKey("NUMPAD_ENTER", 1);
        NUMPAD_ENTER = namedKey2;
        NamedKey namedKey3 = new NamedKey("TAB", 2);
        TAB = namedKey3;
        NamedKey namedKey4 = new NamedKey("ESCAPE", 3);
        ESCAPE = namedKey4;
        NamedKey namedKey5 = new NamedKey("BACKSPACE", 4);
        BACKSPACE = namedKey5;
        NamedKey namedKey6 = new NamedKey("DELETE", 5);
        DELETE = namedKey6;
        NamedKey namedKey7 = new NamedKey("ARROW_UP", 6);
        ARROW_UP = namedKey7;
        NamedKey namedKey8 = new NamedKey("ARROW_DOWN", 7);
        ARROW_DOWN = namedKey8;
        NamedKey namedKey9 = new NamedKey("ARROW_LEFT", 8);
        ARROW_LEFT = namedKey9;
        NamedKey namedKey10 = new NamedKey("ARROW_RIGHT", 9);
        ARROW_RIGHT = namedKey10;
        NamedKey namedKey11 = new NamedKey("HOME", 10);
        HOME = namedKey11;
        NamedKey namedKey12 = new NamedKey("END", 11);
        END = namedKey12;
        NamedKey namedKey13 = new NamedKey("PAGE_UP", 12);
        PAGE_UP = namedKey13;
        NamedKey namedKey14 = new NamedKey("PAGE_DOWN", 13);
        PAGE_DOWN = namedKey14;
        NamedKey namedKey15 = new NamedKey("SPACE", 14);
        SPACE = namedKey15;
        NamedKey namedKey16 = new NamedKey("INSERT", 15);
        INSERT = namedKey16;
        NamedKey[] namedKeyArr = {namedKey, namedKey2, namedKey3, namedKey4, namedKey5, namedKey6, namedKey7, namedKey8, namedKey9, namedKey10, namedKey11, namedKey12, namedKey13, namedKey14, namedKey15, namedKey16};
        $VALUES = namedKeyArr;
        $ENTRIES = C3cG.A0w(namedKeyArr);
        Companion = new Companion();
    }

    public static Ey9<NamedKey> getEntries() {
        return $ENTRIES;
    }

    public static NamedKey valueOf(String str) {
        return (NamedKey) Enum.valueOf(NamedKey.class, str);
    }

    public static NamedKey[] values() {
        return (NamedKey[]) $VALUES.clone();
    }

    public NamedKey(String str, int i) {
    }
}

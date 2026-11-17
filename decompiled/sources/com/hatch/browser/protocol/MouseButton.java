package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MouseButton {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MouseButton[] $VALUES;
    public static final Companion Companion;
    public static final MouseButton LEFT;
    public static final MouseButton MIDDLE;
    public static final MouseButton RIGHT;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        MouseButton mouseButton = new MouseButton("LEFT", 0);
        LEFT = mouseButton;
        MouseButton mouseButton2 = new MouseButton("MIDDLE", 1);
        MIDDLE = mouseButton2;
        MouseButton mouseButton3 = new MouseButton("RIGHT", 2);
        RIGHT = mouseButton3;
        MouseButton[] mouseButtonArr = {mouseButton, mouseButton2, mouseButton3};
        $VALUES = mouseButtonArr;
        $ENTRIES = C3cG.A0w(mouseButtonArr);
        Companion = new Companion();
    }

    public static Ey9<MouseButton> getEntries() {
        return $ENTRIES;
    }

    public static MouseButton valueOf(String str) {
        return (MouseButton) Enum.valueOf(MouseButton.class, str);
    }

    public static MouseButton[] values() {
        return (MouseButton[]) $VALUES.clone();
    }

    public MouseButton(String str, int i) {
    }
}

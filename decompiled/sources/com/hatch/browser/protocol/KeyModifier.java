package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class KeyModifier {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ KeyModifier[] $VALUES;
    public static final KeyModifier ALT;
    public static final KeyModifier CONTROL;
    public static final Companion Companion;
    public static final KeyModifier META;
    public static final KeyModifier SHIFT;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        KeyModifier keyModifier = new KeyModifier("SHIFT", 0);
        SHIFT = keyModifier;
        KeyModifier keyModifier2 = new KeyModifier("CONTROL", 1);
        CONTROL = keyModifier2;
        KeyModifier keyModifier3 = new KeyModifier("ALT", 2);
        ALT = keyModifier3;
        KeyModifier keyModifier4 = new KeyModifier("META", 3);
        META = keyModifier4;
        KeyModifier[] keyModifierArr = {keyModifier, keyModifier2, keyModifier3, keyModifier4};
        $VALUES = keyModifierArr;
        $ENTRIES = C3cG.A0w(keyModifierArr);
        Companion = new Companion();
    }

    public static Ey9<KeyModifier> getEntries() {
        return $ENTRIES;
    }

    public static KeyModifier valueOf(String str) {
        return (KeyModifier) Enum.valueOf(KeyModifier.class, str);
    }

    public static KeyModifier[] values() {
        return (KeyModifier[]) $VALUES.clone();
    }

    public KeyModifier(String str, int i) {
    }
}

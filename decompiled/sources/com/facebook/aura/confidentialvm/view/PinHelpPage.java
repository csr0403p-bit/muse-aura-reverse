package com.facebook.aura.confidentialvm.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PinHelpPage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PinHelpPage[] $VALUES;
    public static final PinHelpPage CHANGE_PIN;
    public static final PinHelpPage HELP;

    static {
        PinHelpPage pinHelpPage = new PinHelpPage("HELP", 0);
        HELP = pinHelpPage;
        PinHelpPage pinHelpPage2 = new PinHelpPage("CHANGE_PIN", 1);
        CHANGE_PIN = pinHelpPage2;
        PinHelpPage[] pinHelpPageArr = {pinHelpPage, pinHelpPage2};
        $VALUES = pinHelpPageArr;
        $ENTRIES = new F3w(pinHelpPageArr);
    }

    public static Ey9<PinHelpPage> getEntries() {
        return $ENTRIES;
    }

    public static PinHelpPage valueOf(String str) {
        return (PinHelpPage) Enum.valueOf(PinHelpPage.class, str);
    }

    public static PinHelpPage[] values() {
        return (PinHelpPage[]) $VALUES.clone();
    }

    public PinHelpPage(String str, int i) {
    }
}

package com.facebook.aura.confidentialvm.repository;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConfidentialVmValuePropIcon {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmValuePropIcon[] $VALUES;
    public static final ConfidentialVmValuePropIcon FOUR_DOTS;
    public static final ConfidentialVmValuePropIcon INFO;
    public static final ConfidentialVmValuePropIcon SPEECH_BUBBLE;

    static {
        ConfidentialVmValuePropIcon confidentialVmValuePropIcon = new ConfidentialVmValuePropIcon("SPEECH_BUBBLE", 0);
        SPEECH_BUBBLE = confidentialVmValuePropIcon;
        ConfidentialVmValuePropIcon confidentialVmValuePropIcon2 = new ConfidentialVmValuePropIcon("FOUR_DOTS", 1);
        FOUR_DOTS = confidentialVmValuePropIcon2;
        ConfidentialVmValuePropIcon confidentialVmValuePropIcon3 = new ConfidentialVmValuePropIcon("INFO", 2);
        INFO = confidentialVmValuePropIcon3;
        ConfidentialVmValuePropIcon[] confidentialVmValuePropIconArr = {confidentialVmValuePropIcon, confidentialVmValuePropIcon2, confidentialVmValuePropIcon3};
        $VALUES = confidentialVmValuePropIconArr;
        $ENTRIES = C3cG.A0w(confidentialVmValuePropIconArr);
    }

    public static Ey9<ConfidentialVmValuePropIcon> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmValuePropIcon valueOf(String str) {
        return (ConfidentialVmValuePropIcon) Enum.valueOf(ConfidentialVmValuePropIcon.class, str);
    }

    public static ConfidentialVmValuePropIcon[] values() {
        return (ConfidentialVmValuePropIcon[]) $VALUES.clone();
    }

    public ConfidentialVmValuePropIcon(String str, int i) {
    }
}

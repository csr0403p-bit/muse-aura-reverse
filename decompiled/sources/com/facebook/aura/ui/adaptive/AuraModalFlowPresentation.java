package com.facebook.aura.ui.adaptive;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraModalFlowPresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraModalFlowPresentation[] $VALUES;
    public static final AuraModalFlowPresentation Dialog;
    public static final AuraModalFlowPresentation Pages;

    static {
        AuraModalFlowPresentation auraModalFlowPresentation = new AuraModalFlowPresentation("Pages", 0);
        Pages = auraModalFlowPresentation;
        AuraModalFlowPresentation auraModalFlowPresentation2 = new AuraModalFlowPresentation("Dialog", 1);
        Dialog = auraModalFlowPresentation2;
        AuraModalFlowPresentation[] auraModalFlowPresentationArr = {auraModalFlowPresentation, auraModalFlowPresentation2};
        $VALUES = auraModalFlowPresentationArr;
        $ENTRIES = new F3w(auraModalFlowPresentationArr);
    }

    public static Ey9<AuraModalFlowPresentation> getEntries() {
        return $ENTRIES;
    }

    public static AuraModalFlowPresentation valueOf(String str) {
        return (AuraModalFlowPresentation) Enum.valueOf(AuraModalFlowPresentation.class, str);
    }

    public static AuraModalFlowPresentation[] values() {
        return (AuraModalFlowPresentation[]) $VALUES.clone();
    }

    public AuraModalFlowPresentation(String str, int i) {
    }
}

package com.facebook.aura.assist;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AssistIdentityPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AssistIdentityPhase[] $VALUES;
    public static final AssistIdentityPhase COLLAPSED;
    public static final AssistIdentityPhase COLLAPSING;
    public static final AssistIdentityPhase EXPANDED;
    public static final AssistIdentityPhase EXPANDING;

    static {
        AssistIdentityPhase assistIdentityPhase = new AssistIdentityPhase("EXPANDED", 0);
        EXPANDED = assistIdentityPhase;
        AssistIdentityPhase assistIdentityPhase2 = new AssistIdentityPhase("COLLAPSING", 1);
        COLLAPSING = assistIdentityPhase2;
        AssistIdentityPhase assistIdentityPhase3 = new AssistIdentityPhase("COLLAPSED", 2);
        COLLAPSED = assistIdentityPhase3;
        AssistIdentityPhase assistIdentityPhase4 = new AssistIdentityPhase("EXPANDING", 3);
        EXPANDING = assistIdentityPhase4;
        AssistIdentityPhase[] assistIdentityPhaseArr = {assistIdentityPhase, assistIdentityPhase2, assistIdentityPhase3, assistIdentityPhase4};
        $VALUES = assistIdentityPhaseArr;
        $ENTRIES = C3cG.A0w(assistIdentityPhaseArr);
    }

    public static Ey9<AssistIdentityPhase> getEntries() {
        return $ENTRIES;
    }

    public static AssistIdentityPhase valueOf(String str) {
        return (AssistIdentityPhase) Enum.valueOf(AssistIdentityPhase.class, str);
    }

    public static AssistIdentityPhase[] values() {
        return (AssistIdentityPhase[]) $VALUES.clone();
    }

    public AssistIdentityPhase(String str, int i) {
    }
}

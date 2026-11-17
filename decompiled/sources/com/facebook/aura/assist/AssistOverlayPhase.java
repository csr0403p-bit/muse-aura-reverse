package com.facebook.aura.assist;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AssistOverlayPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AssistOverlayPhase[] $VALUES;
    public static final AssistOverlayPhase ERROR;
    public static final AssistOverlayPhase IDLE;
    public static final AssistOverlayPhase LISTENING;
    public static final AssistOverlayPhase RESPONDING;
    public static final AssistOverlayPhase SUBMITTING;

    static {
        AssistOverlayPhase assistOverlayPhase = new AssistOverlayPhase("LISTENING", 0);
        LISTENING = assistOverlayPhase;
        AssistOverlayPhase assistOverlayPhase2 = new AssistOverlayPhase("SUBMITTING", 1);
        SUBMITTING = assistOverlayPhase2;
        AssistOverlayPhase assistOverlayPhase3 = new AssistOverlayPhase("RESPONDING", 2);
        RESPONDING = assistOverlayPhase3;
        AssistOverlayPhase assistOverlayPhase4 = new AssistOverlayPhase("IDLE", 3);
        IDLE = assistOverlayPhase4;
        AssistOverlayPhase assistOverlayPhase5 = new AssistOverlayPhase("ERROR", 4);
        ERROR = assistOverlayPhase5;
        AssistOverlayPhase[] assistOverlayPhaseArr = {assistOverlayPhase, assistOverlayPhase2, assistOverlayPhase3, assistOverlayPhase4, assistOverlayPhase5};
        $VALUES = assistOverlayPhaseArr;
        $ENTRIES = C3cG.A0w(assistOverlayPhaseArr);
    }

    public static Ey9<AssistOverlayPhase> getEntries() {
        return $ENTRIES;
    }

    public static AssistOverlayPhase valueOf(String str) {
        return (AssistOverlayPhase) Enum.valueOf(AssistOverlayPhase.class, str);
    }

    public static AssistOverlayPhase[] values() {
        return (AssistOverlayPhase[]) $VALUES.clone();
    }

    public AssistOverlayPhase(String str, int i) {
    }
}

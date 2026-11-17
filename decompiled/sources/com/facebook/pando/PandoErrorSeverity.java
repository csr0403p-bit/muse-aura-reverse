package com.facebook.pando;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PandoErrorSeverity {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PandoErrorSeverity[] $VALUES;
    public static final PandoErrorSeverity CRITICAL;
    public static final PandoErrorSeverity ERROR;
    public static final PandoErrorSeverity NONE;
    public static final PandoErrorSeverity UNKNOWN;
    public static final PandoErrorSeverity UNSET;
    public static final PandoErrorSeverity WARNING;

    static {
        PandoErrorSeverity pandoErrorSeverity = new PandoErrorSeverity(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = pandoErrorSeverity;
        PandoErrorSeverity pandoErrorSeverity2 = new PandoErrorSeverity("WARNING", 1);
        WARNING = pandoErrorSeverity2;
        PandoErrorSeverity pandoErrorSeverity3 = new PandoErrorSeverity("ERROR", 2);
        ERROR = pandoErrorSeverity3;
        PandoErrorSeverity pandoErrorSeverity4 = new PandoErrorSeverity("CRITICAL", 3);
        CRITICAL = pandoErrorSeverity4;
        PandoErrorSeverity pandoErrorSeverity5 = new PandoErrorSeverity("UNSET", 4);
        UNSET = pandoErrorSeverity5;
        PandoErrorSeverity pandoErrorSeverity6 = new PandoErrorSeverity("UNKNOWN", 5);
        UNKNOWN = pandoErrorSeverity6;
        PandoErrorSeverity[] pandoErrorSeverityArr = {pandoErrorSeverity, pandoErrorSeverity2, pandoErrorSeverity3, pandoErrorSeverity4, pandoErrorSeverity5, pandoErrorSeverity6};
        $VALUES = pandoErrorSeverityArr;
        $ENTRIES = C3cG.A0w(pandoErrorSeverityArr);
    }

    public static Ey9<PandoErrorSeverity> getEntries() {
        return $ENTRIES;
    }

    public static PandoErrorSeverity valueOf(String str) {
        return (PandoErrorSeverity) Enum.valueOf(PandoErrorSeverity.class, str);
    }

    public static PandoErrorSeverity[] values() {
        return (PandoErrorSeverity[]) $VALUES.clone();
    }

    public PandoErrorSeverity(String str, int i) {
    }
}

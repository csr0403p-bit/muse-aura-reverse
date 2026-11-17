package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Outcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Outcome[] $VALUES;
    public static final Outcome BLOCKED;
    public static final Outcome CLEARED_BY_SERVER;
    public static final Outcome LOGGED_OUT;
    public static final Outcome VERIFIED;
    public final String eventType;

    static {
        Outcome outcome = new Outcome("VERIFIED", 0, "success");
        VERIFIED = outcome;
        Outcome outcome2 = new Outcome("BLOCKED", 1, "error");
        BLOCKED = outcome2;
        Outcome outcome3 = new Outcome("LOGGED_OUT", 2, "warning");
        LOGGED_OUT = outcome3;
        Outcome outcome4 = new Outcome("CLEARED_BY_SERVER", 3, "success");
        CLEARED_BY_SERVER = outcome4;
        Outcome[] outcomeArr = {outcome, outcome2, outcome3, outcome4};
        $VALUES = outcomeArr;
        $ENTRIES = C3cG.A0w(outcomeArr);
    }

    public static Ey9<Outcome> getEntries() {
        return $ENTRIES;
    }

    public static Outcome valueOf(String str) {
        return (Outcome) Enum.valueOf(Outcome.class, str);
    }

    public static Outcome[] values() {
        return (Outcome[]) $VALUES.clone();
    }

    public final String getEventType() {
        return this.eventType;
    }

    public Outcome(String str, int i, String str2) {
        this.eventType = str2;
    }
}

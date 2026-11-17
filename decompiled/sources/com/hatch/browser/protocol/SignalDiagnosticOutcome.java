package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SignalDiagnosticOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SignalDiagnosticOutcome[] $VALUES;
    public static final SignalDiagnosticOutcome BUDGET_EXHAUSTED;
    public static final SignalDiagnosticOutcome CONFIRMATION_FAILED;
    public static final Companion Companion;
    public static final SignalDiagnosticOutcome DOCUMENT_CHANGED;
    public static final SignalDiagnosticOutcome DOCUMENT_UNAVAILABLE;
    public static final SignalDiagnosticOutcome EMITTED;
    public static final SignalDiagnosticOutcome NOT_ELIGIBLE;
    public static final SignalDiagnosticOutcome NOT_RENDERED;
    public static final SignalDiagnosticOutcome NOT_VERIFIED;
    public static final SignalDiagnosticOutcome NO_MATCH;
    public static final SignalDiagnosticOutcome UNAVAILABLE;
    public static final SignalDiagnosticOutcome UNSTABLE;
    public static final SignalDiagnosticOutcome URL_CHANGED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        SignalDiagnosticOutcome signalDiagnosticOutcome = new SignalDiagnosticOutcome("EMITTED", 0);
        EMITTED = signalDiagnosticOutcome;
        SignalDiagnosticOutcome signalDiagnosticOutcome2 = new SignalDiagnosticOutcome("NOT_ELIGIBLE", 1);
        NOT_ELIGIBLE = signalDiagnosticOutcome2;
        SignalDiagnosticOutcome signalDiagnosticOutcome3 = new SignalDiagnosticOutcome("NO_MATCH", 2);
        NO_MATCH = signalDiagnosticOutcome3;
        SignalDiagnosticOutcome signalDiagnosticOutcome4 = new SignalDiagnosticOutcome("CONFIRMATION_FAILED", 3);
        CONFIRMATION_FAILED = signalDiagnosticOutcome4;
        SignalDiagnosticOutcome signalDiagnosticOutcome5 = new SignalDiagnosticOutcome("NOT_RENDERED", 4);
        NOT_RENDERED = signalDiagnosticOutcome5;
        SignalDiagnosticOutcome signalDiagnosticOutcome6 = new SignalDiagnosticOutcome("BUDGET_EXHAUSTED", 5);
        BUDGET_EXHAUSTED = signalDiagnosticOutcome6;
        SignalDiagnosticOutcome signalDiagnosticOutcome7 = new SignalDiagnosticOutcome("UNAVAILABLE", 6);
        UNAVAILABLE = signalDiagnosticOutcome7;
        SignalDiagnosticOutcome signalDiagnosticOutcome8 = new SignalDiagnosticOutcome("UNSTABLE", 7);
        UNSTABLE = signalDiagnosticOutcome8;
        SignalDiagnosticOutcome signalDiagnosticOutcome9 = new SignalDiagnosticOutcome("NOT_VERIFIED", 8);
        NOT_VERIFIED = signalDiagnosticOutcome9;
        SignalDiagnosticOutcome signalDiagnosticOutcome10 = new SignalDiagnosticOutcome("URL_CHANGED", 9);
        URL_CHANGED = signalDiagnosticOutcome10;
        SignalDiagnosticOutcome signalDiagnosticOutcome11 = new SignalDiagnosticOutcome("DOCUMENT_CHANGED", 10);
        DOCUMENT_CHANGED = signalDiagnosticOutcome11;
        SignalDiagnosticOutcome signalDiagnosticOutcome12 = new SignalDiagnosticOutcome("DOCUMENT_UNAVAILABLE", 11);
        DOCUMENT_UNAVAILABLE = signalDiagnosticOutcome12;
        SignalDiagnosticOutcome[] signalDiagnosticOutcomeArr = {signalDiagnosticOutcome, signalDiagnosticOutcome2, signalDiagnosticOutcome3, signalDiagnosticOutcome4, signalDiagnosticOutcome5, signalDiagnosticOutcome6, signalDiagnosticOutcome7, signalDiagnosticOutcome8, signalDiagnosticOutcome9, signalDiagnosticOutcome10, signalDiagnosticOutcome11, signalDiagnosticOutcome12};
        $VALUES = signalDiagnosticOutcomeArr;
        $ENTRIES = C3cG.A0w(signalDiagnosticOutcomeArr);
        Companion = new Companion();
    }

    public static Ey9<SignalDiagnosticOutcome> getEntries() {
        return $ENTRIES;
    }

    public static SignalDiagnosticOutcome valueOf(String str) {
        return (SignalDiagnosticOutcome) Enum.valueOf(SignalDiagnosticOutcome.class, str);
    }

    public static SignalDiagnosticOutcome[] values() {
        return (SignalDiagnosticOutcome[]) $VALUES.clone();
    }

    public SignalDiagnosticOutcome(String str, int i) {
    }
}

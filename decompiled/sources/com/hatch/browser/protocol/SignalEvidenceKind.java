package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SignalEvidenceKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SignalEvidenceKind[] $VALUES;
    public static final Companion Companion;
    public static final SignalEvidenceKind DOM;
    public static final SignalEvidenceKind URL;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        SignalEvidenceKind signalEvidenceKind = new SignalEvidenceKind("DOM", 0);
        DOM = signalEvidenceKind;
        SignalEvidenceKind signalEvidenceKind2 = new SignalEvidenceKind("URL", 1);
        URL = signalEvidenceKind2;
        SignalEvidenceKind[] signalEvidenceKindArr = {signalEvidenceKind, signalEvidenceKind2};
        $VALUES = signalEvidenceKindArr;
        $ENTRIES = C3cG.A0w(signalEvidenceKindArr);
        Companion = new Companion();
    }

    public static Ey9<SignalEvidenceKind> getEntries() {
        return $ENTRIES;
    }

    public static SignalEvidenceKind valueOf(String str) {
        return (SignalEvidenceKind) Enum.valueOf(SignalEvidenceKind.class, str);
    }

    public static SignalEvidenceKind[] values() {
        return (SignalEvidenceKind[]) $VALUES.clone();
    }

    public SignalEvidenceKind(String str, int i) {
    }
}

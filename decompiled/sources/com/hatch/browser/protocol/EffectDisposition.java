package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EffectDisposition {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EffectDisposition[] $VALUES;
    public static final EffectDisposition COMPLETED;
    public static final Companion Companion;
    public static final EffectDisposition NOT_STARTED;
    public static final EffectDisposition PARTIALLY_COMPLETED;
    public static final EffectDisposition UNKNOWN;

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        EffectDisposition effectDisposition = new EffectDisposition("NOT_STARTED", 0);
        NOT_STARTED = effectDisposition;
        EffectDisposition effectDisposition2 = new EffectDisposition("COMPLETED", 1);
        COMPLETED = effectDisposition2;
        EffectDisposition effectDisposition3 = new EffectDisposition("PARTIALLY_COMPLETED", 2);
        PARTIALLY_COMPLETED = effectDisposition3;
        EffectDisposition effectDisposition4 = new EffectDisposition("UNKNOWN", 3);
        UNKNOWN = effectDisposition4;
        EffectDisposition[] effectDispositionArr = {effectDisposition, effectDisposition2, effectDisposition3, effectDisposition4};
        $VALUES = effectDispositionArr;
        $ENTRIES = C3cG.A0w(effectDispositionArr);
        Companion = new Companion();
    }

    public static Ey9<EffectDisposition> getEntries() {
        return $ENTRIES;
    }

    public static EffectDisposition valueOf(String str) {
        return (EffectDisposition) Enum.valueOf(EffectDisposition.class, str);
    }

    public static EffectDisposition[] values() {
        return (EffectDisposition[]) $VALUES.clone();
    }

    public EffectDisposition(String str, int i) {
    }
}

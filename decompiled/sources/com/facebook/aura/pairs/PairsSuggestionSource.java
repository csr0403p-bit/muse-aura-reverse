package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsSuggestionSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsSuggestionSource[] $VALUES;
    public static final PairsSuggestionSource FACEBOOK;
    public static final PairsSuggestionSource INSTAGRAM;
    public static final PairsSuggestionSource MESSENGER;
    public static final PairsSuggestionSource THREADS;

    static {
        PairsSuggestionSource pairsSuggestionSource = new PairsSuggestionSource("FACEBOOK", 0);
        FACEBOOK = pairsSuggestionSource;
        PairsSuggestionSource pairsSuggestionSource2 = new PairsSuggestionSource("INSTAGRAM", 1);
        INSTAGRAM = pairsSuggestionSource2;
        PairsSuggestionSource pairsSuggestionSource3 = new PairsSuggestionSource("MESSENGER", 2);
        MESSENGER = pairsSuggestionSource3;
        PairsSuggestionSource pairsSuggestionSource4 = new PairsSuggestionSource("THREADS", 3);
        THREADS = pairsSuggestionSource4;
        PairsSuggestionSource[] pairsSuggestionSourceArr = {pairsSuggestionSource, pairsSuggestionSource2, pairsSuggestionSource3, pairsSuggestionSource4};
        $VALUES = pairsSuggestionSourceArr;
        $ENTRIES = C3cG.A0w(pairsSuggestionSourceArr);
    }

    public static Ey9<PairsSuggestionSource> getEntries() {
        return $ENTRIES;
    }

    public static PairsSuggestionSource valueOf(String str) {
        return (PairsSuggestionSource) Enum.valueOf(PairsSuggestionSource.class, str);
    }

    public static PairsSuggestionSource[] values() {
        return (PairsSuggestionSource[]) $VALUES.clone();
    }

    public PairsSuggestionSource(String str, int i) {
    }
}

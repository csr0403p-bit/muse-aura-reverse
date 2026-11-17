package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PlayoutInjection {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PlayoutInjection[] $VALUES;
    public static final PlayoutInjection ACCEPTED;
    public static final PlayoutInjection BUFFER_FULL;
    public static final PlayoutInjection REJECTED;

    static {
        PlayoutInjection playoutInjection = new PlayoutInjection("ACCEPTED", 0);
        ACCEPTED = playoutInjection;
        PlayoutInjection playoutInjection2 = new PlayoutInjection("BUFFER_FULL", 1);
        BUFFER_FULL = playoutInjection2;
        PlayoutInjection playoutInjection3 = new PlayoutInjection("REJECTED", 2);
        REJECTED = playoutInjection3;
        PlayoutInjection[] playoutInjectionArr = {playoutInjection, playoutInjection2, playoutInjection3};
        $VALUES = playoutInjectionArr;
        $ENTRIES = C3cG.A0w(playoutInjectionArr);
    }

    public static Ey9<PlayoutInjection> getEntries() {
        return $ENTRIES;
    }

    public static PlayoutInjection valueOf(String str) {
        return (PlayoutInjection) Enum.valueOf(PlayoutInjection.class, str);
    }

    public static PlayoutInjection[] values() {
        return (PlayoutInjection[]) $VALUES.clone();
    }

    public PlayoutInjection(String str, int i) {
    }
}

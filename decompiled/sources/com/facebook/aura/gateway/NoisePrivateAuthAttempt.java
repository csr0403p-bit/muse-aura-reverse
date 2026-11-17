package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class NoisePrivateAuthAttempt {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NoisePrivateAuthAttempt[] $VALUES;
    public static final NoisePrivateAuthAttempt AUTHENTICATE;
    public static final NoisePrivateAuthAttempt DISCOVER;
    public static final NoisePrivateAuthAttempt LEGACY;

    static {
        NoisePrivateAuthAttempt noisePrivateAuthAttempt = new NoisePrivateAuthAttempt("LEGACY", 0);
        LEGACY = noisePrivateAuthAttempt;
        NoisePrivateAuthAttempt noisePrivateAuthAttempt2 = new NoisePrivateAuthAttempt("DISCOVER", 1);
        DISCOVER = noisePrivateAuthAttempt2;
        NoisePrivateAuthAttempt noisePrivateAuthAttempt3 = new NoisePrivateAuthAttempt("AUTHENTICATE", 2);
        AUTHENTICATE = noisePrivateAuthAttempt3;
        NoisePrivateAuthAttempt[] noisePrivateAuthAttemptArr = {noisePrivateAuthAttempt, noisePrivateAuthAttempt2, noisePrivateAuthAttempt3};
        $VALUES = noisePrivateAuthAttemptArr;
        $ENTRIES = C3cG.A0w(noisePrivateAuthAttemptArr);
    }

    public static Ey9<NoisePrivateAuthAttempt> getEntries() {
        return $ENTRIES;
    }

    public static NoisePrivateAuthAttempt valueOf(String str) {
        return (NoisePrivateAuthAttempt) Enum.valueOf(NoisePrivateAuthAttempt.class, str);
    }

    public static NoisePrivateAuthAttempt[] values() {
        return (NoisePrivateAuthAttempt[]) $VALUES.clone();
    }

    public NoisePrivateAuthAttempt(String str, int i) {
    }
}

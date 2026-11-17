package com.facebook.aura.gateway.connection;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Presence {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Presence[] $VALUES;
    public static final Presence ACTIVE;
    public static final Presence AWAY;

    static {
        Presence presence = new Presence("ACTIVE", 0);
        ACTIVE = presence;
        Presence presence2 = new Presence("AWAY", 1);
        AWAY = presence2;
        Presence[] presenceArr = {presence, presence2};
        $VALUES = presenceArr;
        $ENTRIES = C3cG.A0w(presenceArr);
    }

    public static Ey9<Presence> getEntries() {
        return $ENTRIES;
    }

    public static Presence valueOf(String str) {
        return (Presence) Enum.valueOf(Presence.class, str);
    }

    public static Presence[] values() {
        return (Presence[]) $VALUES.clone();
    }

    public Presence(String str, int i) {
    }
}

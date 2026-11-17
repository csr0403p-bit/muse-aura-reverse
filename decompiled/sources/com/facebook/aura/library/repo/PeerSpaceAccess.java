package com.facebook.aura.library.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PeerSpaceAccess {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PeerSpaceAccess[] $VALUES;
    public static final PeerSpaceAccess AVAILABLE;
    public static final PeerSpaceAccess UNAVAILABLE;
    public static final PeerSpaceAccess UNREACHABLE;

    static {
        PeerSpaceAccess peerSpaceAccess = new PeerSpaceAccess("AVAILABLE", 0);
        AVAILABLE = peerSpaceAccess;
        PeerSpaceAccess peerSpaceAccess2 = new PeerSpaceAccess("UNAVAILABLE", 1);
        UNAVAILABLE = peerSpaceAccess2;
        PeerSpaceAccess peerSpaceAccess3 = new PeerSpaceAccess("UNREACHABLE", 2);
        UNREACHABLE = peerSpaceAccess3;
        PeerSpaceAccess[] peerSpaceAccessArr = {peerSpaceAccess, peerSpaceAccess2, peerSpaceAccess3};
        $VALUES = peerSpaceAccessArr;
        $ENTRIES = C3cG.A0w(peerSpaceAccessArr);
    }

    public static Ey9<PeerSpaceAccess> getEntries() {
        return $ENTRIES;
    }

    public static PeerSpaceAccess valueOf(String str) {
        return (PeerSpaceAccess) Enum.valueOf(PeerSpaceAccess.class, str);
    }

    public static PeerSpaceAccess[] values() {
        return (PeerSpaceAccess[]) $VALUES.clone();
    }

    public PeerSpaceAccess(String str, int i) {
    }
}

package com.facebook.aura.spaces.menu;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PeerSpacePermission {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PeerSpacePermission[] $VALUES;
    public static final Companion Companion;
    public static final PeerSpacePermission EDIT;
    public static final PeerSpacePermission USE;
    public static final PeerSpacePermission VIEW;
    public final String wire;

    static {
        PeerSpacePermission peerSpacePermission = new PeerSpacePermission("VIEW", 0, "view");
        VIEW = peerSpacePermission;
        PeerSpacePermission peerSpacePermission2 = new PeerSpacePermission("USE", 1, "use");
        USE = peerSpacePermission2;
        PeerSpacePermission peerSpacePermission3 = new PeerSpacePermission("EDIT", 2, "edit");
        EDIT = peerSpacePermission3;
        PeerSpacePermission[] peerSpacePermissionArr = {peerSpacePermission, peerSpacePermission2, peerSpacePermission3};
        $VALUES = peerSpacePermissionArr;
        $ENTRIES = C3cG.A0w(peerSpacePermissionArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final PeerSpacePermission fromWire(String str) {
            PeerSpacePermission next;
            Iterator<PeerSpacePermission> it = PeerSpacePermission.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWire(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<PeerSpacePermission> getEntries() {
        return $ENTRIES;
    }

    public static PeerSpacePermission valueOf(String str) {
        return (PeerSpacePermission) Enum.valueOf(PeerSpacePermission.class, str);
    }

    public static PeerSpacePermission[] values() {
        return (PeerSpacePermission[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public PeerSpacePermission(String str, int i, String str2) {
        this.wire = str2;
    }
}

package com.facebook.aura.spaces.menu;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PeerSpaceAccessRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String permission;

    public final class Companion {
        public final C9hr<PeerSpaceAccessRequestJson> serializer() {
            return PeerSpaceAccessRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerSpaceAccessRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PeerSpaceAccessRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerSpaceAccessRequestJson) && C7384Etj.areEqual(this.permission, ((PeerSpaceAccessRequestJson) obj).permission));
    }

    public /* synthetic */ PeerSpaceAccessRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerSpaceAccessRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.permission = str;
    }

    public static /* synthetic */ PeerSpaceAccessRequestJson copy$default(PeerSpaceAccessRequestJson peerSpaceAccessRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSpaceAccessRequestJson.permission;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerSpaceAccessRequestJson(str);
    }

    public final String component1() {
        return this.permission;
    }

    public final String getPermission() {
        return this.permission;
    }

    public int hashCode() {
        return this.permission.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PeerSpaceAccessRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.permission = str;
    }
}

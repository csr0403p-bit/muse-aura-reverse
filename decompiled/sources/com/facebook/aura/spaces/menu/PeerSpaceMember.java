package com.facebook.aura.spaces.menu;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class PeerSpaceMember extends C06G {
    public static final int $stable = 0;
    public final boolean isHost;
    public final boolean isYou;
    public final String museId;
    public final String name;
    public final PeerSpacePermission permission;
    public final String photoUrl;

    public PeerSpaceMember(String str, String str2, PeerSpacePermission peerSpacePermission, boolean z, boolean z2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.museId = str;
        this.name = str2;
        this.permission = peerSpacePermission;
        this.isYou = z;
        this.isHost = z2;
        this.photoUrl = str3;
    }

    public final PeerSpaceMember copy(String str, String str2, PeerSpacePermission peerSpacePermission, boolean z, boolean z2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new PeerSpaceMember(str, str2, peerSpacePermission, z, z2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSpaceMember) {
                PeerSpaceMember peerSpaceMember = (PeerSpaceMember) obj;
                if (!C7384Etj.areEqual(this.museId, peerSpaceMember.museId) || !C7384Etj.areEqual(this.name, peerSpaceMember.name) || this.permission != peerSpaceMember.permission || this.isYou != peerSpaceMember.isYou || this.isHost != peerSpaceMember.isHost || !C7384Etj.areEqual(this.photoUrl, peerSpaceMember.photoUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSpaceMember copy$default(PeerSpaceMember peerSpaceMember, String str, String str2, PeerSpacePermission peerSpacePermission, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSpaceMember.museId;
        }
        if ((i & 2) != 0) {
            str2 = peerSpaceMember.name;
        }
        if ((i & 4) != 0) {
            peerSpacePermission = peerSpaceMember.permission;
        }
        if ((i & 8) != 0) {
            z = peerSpaceMember.isYou;
        }
        if ((i & 16) != 0) {
            z2 = peerSpaceMember.isHost;
        }
        if ((i & 32) != 0) {
            str3 = peerSpaceMember.photoUrl;
        }
        return peerSpaceMember.copy(str, str2, peerSpacePermission, z, z2, str3);
    }

    public final String component1() {
        return this.museId;
    }

    public final String component2() {
        return this.name;
    }

    public final PeerSpacePermission component3() {
        return this.permission;
    }

    public final boolean component4() {
        return this.isYou;
    }

    public final boolean component5() {
        return this.isHost;
    }

    public final String component6() {
        return this.photoUrl;
    }

    public final String getMuseId() {
        return this.museId;
    }

    public final String getName() {
        return this.name;
    }

    public final PeerSpacePermission getPermission() {
        return this.permission;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01((((AnonymousClass001.A0G(this.museId) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0D(this.permission)) * 31, this.isYou), this.isHost) + AnonymousClass005.A0H(this.photoUrl);
    }

    public final boolean isHost() {
        return this.isHost;
    }

    public final boolean isYou() {
        return this.isYou;
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class PeerSpaceMenuSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String hostMuse;
    public final String spaceId;
    public final String title;

    public final class Companion {
        public final C9hr<PeerSpaceMenuSheetKey> serializer() {
            return PeerSpaceMenuSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerSpaceMenuSheetKey.hostMuse, c9iZ, 0);
        c9j5.AAV(peerSpaceMenuSheetKey.spaceId, c9iZ, 1);
        c9j5.AAV(peerSpaceMenuSheetKey.title, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSpaceMenuSheetKey) {
                PeerSpaceMenuSheetKey peerSpaceMenuSheetKey = (PeerSpaceMenuSheetKey) obj;
                if (!C7384Etj.areEqual(this.hostMuse, peerSpaceMenuSheetKey.hostMuse) || !C7384Etj.areEqual(this.spaceId, peerSpaceMenuSheetKey.spaceId) || !C7384Etj.areEqual(this.title, peerSpaceMenuSheetKey.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSpaceMenuSheetKey copy$default(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSpaceMenuSheetKey.hostMuse;
        }
        if ((i & 2) != 0) {
            str2 = peerSpaceMenuSheetKey.spaceId;
        }
        if ((i & 4) != 0) {
            str3 = peerSpaceMenuSheetKey.title;
        }
        return peerSpaceMenuSheetKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.hostMuse;
    }

    public final String component2() {
        return this.spaceId;
    }

    public final String component3() {
        return this.title;
    }

    public final String getHostMuse() {
        return this.hostMuse;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass005.A0I(this.spaceId, AnonymousClass001.A0G(this.hostMuse)));
    }

    public PeerSpaceMenuSheetKey(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.hostMuse = str;
        this.spaceId = str2;
        this.title = str3;
    }

    public final PeerSpaceMenuSheetKey copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PeerSpaceMenuSheetKey(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerSpaceMenuSheetKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PeerSpaceMenuSheetKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.hostMuse = str;
        this.spaceId = str2;
        this.title = str3;
    }
}

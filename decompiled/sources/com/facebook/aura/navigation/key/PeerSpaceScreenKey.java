package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class PeerSpaceScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean fromNavigation;
    public final String hostMuse;
    public final String publisherName;
    public final String spaceId;
    public final String title;

    public final class Companion {
        public final C9hr<PeerSpaceScreenKey> serializer() {
            return PeerSpaceScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(PeerSpaceScreenKey peerSpaceScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerSpaceScreenKey.hostMuse, c9iZ, 0);
        c9j5.AAV(peerSpaceScreenKey.spaceId, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerSpaceScreenKey.title)) {
            c9j5.AAV(peerSpaceScreenKey.title, c9iZ, 2);
        }
        if (zAfR || peerSpaceScreenKey.publisherName != null) {
            c9j5.AAP(peerSpaceScreenKey.publisherName, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || peerSpaceScreenKey.fromNavigation) {
            c9j5.AA7(c9iZ, 4, peerSpaceScreenKey.fromNavigation);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSpaceScreenKey) {
                PeerSpaceScreenKey peerSpaceScreenKey = (PeerSpaceScreenKey) obj;
                if (!C7384Etj.areEqual(this.hostMuse, peerSpaceScreenKey.hostMuse) || !C7384Etj.areEqual(this.spaceId, peerSpaceScreenKey.spaceId) || !C7384Etj.areEqual(this.title, peerSpaceScreenKey.title) || !C7384Etj.areEqual(this.publisherName, peerSpaceScreenKey.publisherName) || this.fromNavigation != peerSpaceScreenKey.fromNavigation) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSpaceScreenKey copy$default(PeerSpaceScreenKey peerSpaceScreenKey, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSpaceScreenKey.hostMuse;
        }
        if ((i & 2) != 0) {
            str2 = peerSpaceScreenKey.spaceId;
        }
        if ((i & 4) != 0) {
            str3 = peerSpaceScreenKey.title;
        }
        if ((i & 8) != 0) {
            str4 = peerSpaceScreenKey.publisherName;
        }
        if ((i & 16) != 0) {
            z = peerSpaceScreenKey.fromNavigation;
        }
        return peerSpaceScreenKey.copy(str, str2, str3, str4, z);
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

    public final String component4() {
        return this.publisherName;
    }

    public final boolean component5() {
        return this.fromNavigation;
    }

    public final boolean getFromNavigation() {
        return this.fromNavigation;
    }

    public final String getHostMuse() {
        return this.hostMuse;
    }

    public final String getPublisherName() {
        return this.publisherName;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.spaceId, AnonymousClass001.A0G(this.hostMuse))) + AnonymousClass006.A0G(this.publisherName)) * 31, this.fromNavigation);
    }

    public PeerSpaceScreenKey(String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.hostMuse = str;
        this.spaceId = str2;
        this.title = str3;
        this.publisherName = str4;
        this.fromNavigation = z;
    }

    public final PeerSpaceScreenKey copy(String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PeerSpaceScreenKey(str, str2, str3, str4, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerSpaceScreenKey(String str, String str2, String str3, String str4, boolean z, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? "" : str3, AnonymousClass006.A0u(i, str4), (i & 16) != 0 ? false : z);
    }

    public /* synthetic */ PeerSpaceScreenKey(int i, String str, String str2, String str3, String str4, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PeerSpaceScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.hostMuse = str;
        this.spaceId = str2;
        this.title = (i & 4) == 0 ? "" : str3;
        if ((i & 8) == 0) {
            this.publisherName = null;
        } else {
            this.publisherName = str4;
        }
        if ((i & 16) == 0) {
            this.fromNavigation = false;
        } else {
            this.fromNavigation = z;
        }
    }
}

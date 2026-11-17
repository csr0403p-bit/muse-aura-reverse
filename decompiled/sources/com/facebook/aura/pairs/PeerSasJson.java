package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerSasJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String ceremony_id;
    public final String digits;
    public final String relationship_generation_id;

    public final class Companion {
        public final C9hr<PeerSasJson> serializer() {
            return PeerSasJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerSasJson peerSasJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerSasJson.relationship_generation_id)) {
            c9j5.AAV(peerSasJson.relationship_generation_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(peerSasJson.ceremony_id)) {
            c9j5.AAV(peerSasJson.ceremony_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(peerSasJson.digits)) {
            c9j5.AAV(peerSasJson.digits, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSasJson) {
                PeerSasJson peerSasJson = (PeerSasJson) obj;
                if (!C7384Etj.areEqual(this.relationship_generation_id, peerSasJson.relationship_generation_id) || !C7384Etj.areEqual(this.ceremony_id, peerSasJson.ceremony_id) || !C7384Etj.areEqual(this.digits, peerSasJson.digits)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSasJson copy$default(PeerSasJson peerSasJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSasJson.relationship_generation_id;
        }
        if ((i & 2) != 0) {
            str2 = peerSasJson.ceremony_id;
        }
        if ((i & 4) != 0) {
            str3 = peerSasJson.digits;
        }
        return peerSasJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.relationship_generation_id;
    }

    public final String component2() {
        return this.ceremony_id;
    }

    public final String component3() {
        return this.digits;
    }

    public final String getCeremony_id() {
        return this.ceremony_id;
    }

    public final String getDigits() {
        return this.digits;
    }

    public final String getRelationship_generation_id() {
        return this.relationship_generation_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.digits, AnonymousClass005.A0I(this.ceremony_id, AnonymousClass001.A0G(this.relationship_generation_id)));
    }

    public PeerSasJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.relationship_generation_id = str;
        this.ceremony_id = str2;
        this.digits = str3;
    }

    public final PeerSasJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PeerSasJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerSasJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.relationship_generation_id = "";
        } else {
            this.relationship_generation_id = str;
        }
        if ((i & 2) == 0) {
            this.ceremony_id = "";
        } else {
            this.ceremony_id = str2;
        }
        if ((i & 4) == 0) {
            this.digits = "";
        } else {
            this.digits = str3;
        }
    }

    public /* synthetic */ PeerSasJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public PeerSasJson() {
        this("", "", "");
    }
}

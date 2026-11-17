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
public final class PeerSasConfirmResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String ceremony_id;
    public final String relationship_generation_id;
    public final String status;

    public final class Companion {
        public final C9hr<PeerSasConfirmResponseJson> serializer() {
            return PeerSasConfirmResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerSasConfirmResponseJson peerSasConfirmResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerSasConfirmResponseJson.relationship_generation_id)) {
            c9j5.AAV(peerSasConfirmResponseJson.relationship_generation_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(peerSasConfirmResponseJson.ceremony_id)) {
            c9j5.AAV(peerSasConfirmResponseJson.ceremony_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(peerSasConfirmResponseJson.status)) {
            c9j5.AAV(peerSasConfirmResponseJson.status, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSasConfirmResponseJson) {
                PeerSasConfirmResponseJson peerSasConfirmResponseJson = (PeerSasConfirmResponseJson) obj;
                if (!C7384Etj.areEqual(this.relationship_generation_id, peerSasConfirmResponseJson.relationship_generation_id) || !C7384Etj.areEqual(this.ceremony_id, peerSasConfirmResponseJson.ceremony_id) || !C7384Etj.areEqual(this.status, peerSasConfirmResponseJson.status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSasConfirmResponseJson copy$default(PeerSasConfirmResponseJson peerSasConfirmResponseJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSasConfirmResponseJson.relationship_generation_id;
        }
        if ((i & 2) != 0) {
            str2 = peerSasConfirmResponseJson.ceremony_id;
        }
        if ((i & 4) != 0) {
            str3 = peerSasConfirmResponseJson.status;
        }
        return peerSasConfirmResponseJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.relationship_generation_id;
    }

    public final String component2() {
        return this.ceremony_id;
    }

    public final String component3() {
        return this.status;
    }

    public final String getCeremony_id() {
        return this.ceremony_id;
    }

    public final String getRelationship_generation_id() {
        return this.relationship_generation_id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.status, AnonymousClass005.A0I(this.ceremony_id, AnonymousClass001.A0G(this.relationship_generation_id)));
    }

    public PeerSasConfirmResponseJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.relationship_generation_id = str;
        this.ceremony_id = str2;
        this.status = str3;
    }

    public final PeerSasConfirmResponseJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PeerSasConfirmResponseJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerSasConfirmResponseJson(int i, String str, String str2, String str3, C2hx c2hx) {
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
            this.status = "";
        } else {
            this.status = str3;
        }
    }

    public /* synthetic */ PeerSasConfirmResponseJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public PeerSasConfirmResponseJson() {
        this("", "", "");
    }
}

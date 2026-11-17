package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerSasConfirmRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String ceremony_id;
    public final String confirm_request_id;

    public final class Companion {
        public final C9hr<PeerSasConfirmRequestJson> serializer() {
            return PeerSasConfirmRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerSasConfirmRequestJson peerSasConfirmRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerSasConfirmRequestJson.ceremony_id, c9iZ, 0);
        c9j5.AAV(peerSasConfirmRequestJson.confirm_request_id, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSasConfirmRequestJson) {
                PeerSasConfirmRequestJson peerSasConfirmRequestJson = (PeerSasConfirmRequestJson) obj;
                if (!C7384Etj.areEqual(this.ceremony_id, peerSasConfirmRequestJson.ceremony_id) || !C7384Etj.areEqual(this.confirm_request_id, peerSasConfirmRequestJson.confirm_request_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSasConfirmRequestJson copy$default(PeerSasConfirmRequestJson peerSasConfirmRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSasConfirmRequestJson.ceremony_id;
        }
        if ((i & 2) != 0) {
            str2 = peerSasConfirmRequestJson.confirm_request_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new PeerSasConfirmRequestJson(str, str2);
    }

    public final String component1() {
        return this.ceremony_id;
    }

    public final String component2() {
        return this.confirm_request_id;
    }

    public final String getCeremony_id() {
        return this.ceremony_id;
    }

    public final String getConfirm_request_id() {
        return this.confirm_request_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.confirm_request_id, AnonymousClass001.A0G(this.ceremony_id));
    }

    public PeerSasConfirmRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.ceremony_id = str;
        this.confirm_request_id = str2;
    }

    public final PeerSasConfirmRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PeerSasConfirmRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerSasConfirmRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PeerSasConfirmRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.ceremony_id = str;
        this.confirm_request_id = str2;
    }
}

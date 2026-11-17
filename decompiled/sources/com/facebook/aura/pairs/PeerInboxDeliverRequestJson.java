package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInboxDeliverRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String delivery_id;
    public final long expires_at;
    public final String invite_b64;
    public final String sender_display_name;

    public final class Companion {
        public final C9hr<PeerInboxDeliverRequestJson> serializer() {
            return PeerInboxDeliverRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PeerInboxDeliverRequestJson copy$default(PeerInboxDeliverRequestJson peerInboxDeliverRequestJson, String str, String str2, String str3, long j, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j2 = j;
        if ((i & 1) != 0) {
            str4 = peerInboxDeliverRequestJson.delivery_id;
        }
        if ((i & 2) != 0) {
            str5 = peerInboxDeliverRequestJson.invite_b64;
        }
        if ((i & 4) != 0) {
            str6 = peerInboxDeliverRequestJson.sender_display_name;
        }
        if ((i & 8) != 0) {
            j2 = peerInboxDeliverRequestJson.expires_at;
        }
        AnonymousClass003.A0u(str4, str5);
        return new PeerInboxDeliverRequestJson(str4, str5, str6, j2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInboxDeliverRequestJson peerInboxDeliverRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerInboxDeliverRequestJson.delivery_id, c9iZ, 0);
        c9j5.AAV(peerInboxDeliverRequestJson.invite_b64, c9iZ, 1);
        if (c9j5.AfR() || peerInboxDeliverRequestJson.sender_display_name != null) {
            c9j5.AAP(peerInboxDeliverRequestJson.sender_display_name, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAN(c9iZ, 3, peerInboxDeliverRequestJson.expires_at);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInboxDeliverRequestJson) {
                PeerInboxDeliverRequestJson peerInboxDeliverRequestJson = (PeerInboxDeliverRequestJson) obj;
                if (!C7384Etj.areEqual(this.delivery_id, peerInboxDeliverRequestJson.delivery_id) || !C7384Etj.areEqual(this.invite_b64, peerInboxDeliverRequestJson.invite_b64) || !C7384Etj.areEqual(this.sender_display_name, peerInboxDeliverRequestJson.sender_display_name) || this.expires_at != peerInboxDeliverRequestJson.expires_at) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PeerInboxDeliverRequestJson(int i, String str, String str2, String str3, long j, C2hx c2hx) {
        if (11 != (i & 11)) {
            C9iI.A00(PeerInboxDeliverRequestJson$$serializer.descriptor, i, 11);
            throw F60.createAndThrow();
        }
        this.delivery_id = str;
        this.invite_b64 = str2;
        this.sender_display_name = C3cI.A0W(i, str3);
        this.expires_at = j;
    }

    public final String component1() {
        return this.delivery_id;
    }

    public final String component2() {
        return this.invite_b64;
    }

    public final String component3() {
        return this.sender_display_name;
    }

    public final long component4() {
        return this.expires_at;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public final long getExpires_at() {
        return this.expires_at;
    }

    public final String getInvite_b64() {
        return this.invite_b64;
    }

    public final String getSender_display_name() {
        return this.sender_display_name;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.expires_at, (AnonymousClass005.A0I(this.invite_b64, AnonymousClass001.A0G(this.delivery_id)) + AnonymousClass006.A0G(this.sender_display_name)) * 31);
    }

    public final PeerInboxDeliverRequestJson copy(String str, String str2, String str3, long j) {
        AnonymousClass003.A0u(str, str2);
        return new PeerInboxDeliverRequestJson(str, str2, str3, j);
    }

    public String toString() {
        return super.toString();
    }

    public PeerInboxDeliverRequestJson(String str, String str2, String str3, long j) {
        AnonymousClass003.A0u(str, str2);
        this.delivery_id = str;
        this.invite_b64 = str2;
        this.sender_display_name = str3;
        this.expires_at = j;
    }

    public /* synthetic */ PeerInboxDeliverRequestJson(String str, String str2, String str3, long j, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3), j);
    }
}

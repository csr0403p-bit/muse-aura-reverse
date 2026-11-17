package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInviteJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String claimed_by_muse;
    public final String create_request_id;
    public final long created_at_ms;
    public final String delivery_id;
    public final long expires_at_ms;
    public final String invite_id_b64;
    public final String label;
    public final String offered_preset;
    public final Long revoked_at_ms;

    public final class Companion {
        public final C9hr<PeerInviteJson> serializer() {
            return PeerInviteJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerInviteJson(String str, String str2, String str3, String str4, long j, long j2, String str5, Long l, String str6) {
        AnonymousClass005.A11(str, str3, str4, 0);
        this.invite_id_b64 = str;
        this.create_request_id = str2;
        this.label = str3;
        this.offered_preset = str4;
        this.created_at_ms = j;
        this.expires_at_ms = j2;
        this.claimed_by_muse = str5;
        this.revoked_at_ms = l;
        this.delivery_id = str6;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteJson peerInviteJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerInviteJson.invite_id_b64, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerInviteJson.create_request_id != null) {
            c9j5.AAP(peerInviteJson.create_request_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(peerInviteJson.label)) {
            c9j5.AAV(peerInviteJson.label, c9iZ, 2);
        }
        if (zAfR || !"".equals(peerInviteJson.offered_preset)) {
            c9j5.AAV(peerInviteJson.offered_preset, c9iZ, 3);
        }
        if (zAfR || peerInviteJson.created_at_ms != 0) {
            c9j5.AAN(c9iZ, 4, peerInviteJson.created_at_ms);
        }
        if (zAfR || peerInviteJson.expires_at_ms != 0) {
            c9j5.AAN(c9iZ, 5, peerInviteJson.expires_at_ms);
        }
        if (zAfR || peerInviteJson.claimed_by_muse != null) {
            c9j5.AAP(peerInviteJson.claimed_by_muse, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || peerInviteJson.revoked_at_ms != null) {
            c9j5.AAP(peerInviteJson.revoked_at_ms, C9j1.A00, c9iZ, 7);
        }
        if (zAfR || peerInviteJson.delivery_id != null) {
            c9j5.AAP(peerInviteJson.delivery_id, C07779iq.A01, c9iZ, 8);
        }
    }

    public final PeerInviteJson copy(String str, String str2, String str3, String str4, long j, long j2, String str5, Long l, String str6) {
        AnonymousClass005.A11(str, str3, str4, 0);
        return new PeerInviteJson(str, str2, str3, str4, j, j2, str5, l, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteJson) {
                PeerInviteJson peerInviteJson = (PeerInviteJson) obj;
                if (!C7384Etj.areEqual(this.invite_id_b64, peerInviteJson.invite_id_b64) || !C7384Etj.areEqual(this.create_request_id, peerInviteJson.create_request_id) || !C7384Etj.areEqual(this.label, peerInviteJson.label) || !C7384Etj.areEqual(this.offered_preset, peerInviteJson.offered_preset) || this.created_at_ms != peerInviteJson.created_at_ms || this.expires_at_ms != peerInviteJson.expires_at_ms || !C7384Etj.areEqual(this.claimed_by_muse, peerInviteJson.claimed_by_muse) || !C7384Etj.areEqual(this.revoked_at_ms, peerInviteJson.revoked_at_ms) || !C7384Etj.areEqual(this.delivery_id, peerInviteJson.delivery_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInviteJson copy$default(PeerInviteJson peerInviteJson, String str, String str2, String str3, String str4, long j, long j2, String str5, Long l, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteJson.invite_id_b64;
        }
        if ((i & 2) != 0) {
            str2 = peerInviteJson.create_request_id;
        }
        if ((i & 4) != 0) {
            str3 = peerInviteJson.label;
        }
        if ((i & 8) != 0) {
            str4 = peerInviteJson.offered_preset;
        }
        if ((i & 16) != 0) {
            j = peerInviteJson.created_at_ms;
        }
        if ((i & 32) != 0) {
            j2 = peerInviteJson.expires_at_ms;
        }
        if ((i & 64) != 0) {
            str5 = peerInviteJson.claimed_by_muse;
        }
        if ((i & 128) != 0) {
            l = peerInviteJson.revoked_at_ms;
        }
        if ((i & 256) != 0) {
            str6 = peerInviteJson.delivery_id;
        }
        return peerInviteJson.copy(str, str2, str3, str4, j, j2, str5, l, str6);
    }

    public final String component1() {
        return this.invite_id_b64;
    }

    public final String component2() {
        return this.create_request_id;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.offered_preset;
    }

    public final long component5() {
        return this.created_at_ms;
    }

    public final long component6() {
        return this.expires_at_ms;
    }

    public final String component7() {
        return this.claimed_by_muse;
    }

    public final Long component8() {
        return this.revoked_at_ms;
    }

    public final String component9() {
        return this.delivery_id;
    }

    public final String getClaimed_by_muse() {
        return this.claimed_by_muse;
    }

    public final String getCreate_request_id() {
        return this.create_request_id;
    }

    public final long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public final long getExpires_at_ms() {
        return this.expires_at_ms;
    }

    public final String getInvite_id_b64() {
        return this.invite_id_b64;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOffered_preset() {
        return this.offered_preset;
    }

    public final Long getRevoked_at_ms() {
        return this.revoked_at_ms;
    }

    public int hashCode() {
        return ((((AnonymousClass006.A06(this.expires_at_ms, AnonymousClass006.A06(this.created_at_ms, AnonymousClass005.A0I(this.offered_preset, AnonymousClass005.A0I(this.label, (AnonymousClass001.A0G(this.invite_id_b64) + AnonymousClass006.A0G(this.create_request_id)) * 31)))) + AnonymousClass006.A0G(this.claimed_by_muse)) * 31) + AnonymousClass006.A0D(this.revoked_at_ms)) * 31) + AnonymousClass005.A0H(this.delivery_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInviteJson(String str, String str2, String str3, String str4, long j, long j2, String str5, Long l, String str6, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, C3cH.A03(i & 16, j), (i & 32) == 0 ? j2 : 0L, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : str6);
    }

    public /* synthetic */ PeerInviteJson(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, Long l, String str6, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerInviteJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.invite_id_b64 = str;
        if ((i & 2) == 0) {
            this.create_request_id = null;
        } else {
            this.create_request_id = str2;
        }
        if ((i & 4) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i & 8) == 0) {
            this.offered_preset = "";
        } else {
            this.offered_preset = str4;
        }
        if ((i & 16) == 0) {
            this.created_at_ms = 0L;
        } else {
            this.created_at_ms = j;
        }
        if ((i & 32) == 0) {
            this.expires_at_ms = 0L;
        } else {
            this.expires_at_ms = j2;
        }
        if ((i & 64) == 0) {
            this.claimed_by_muse = null;
        } else {
            this.claimed_by_muse = str5;
        }
        if ((i & 128) == 0) {
            this.revoked_at_ms = null;
        } else {
            this.revoked_at_ms = l;
        }
        if ((i & 256) == 0) {
            this.delivery_id = null;
        } else {
            this.delivery_id = str6;
        }
    }
}

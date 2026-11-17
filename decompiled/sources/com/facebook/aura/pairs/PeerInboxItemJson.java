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
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInboxItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String delivery_id;
    public final long expires_at_ms;
    public final String invitation_url;
    public final String level;
    public final String muse_id;
    public final String person_name;
    public final String person_photo_sha256;
    public final long received_at_ms;

    public final class Companion {
        public final C9hr<PeerInboxItemJson> serializer() {
            return PeerInboxItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerInboxItemJson(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6) {
        AnonymousClass005.A11(str, str3, str4, 0);
        this.delivery_id = str;
        this.person_name = str2;
        this.level = str3;
        this.muse_id = str4;
        this.invitation_url = str5;
        this.received_at_ms = j;
        this.expires_at_ms = j2;
        this.person_photo_sha256 = str6;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInboxItemJson peerInboxItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerInboxItemJson.delivery_id)) {
            c9j5.AAV(peerInboxItemJson.delivery_id, c9iZ, 0);
        }
        if (zAfR || peerInboxItemJson.person_name != null) {
            c9j5.AAP(peerInboxItemJson.person_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(peerInboxItemJson.level)) {
            c9j5.AAV(peerInboxItemJson.level, c9iZ, 2);
        }
        if (zAfR || !"".equals(peerInboxItemJson.muse_id)) {
            c9j5.AAV(peerInboxItemJson.muse_id, c9iZ, 3);
        }
        if (zAfR || peerInboxItemJson.invitation_url != null) {
            c9j5.AAP(peerInboxItemJson.invitation_url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || peerInboxItemJson.received_at_ms != 0) {
            c9j5.AAN(c9iZ, 5, peerInboxItemJson.received_at_ms);
        }
        if (zAfR || peerInboxItemJson.expires_at_ms != 0) {
            c9j5.AAN(c9iZ, 6, peerInboxItemJson.expires_at_ms);
        }
        if (zAfR || peerInboxItemJson.person_photo_sha256 != null) {
            c9j5.AAP(peerInboxItemJson.person_photo_sha256, C07779iq.A01, c9iZ, 7);
        }
    }

    public final PeerInboxItemJson copy(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6) {
        AnonymousClass005.A11(str, str3, str4, 0);
        return new PeerInboxItemJson(str, str2, str3, str4, str5, j, j2, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInboxItemJson) {
                PeerInboxItemJson peerInboxItemJson = (PeerInboxItemJson) obj;
                if (!C7384Etj.areEqual(this.delivery_id, peerInboxItemJson.delivery_id) || !C7384Etj.areEqual(this.person_name, peerInboxItemJson.person_name) || !C7384Etj.areEqual(this.level, peerInboxItemJson.level) || !C7384Etj.areEqual(this.muse_id, peerInboxItemJson.muse_id) || !C7384Etj.areEqual(this.invitation_url, peerInboxItemJson.invitation_url) || this.received_at_ms != peerInboxItemJson.received_at_ms || this.expires_at_ms != peerInboxItemJson.expires_at_ms || !C7384Etj.areEqual(this.person_photo_sha256, peerInboxItemJson.person_photo_sha256)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInboxItemJson copy$default(PeerInboxItemJson peerInboxItemJson, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInboxItemJson.delivery_id;
        }
        if ((i & 2) != 0) {
            str2 = peerInboxItemJson.person_name;
        }
        if ((i & 4) != 0) {
            str3 = peerInboxItemJson.level;
        }
        if ((i & 8) != 0) {
            str4 = peerInboxItemJson.muse_id;
        }
        if ((i & 16) != 0) {
            str5 = peerInboxItemJson.invitation_url;
        }
        if ((i & 32) != 0) {
            j = peerInboxItemJson.received_at_ms;
        }
        if ((i & 64) != 0) {
            j2 = peerInboxItemJson.expires_at_ms;
        }
        if ((i & 128) != 0) {
            str6 = peerInboxItemJson.person_photo_sha256;
        }
        return peerInboxItemJson.copy(str, str2, str3, str4, str5, j, j2, str6);
    }

    public final String component1() {
        return this.delivery_id;
    }

    public final String component2() {
        return this.person_name;
    }

    public final String component3() {
        return this.level;
    }

    public final String component4() {
        return this.muse_id;
    }

    public final String component5() {
        return this.invitation_url;
    }

    public final long component6() {
        return this.received_at_ms;
    }

    public final long component7() {
        return this.expires_at_ms;
    }

    public final String component8() {
        return this.person_photo_sha256;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public final long getExpires_at_ms() {
        return this.expires_at_ms;
    }

    public final String getInvitation_url() {
        return this.invitation_url;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getPerson_name() {
        return this.person_name;
    }

    public final String getPerson_photo_sha256() {
        return this.person_photo_sha256;
    }

    public final long getReceived_at_ms() {
        return this.received_at_ms;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.expires_at_ms, AnonymousClass006.A06(this.received_at_ms, (AnonymousClass005.A0I(this.muse_id, AnonymousClass005.A0I(this.level, (AnonymousClass001.A0G(this.delivery_id) + AnonymousClass006.A0G(this.person_name)) * 31)) + AnonymousClass006.A0G(this.invitation_url)) * 31)) + AnonymousClass005.A0H(this.person_photo_sha256);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInboxItemJson(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5, C3cH.A03(i & 32, j), (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? null : str6);
    }

    public /* synthetic */ PeerInboxItemJson(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.delivery_id = "";
        } else {
            this.delivery_id = str;
        }
        if ((i & 2) == 0) {
            this.person_name = null;
        } else {
            this.person_name = str2;
        }
        if ((i & 4) == 0) {
            this.level = "";
        } else {
            this.level = str3;
        }
        if ((i & 8) == 0) {
            this.muse_id = "";
        } else {
            this.muse_id = str4;
        }
        if ((i & 16) == 0) {
            this.invitation_url = null;
        } else {
            this.invitation_url = str5;
        }
        if ((i & 32) == 0) {
            this.received_at_ms = 0L;
        } else {
            this.received_at_ms = j;
        }
        if ((i & 64) == 0) {
            this.expires_at_ms = 0L;
        } else {
            this.expires_at_ms = j2;
        }
        if ((i & 128) == 0) {
            this.person_photo_sha256 = null;
        } else {
            this.person_photo_sha256 = str6;
        }
    }

    public PeerInboxItemJson() {
        this("", null, "", "", null, 0L, 0L, null);
    }
}

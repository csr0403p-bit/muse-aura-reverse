package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
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
public final class PeerInviteCreateResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long expires_at_ms;
    public final String fragment;
    public final String invite_b64;
    public final String invite_id_b64;
    public final String owner_photo_jpeg_b64;

    public final class Companion {
        public final C9hr<PeerInviteCreateResponseJson> serializer() {
            return PeerInviteCreateResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteCreateResponseJson peerInviteCreateResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerInviteCreateResponseJson.invite_id_b64, c9iZ, 0);
        c9j5.AAV(peerInviteCreateResponseJson.fragment, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerInviteCreateResponseJson.invite_b64 != null) {
            c9j5.AAP(peerInviteCreateResponseJson.invite_b64, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || peerInviteCreateResponseJson.expires_at_ms != null) {
            c9j5.AAP(peerInviteCreateResponseJson.expires_at_ms, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || peerInviteCreateResponseJson.owner_photo_jpeg_b64 != null) {
            c9j5.AAP(peerInviteCreateResponseJson.owner_photo_jpeg_b64, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteCreateResponseJson) {
                PeerInviteCreateResponseJson peerInviteCreateResponseJson = (PeerInviteCreateResponseJson) obj;
                if (!C7384Etj.areEqual(this.invite_id_b64, peerInviteCreateResponseJson.invite_id_b64) || !C7384Etj.areEqual(this.fragment, peerInviteCreateResponseJson.fragment) || !C7384Etj.areEqual(this.invite_b64, peerInviteCreateResponseJson.invite_b64) || !C7384Etj.areEqual(this.expires_at_ms, peerInviteCreateResponseJson.expires_at_ms) || !C7384Etj.areEqual(this.owner_photo_jpeg_b64, peerInviteCreateResponseJson.owner_photo_jpeg_b64)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInviteCreateResponseJson copy$default(PeerInviteCreateResponseJson peerInviteCreateResponseJson, String str, String str2, String str3, Long l, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteCreateResponseJson.invite_id_b64;
        }
        if ((i & 2) != 0) {
            str2 = peerInviteCreateResponseJson.fragment;
        }
        if ((i & 4) != 0) {
            str3 = peerInviteCreateResponseJson.invite_b64;
        }
        if ((i & 8) != 0) {
            l = peerInviteCreateResponseJson.expires_at_ms;
        }
        if ((i & 16) != 0) {
            str4 = peerInviteCreateResponseJson.owner_photo_jpeg_b64;
        }
        return peerInviteCreateResponseJson.copy(str, str2, str3, l, str4);
    }

    public final String component1() {
        return this.invite_id_b64;
    }

    public final String component2() {
        return this.fragment;
    }

    public final String component3() {
        return this.invite_b64;
    }

    public final Long component4() {
        return this.expires_at_ms;
    }

    public final String component5() {
        return this.owner_photo_jpeg_b64;
    }

    public final Long getExpires_at_ms() {
        return this.expires_at_ms;
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getInvite_b64() {
        return this.invite_b64;
    }

    public final String getInvite_id_b64() {
        return this.invite_id_b64;
    }

    public final String getOwner_photo_jpeg_b64() {
        return this.owner_photo_jpeg_b64;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.fragment, AnonymousClass001.A0G(this.invite_id_b64)) + AnonymousClass006.A0G(this.invite_b64)) * 31) + AnonymousClass006.A0D(this.expires_at_ms)) * 31) + AnonymousClass005.A0H(this.owner_photo_jpeg_b64);
    }

    public PeerInviteCreateResponseJson(String str, String str2, String str3, Long l, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.invite_id_b64 = str;
        this.fragment = str2;
        this.invite_b64 = str3;
        this.expires_at_ms = l;
        this.owner_photo_jpeg_b64 = str4;
    }

    public final PeerInviteCreateResponseJson copy(String str, String str2, String str3, Long l, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new PeerInviteCreateResponseJson(str, str2, str3, l, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInviteCreateResponseJson(String str, String str2, String str3, Long l, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4);
    }

    public /* synthetic */ PeerInviteCreateResponseJson(int i, String str, String str2, String str3, Long l, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PeerInviteCreateResponseJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.invite_id_b64 = str;
        this.fragment = str2;
        if ((i & 4) == 0) {
            this.invite_b64 = null;
        } else {
            this.invite_b64 = str3;
        }
        if ((i & 8) == 0) {
            this.expires_at_ms = null;
        } else {
            this.expires_at_ms = l;
        }
        if ((i & 16) == 0) {
            this.owner_photo_jpeg_b64 = null;
        } else {
            this.owner_photo_jpeg_b64 = str4;
        }
    }
}

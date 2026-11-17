package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PeerInvitePhotoUploadResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String sha256;

    public final class Companion {
        public final C9hr<PeerInvitePhotoUploadResponseJson> serializer() {
            return PeerInvitePhotoUploadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInvitePhotoUploadResponseJson peerInvitePhotoUploadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || peerInvitePhotoUploadResponseJson.sha256 != null) {
            c9j5.AAP(peerInvitePhotoUploadResponseJson.sha256, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInvitePhotoUploadResponseJson) && C7384Etj.areEqual(this.sha256, ((PeerInvitePhotoUploadResponseJson) obj).sha256));
    }

    public static /* synthetic */ PeerInvitePhotoUploadResponseJson copy$default(PeerInvitePhotoUploadResponseJson peerInvitePhotoUploadResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInvitePhotoUploadResponseJson.sha256;
        }
        return new PeerInvitePhotoUploadResponseJson(str);
    }

    public final String component1() {
        return this.sha256;
    }

    public final PeerInvitePhotoUploadResponseJson copy(String str) {
        return new PeerInvitePhotoUploadResponseJson(str);
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.sha256);
    }

    public /* synthetic */ PeerInvitePhotoUploadResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.sha256 = null;
        } else {
            this.sha256 = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerInvitePhotoUploadResponseJson(String str) {
        this.sha256 = str;
    }

    public /* synthetic */ PeerInvitePhotoUploadResponseJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public PeerInvitePhotoUploadResponseJson() {
        this(null);
    }
}

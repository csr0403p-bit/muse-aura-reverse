package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
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
/* loaded from: classes2.dex */
public final class PeerInvitePhotoUploadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long expires_at;
    public final String jpeg_b64;

    public final class Companion {
        public final C9hr<PeerInvitePhotoUploadJson> serializer() {
            return PeerInvitePhotoUploadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerInvitePhotoUploadJson(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.jpeg_b64 = str;
        this.expires_at = j;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInvitePhotoUploadJson peerInvitePhotoUploadJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerInvitePhotoUploadJson.jpeg_b64, c9iZ, 0);
        c9j5.AAN(c9iZ, 1, peerInvitePhotoUploadJson.expires_at);
    }

    public final PeerInvitePhotoUploadJson copy(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return new PeerInvitePhotoUploadJson(str, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInvitePhotoUploadJson) {
                PeerInvitePhotoUploadJson peerInvitePhotoUploadJson = (PeerInvitePhotoUploadJson) obj;
                if (!C7384Etj.areEqual(this.jpeg_b64, peerInvitePhotoUploadJson.jpeg_b64) || this.expires_at != peerInvitePhotoUploadJson.expires_at) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInvitePhotoUploadJson copy$default(PeerInvitePhotoUploadJson peerInvitePhotoUploadJson, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInvitePhotoUploadJson.jpeg_b64;
        }
        if ((i & 2) != 0) {
            j = peerInvitePhotoUploadJson.expires_at;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerInvitePhotoUploadJson(str, j);
    }

    public final String component1() {
        return this.jpeg_b64;
    }

    public final long component2() {
        return this.expires_at;
    }

    public final long getExpires_at() {
        return this.expires_at;
    }

    public final String getJpeg_b64() {
        return this.jpeg_b64;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.expires_at, AnonymousClass001.A0G(this.jpeg_b64));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInvitePhotoUploadJson(int i, String str, long j, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PeerInvitePhotoUploadJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.jpeg_b64 = str;
        this.expires_at = j;
    }
}

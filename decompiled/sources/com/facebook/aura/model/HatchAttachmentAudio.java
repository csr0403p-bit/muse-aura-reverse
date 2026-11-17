package com.facebook.aura.model;

import X.AnonymousClass001;
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
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchAttachmentAudio extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String artist;
    public final String audioAssetId;
    public final String audioClusterId;
    public final String coverArtUrl;
    public final long startMs;
    public final String title;

    public final class Companion {
        public final C9hr<HatchAttachmentAudio> serializer() {
            return HatchAttachmentAudio$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAttachmentAudio(String str, String str2, String str3, String str4, String str5, long j) {
        C7384Etj.A0Y(str, 0);
        this.audioClusterId = str;
        this.audioAssetId = str2;
        this.title = str3;
        this.artist = str4;
        this.coverArtUrl = str5;
        this.startMs = j;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchAttachmentAudio hatchAttachmentAudio, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchAttachmentAudio.audioClusterId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchAttachmentAudio.audioAssetId != null) {
            c9j5.AAP(hatchAttachmentAudio.audioAssetId, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchAttachmentAudio.title != null) {
            c9j5.AAP(hatchAttachmentAudio.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchAttachmentAudio.artist != null) {
            c9j5.AAP(hatchAttachmentAudio.artist, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchAttachmentAudio.coverArtUrl != null) {
            c9j5.AAP(hatchAttachmentAudio.coverArtUrl, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hatchAttachmentAudio.startMs != 0) {
            c9j5.AAN(c9iZ, 5, hatchAttachmentAudio.startMs);
        }
    }

    public final HatchAttachmentAudio copy(String str, String str2, String str3, String str4, String str5, long j) {
        C7384Etj.A0Y(str, 0);
        return new HatchAttachmentAudio(str, str2, str3, str4, str5, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAttachmentAudio) {
                HatchAttachmentAudio hatchAttachmentAudio = (HatchAttachmentAudio) obj;
                if (!C7384Etj.areEqual(this.audioClusterId, hatchAttachmentAudio.audioClusterId) || !C7384Etj.areEqual(this.audioAssetId, hatchAttachmentAudio.audioAssetId) || !C7384Etj.areEqual(this.title, hatchAttachmentAudio.title) || !C7384Etj.areEqual(this.artist, hatchAttachmentAudio.artist) || !C7384Etj.areEqual(this.coverArtUrl, hatchAttachmentAudio.coverArtUrl) || this.startMs != hatchAttachmentAudio.startMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAttachmentAudio copy$default(HatchAttachmentAudio hatchAttachmentAudio, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAttachmentAudio.audioClusterId;
        }
        if ((i & 2) != 0) {
            str2 = hatchAttachmentAudio.audioAssetId;
        }
        if ((i & 4) != 0) {
            str3 = hatchAttachmentAudio.title;
        }
        if ((i & 8) != 0) {
            str4 = hatchAttachmentAudio.artist;
        }
        if ((i & 16) != 0) {
            str5 = hatchAttachmentAudio.coverArtUrl;
        }
        if ((i & 32) != 0) {
            j = hatchAttachmentAudio.startMs;
        }
        return hatchAttachmentAudio.copy(str, str2, str3, str4, str5, j);
    }

    public final String component1() {
        return this.audioClusterId;
    }

    public final String component2() {
        return this.audioAssetId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.artist;
    }

    public final String component5() {
        return this.coverArtUrl;
    }

    public final long component6() {
        return this.startMs;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getAudioAssetId() {
        return this.audioAssetId;
    }

    public final String getAudioClusterId() {
        return this.audioClusterId;
    }

    public final String getCoverArtUrl() {
        return this.coverArtUrl;
    }

    public final long getStartMs() {
        return this.startMs;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.startMs, (((((((AnonymousClass001.A0G(this.audioClusterId) + AnonymousClass006.A0G(this.audioAssetId)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.artist)) * 31) + AnonymousClass005.A0H(this.coverArtUrl)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAttachmentAudio(String str, String str2, String str3, String str4, String str5, long j, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? 0L : j);
    }

    public /* synthetic */ HatchAttachmentAudio(int i, String str, String str2, String str3, String str4, String str5, long j, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchAttachmentAudio$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.audioClusterId = str;
        if ((i & 2) == 0) {
            this.audioAssetId = null;
        } else {
            this.audioAssetId = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.artist = null;
        } else {
            this.artist = str4;
        }
        if ((i & 16) == 0) {
            this.coverArtUrl = null;
        } else {
            this.coverArtUrl = str5;
        }
        if ((i & 32) == 0) {
            this.startMs = 0L;
        } else {
            this.startMs = j;
        }
    }
}

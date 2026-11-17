package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class PrewarmedHatchIdleVideo extends C06G {
    public final String avatarStillPath;
    public final String referenceAssetId;
    public final String uri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PrewarmedHatchIdleVideo) {
                PrewarmedHatchIdleVideo prewarmedHatchIdleVideo = (PrewarmedHatchIdleVideo) obj;
                if (!C7384Etj.areEqual(this.avatarStillPath, prewarmedHatchIdleVideo.avatarStillPath) || !C7384Etj.areEqual(this.referenceAssetId, prewarmedHatchIdleVideo.referenceAssetId) || !C7384Etj.areEqual(this.uri, prewarmedHatchIdleVideo.uri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PrewarmedHatchIdleVideo copy$default(PrewarmedHatchIdleVideo prewarmedHatchIdleVideo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prewarmedHatchIdleVideo.avatarStillPath;
        }
        if ((i & 2) != 0) {
            str2 = prewarmedHatchIdleVideo.referenceAssetId;
        }
        if ((i & 4) != 0) {
            str3 = prewarmedHatchIdleVideo.uri;
        }
        return prewarmedHatchIdleVideo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.avatarStillPath;
    }

    public final String component2() {
        return this.referenceAssetId;
    }

    public final String component3() {
        return this.uri;
    }

    public final String getAvatarStillPath() {
        return this.avatarStillPath;
    }

    public final String getReferenceAssetId() {
        return this.referenceAssetId;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.uri, AnonymousClass005.A0I(this.referenceAssetId, AnonymousClass001.A0G(this.avatarStillPath)));
    }

    public PrewarmedHatchIdleVideo(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.avatarStillPath = str;
        this.referenceAssetId = str2;
        this.uri = str3;
    }

    public final PrewarmedHatchIdleVideo copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PrewarmedHatchIdleVideo(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}

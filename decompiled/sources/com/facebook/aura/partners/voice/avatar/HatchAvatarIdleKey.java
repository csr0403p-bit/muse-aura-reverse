package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAvatarIdleKey extends C06G {
    public final String referenceAssetId;
    public final String videoUri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAvatarIdleKey) {
                HatchAvatarIdleKey hatchAvatarIdleKey = (HatchAvatarIdleKey) obj;
                if (!C7384Etj.areEqual(this.referenceAssetId, hatchAvatarIdleKey.referenceAssetId) || !C7384Etj.areEqual(this.videoUri, hatchAvatarIdleKey.videoUri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAvatarIdleKey copy$default(HatchAvatarIdleKey hatchAvatarIdleKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAvatarIdleKey.referenceAssetId;
        }
        if ((i & 2) != 0) {
            str2 = hatchAvatarIdleKey.videoUri;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchAvatarIdleKey(str, str2);
    }

    public final String component1() {
        return this.referenceAssetId;
    }

    public final String component2() {
        return this.videoUri;
    }

    public final String getReferenceAssetId() {
        return this.referenceAssetId;
    }

    public final String getVideoUri() {
        return this.videoUri;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.videoUri, AnonymousClass001.A0G(this.referenceAssetId));
    }

    public HatchAvatarIdleKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.referenceAssetId = str;
        this.videoUri = str2;
    }

    public final HatchAvatarIdleKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchAvatarIdleKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}

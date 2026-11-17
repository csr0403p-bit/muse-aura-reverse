package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAvatarReference extends C06G {
    public final String assetId;
    public final Float cropSize;
    public final Float cropX;
    public final Float cropY;
    public final boolean embodimentCompatible;
    public final String idleVideoUri;
    public final String imageUri;
    public final String sourceSha1;

    public final HatchAvatarReference copy(String str, Float f, Float f2, Float f3, String str2, String str3, String str4, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new HatchAvatarReference(str, f, f2, f3, str2, str3, str4, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAvatarReference) {
                HatchAvatarReference hatchAvatarReference = (HatchAvatarReference) obj;
                if (!C7384Etj.areEqual(this.assetId, hatchAvatarReference.assetId) || !C7384Etj.areEqual(this.cropX, hatchAvatarReference.cropX) || !C7384Etj.areEqual(this.cropY, hatchAvatarReference.cropY) || !C7384Etj.areEqual(this.cropSize, hatchAvatarReference.cropSize) || !C7384Etj.areEqual(this.sourceSha1, hatchAvatarReference.sourceSha1) || !C7384Etj.areEqual(this.imageUri, hatchAvatarReference.imageUri) || !C7384Etj.areEqual(this.idleVideoUri, hatchAvatarReference.idleVideoUri) || this.embodimentCompatible != hatchAvatarReference.embodimentCompatible) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchAvatarReference(String str, Float f, Float f2, Float f3, String str2, String str3, String str4, boolean z, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : f3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? true : z);
    }

    public static /* synthetic */ HatchAvatarReference copy$default(HatchAvatarReference hatchAvatarReference, String str, Float f, Float f2, Float f3, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAvatarReference.assetId;
        }
        if ((i & 2) != 0) {
            f = hatchAvatarReference.cropX;
        }
        if ((i & 4) != 0) {
            f2 = hatchAvatarReference.cropY;
        }
        if ((i & 8) != 0) {
            f3 = hatchAvatarReference.cropSize;
        }
        if ((i & 16) != 0) {
            str2 = hatchAvatarReference.sourceSha1;
        }
        if ((i & 32) != 0) {
            str3 = hatchAvatarReference.imageUri;
        }
        if ((i & 64) != 0) {
            str4 = hatchAvatarReference.idleVideoUri;
        }
        if ((i & 128) != 0) {
            z = hatchAvatarReference.embodimentCompatible;
        }
        return hatchAvatarReference.copy(str, f, f2, f3, str2, str3, str4, z);
    }

    public final String component1() {
        return this.assetId;
    }

    public final Float component2() {
        return this.cropX;
    }

    public final Float component3() {
        return this.cropY;
    }

    public final Float component4() {
        return this.cropSize;
    }

    public final String component5() {
        return this.sourceSha1;
    }

    public final String component6() {
        return this.imageUri;
    }

    public final String component7() {
        return this.idleVideoUri;
    }

    public final boolean component8() {
        return this.embodimentCompatible;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final Float getCropSize() {
        return this.cropSize;
    }

    public final Float getCropX() {
        return this.cropX;
    }

    public final Float getCropY() {
        return this.cropY;
    }

    public final boolean getEmbodimentCompatible() {
        return this.embodimentCompatible;
    }

    public final String getIdleVideoUri() {
        return this.idleVideoUri;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final String getSourceSha1() {
        return this.sourceSha1;
    }

    public int hashCode() {
        return C0KA.A00((((((((((((AnonymousClass001.A0G(this.assetId) + AnonymousClass006.A0D(this.cropX)) * 31) + AnonymousClass006.A0D(this.cropY)) * 31) + AnonymousClass006.A0D(this.cropSize)) * 31) + AnonymousClass006.A0G(this.sourceSha1)) * 31) + AnonymousClass006.A0G(this.imageUri)) * 31) + AnonymousClass005.A0H(this.idleVideoUri)) * 31, this.embodimentCompatible);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAvatarReference(String str, Float f, Float f2, Float f3, String str2, String str3, String str4, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.assetId = str;
        this.cropX = f;
        this.cropY = f2;
        this.cropSize = f3;
        this.sourceSha1 = str2;
        this.imageUri = str3;
        this.idleVideoUri = str4;
        this.embodimentCompatible = z;
    }
}

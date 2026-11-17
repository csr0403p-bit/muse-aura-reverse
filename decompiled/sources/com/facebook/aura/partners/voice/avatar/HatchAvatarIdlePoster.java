package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAvatarIdlePoster extends C06G {
    public final int height;
    public final String imageUri;
    public final int width;

    public HatchAvatarIdlePoster(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.imageUri = str;
        this.width = i;
        this.height = i2;
    }

    public final HatchAvatarIdlePoster copy(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        return new HatchAvatarIdlePoster(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAvatarIdlePoster) {
                HatchAvatarIdlePoster hatchAvatarIdlePoster = (HatchAvatarIdlePoster) obj;
                if (!C7384Etj.areEqual(this.imageUri, hatchAvatarIdlePoster.imageUri) || this.width != hatchAvatarIdlePoster.width || this.height != hatchAvatarIdlePoster.height) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAvatarIdlePoster copy$default(HatchAvatarIdlePoster hatchAvatarIdlePoster, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hatchAvatarIdlePoster.imageUri;
        }
        if ((i3 & 2) != 0) {
            i = hatchAvatarIdlePoster.width;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchAvatarIdlePoster.height;
        }
        return hatchAvatarIdlePoster.copy(str, i, i2);
    }

    public final String component1() {
        return this.imageUri;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.imageUri) + this.width) * 31) + this.height;
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AvatarCallIdleVideo extends C06G {
    public static final int $stable = 0;
    public final Float cropSize;
    public final Float cropX;
    public final Float cropY;
    public final boolean dark;
    public final String path;
    public final String url;

    public static /* synthetic */ AvatarCallIdleVideo copy$default(AvatarCallIdleVideo avatarCallIdleVideo, String str, String str2, Float f, Float f2, Float f3, boolean z, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        Float f4 = f;
        Float f5 = f2;
        Float f6 = f3;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str3 = avatarCallIdleVideo.path;
        }
        if ((i & 2) != 0) {
            str4 = avatarCallIdleVideo.url;
        }
        if ((i & 4) != 0) {
            f4 = avatarCallIdleVideo.cropX;
        }
        if ((i & 8) != 0) {
            f5 = avatarCallIdleVideo.cropY;
        }
        if ((i & 16) != 0) {
            f6 = avatarCallIdleVideo.cropSize;
        }
        if ((i & 32) != 0) {
            z2 = avatarCallIdleVideo.dark;
        }
        AnonymousClass003.A0u(str3, str4);
        return new AvatarCallIdleVideo(str3, str4, f4, f5, f6, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarCallIdleVideo) {
                AvatarCallIdleVideo avatarCallIdleVideo = (AvatarCallIdleVideo) obj;
                if (!C7384Etj.areEqual(this.path, avatarCallIdleVideo.path) || !C7384Etj.areEqual(this.url, avatarCallIdleVideo.url) || !C7384Etj.areEqual(this.cropX, avatarCallIdleVideo.cropX) || !C7384Etj.areEqual(this.cropY, avatarCallIdleVideo.cropY) || !C7384Etj.areEqual(this.cropSize, avatarCallIdleVideo.cropSize) || this.dark != avatarCallIdleVideo.dark) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.url;
    }

    public final Float component3() {
        return this.cropX;
    }

    public final Float component4() {
        return this.cropY;
    }

    public final Float component5() {
        return this.cropSize;
    }

    public final boolean component6() {
        return this.dark;
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

    public final boolean getDark() {
        return this.dark;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return C0KA.A00((((((AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.path)) + AnonymousClass006.A0D(this.cropX)) * 31) + AnonymousClass006.A0D(this.cropY)) * 31) + C3cH.A02(this.cropSize)) * 31, this.dark);
    }

    public AvatarCallIdleVideo(String str, String str2, Float f, Float f2, Float f3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.path = str;
        this.url = str2;
        this.cropX = f;
        this.cropY = f2;
        this.cropSize = f3;
        this.dark = z;
    }

    public final AvatarCallIdleVideo copy(String str, String str2, Float f, Float f2, Float f3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new AvatarCallIdleVideo(str, str2, f, f2, f3, z);
    }

    public String toString() {
        return super.toString();
    }
}

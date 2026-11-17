package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchInviteGiftVideo extends C06G {
    public final float aspectRatio;
    public final String darkUrl;
    public final String lightUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchInviteGiftVideo) {
                HatchInviteGiftVideo hatchInviteGiftVideo = (HatchInviteGiftVideo) obj;
                if (!C7384Etj.areEqual(this.lightUrl, hatchInviteGiftVideo.lightUrl) || !C7384Etj.areEqual(this.darkUrl, hatchInviteGiftVideo.darkUrl) || Float.compare(this.aspectRatio, hatchInviteGiftVideo.aspectRatio) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchInviteGiftVideo copy$default(HatchInviteGiftVideo hatchInviteGiftVideo, String str, String str2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchInviteGiftVideo.lightUrl;
        }
        if ((i & 2) != 0) {
            str2 = hatchInviteGiftVideo.darkUrl;
        }
        if ((i & 4) != 0) {
            f = hatchInviteGiftVideo.aspectRatio;
        }
        return hatchInviteGiftVideo.copy(str, str2, f);
    }

    public final String component1() {
        return this.lightUrl;
    }

    public final String component2() {
        return this.darkUrl;
    }

    public final float component3() {
        return this.aspectRatio;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getDarkUrl() {
        return this.darkUrl;
    }

    public final String getLightUrl() {
        return this.lightUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.darkUrl, AnonymousClass001.A0G(this.lightUrl)) + Float.floatToIntBits(this.aspectRatio);
    }

    public HatchInviteGiftVideo(String str, String str2, float f) {
        AnonymousClass003.A0u(str, str2);
        this.lightUrl = str;
        this.darkUrl = str2;
        this.aspectRatio = f;
    }

    public final HatchInviteGiftVideo copy(String str, String str2, float f) {
        AnonymousClass003.A0u(str, str2);
        return new HatchInviteGiftVideo(str, str2, f);
    }

    public String toString() {
        return super.toString();
    }
}

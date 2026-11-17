package com.facebook.aura.sharesheet;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchShareRecipient extends C06G {
    public static final int $stable = 0;
    public final HatchShareAppTarget appTarget;
    public final String label;
    public final String name;
    public final AHD<String> profilePictureUrls;
    public final String recipientId;
    public final int recipientType;
    public final String senderAccountId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchShareRecipient) {
                HatchShareRecipient hatchShareRecipient = (HatchShareRecipient) obj;
                if (!C7384Etj.areEqual(this.name, hatchShareRecipient.name) || !C7384Etj.areEqual(this.label, hatchShareRecipient.label) || !C7384Etj.areEqual(this.profilePictureUrls, hatchShareRecipient.profilePictureUrls) || this.appTarget != hatchShareRecipient.appTarget || this.recipientType != hatchShareRecipient.recipientType || !C7384Etj.areEqual(this.recipientId, hatchShareRecipient.recipientId) || !C7384Etj.areEqual(this.senderAccountId, hatchShareRecipient.senderAccountId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchShareRecipient copy$default(HatchShareRecipient hatchShareRecipient, String str, String str2, AHD ahd, HatchShareAppTarget hatchShareAppTarget, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hatchShareRecipient.name;
        }
        if ((i2 & 2) != 0) {
            str2 = hatchShareRecipient.label;
        }
        if ((i2 & 4) != 0) {
            ahd = hatchShareRecipient.profilePictureUrls;
        }
        if ((i2 & 8) != 0) {
            hatchShareAppTarget = hatchShareRecipient.appTarget;
        }
        if ((i2 & 16) != 0) {
            i = hatchShareRecipient.recipientType;
        }
        if ((i2 & 32) != 0) {
            str3 = hatchShareRecipient.recipientId;
        }
        if ((i2 & 64) != 0) {
            str4 = hatchShareRecipient.senderAccountId;
        }
        return hatchShareRecipient.copy(str, str2, ahd, hatchShareAppTarget, i, str3, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.label;
    }

    public final AHD<String> component3() {
        return this.profilePictureUrls;
    }

    public final HatchShareAppTarget component4() {
        return this.appTarget;
    }

    public final int component5() {
        return this.recipientType;
    }

    public final String component6() {
        return this.recipientId;
    }

    public final String component7() {
        return this.senderAccountId;
    }

    public final HatchShareAppTarget getAppTarget() {
        return this.appTarget;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final AHD<String> getProfilePictureUrls() {
        return this.profilePictureUrls;
    }

    public final String getRecipientId() {
        return this.recipientId;
    }

    public final int getRecipientType() {
        return this.recipientType;
    }

    public final String getSenderAccountId() {
        return this.senderAccountId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.senderAccountId, AnonymousClass005.A0I(this.recipientId, (((AnonymousClass005.A0F(this.profilePictureUrls, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.name))) + AnonymousClass006.A0D(this.appTarget)) * 31) + this.recipientType) * 31));
    }

    public HatchShareRecipient(String str, String str2, AHD<String> ahd, HatchShareAppTarget hatchShareAppTarget, int i, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, ahd);
        AnonymousClass003.A0z(str3, str4);
        this.name = str;
        this.label = str2;
        this.profilePictureUrls = ahd;
        this.appTarget = hatchShareAppTarget;
        this.recipientType = i;
        this.recipientId = str3;
        this.senderAccountId = str4;
    }

    public final HatchShareRecipient copy(String str, String str2, AHD<String> ahd, HatchShareAppTarget hatchShareAppTarget, int i, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, ahd);
        AnonymousClass003.A0z(str3, str4);
        return new HatchShareRecipient(str, str2, ahd, hatchShareAppTarget, i, str3, str4);
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchRedeemInviteCodeCopy extends C06G {
    public final String disclaimer;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchRedeemInviteCodeCopy) {
                HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy = (HatchRedeemInviteCodeCopy) obj;
                if (!C7384Etj.areEqual(this.title, hatchRedeemInviteCodeCopy.title) || !C7384Etj.areEqual(this.subtitle, hatchRedeemInviteCodeCopy.subtitle) || !C7384Etj.areEqual(this.disclaimer, hatchRedeemInviteCodeCopy.disclaimer)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchRedeemInviteCodeCopy copy$default(HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchRedeemInviteCodeCopy.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchRedeemInviteCodeCopy.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = hatchRedeemInviteCodeCopy.disclaimer;
        }
        return hatchRedeemInviteCodeCopy.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.disclaimer;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.disclaimer, AnonymousClass005.A0I(this.subtitle, AnonymousClass006.A0G(this.title) * 31));
    }

    public HatchRedeemInviteCodeCopy(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        this.title = str;
        this.subtitle = str2;
        this.disclaimer = str3;
    }

    public final HatchRedeemInviteCodeCopy copy(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        return new HatchRedeemInviteCodeCopy(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}

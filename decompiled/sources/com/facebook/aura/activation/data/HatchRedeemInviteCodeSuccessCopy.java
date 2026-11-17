package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchRedeemInviteCodeSuccessCopy extends C06G {
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchRedeemInviteCodeSuccessCopy) {
                HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy = (HatchRedeemInviteCodeSuccessCopy) obj;
                if (!C7384Etj.areEqual(this.title, hatchRedeemInviteCodeSuccessCopy.title) || !C7384Etj.areEqual(this.subtitle, hatchRedeemInviteCodeSuccessCopy.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchRedeemInviteCodeSuccessCopy copy$default(HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchRedeemInviteCodeSuccessCopy.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchRedeemInviteCodeSuccessCopy.subtitle;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchRedeemInviteCodeSuccessCopy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.subtitle, AnonymousClass001.A0G(this.title));
    }

    public HatchRedeemInviteCodeSuccessCopy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.subtitle = str2;
    }

    public final HatchRedeemInviteCodeSuccessCopy copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchRedeemInviteCodeSuccessCopy(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}

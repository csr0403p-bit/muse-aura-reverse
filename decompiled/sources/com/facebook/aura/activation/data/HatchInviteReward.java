package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchInviteReward extends C06G {
    public final String body;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchInviteReward) {
                HatchInviteReward hatchInviteReward = (HatchInviteReward) obj;
                if (!C7384Etj.areEqual(this.title, hatchInviteReward.title) || !C7384Etj.areEqual(this.body, hatchInviteReward.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchInviteReward copy$default(HatchInviteReward hatchInviteReward, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchInviteReward.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchInviteReward.body;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchInviteReward(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.body, AnonymousClass001.A0G(this.title));
    }

    public HatchInviteReward(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.body = str2;
    }

    public final HatchInviteReward copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchInviteReward(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}

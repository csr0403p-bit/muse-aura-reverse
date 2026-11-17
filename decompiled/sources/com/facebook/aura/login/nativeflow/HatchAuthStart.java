package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAuthStart extends C06G {
    public final String accessToken;
    public final String idForAymh;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAuthStart) {
                HatchAuthStart hatchAuthStart = (HatchAuthStart) obj;
                if (!C7384Etj.areEqual(this.accessToken, hatchAuthStart.accessToken) || !C7384Etj.areEqual(this.idForAymh, hatchAuthStart.idForAymh)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAuthStart copy$default(HatchAuthStart hatchAuthStart, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAuthStart.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = hatchAuthStart.idForAymh;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchAuthStart(str, str2);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.idForAymh;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getIdForAymh() {
        return this.idForAymh;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.idForAymh, AnonymousClass001.A0G(this.accessToken));
    }

    public HatchAuthStart(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.accessToken = str;
        this.idForAymh = str2;
    }

    public final HatchAuthStart copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchAuthStart(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}

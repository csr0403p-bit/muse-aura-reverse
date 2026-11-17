package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchDblProvision extends C06G {
    public final String nonce;
    public final String savedAccountId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDblProvision) {
                HatchDblProvision hatchDblProvision = (HatchDblProvision) obj;
                if (!C7384Etj.areEqual(this.nonce, hatchDblProvision.nonce) || !C7384Etj.areEqual(this.savedAccountId, hatchDblProvision.savedAccountId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDblProvision copy$default(HatchDblProvision hatchDblProvision, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchDblProvision.nonce;
        }
        if ((i & 2) != 0) {
            str2 = hatchDblProvision.savedAccountId;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchDblProvision(str, str2);
    }

    public final String component1() {
        return this.nonce;
    }

    public final String component2() {
        return this.savedAccountId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getSavedAccountId() {
        return this.savedAccountId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.savedAccountId, AnonymousClass001.A0G(this.nonce));
    }

    public HatchDblProvision(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.nonce = str;
        this.savedAccountId = str2;
    }

    public final HatchDblProvision copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchDblProvision(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}

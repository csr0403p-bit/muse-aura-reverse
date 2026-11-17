package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchAccountSelectionAccount extends C06G {
    public final List<HatchAccountSelectionProfile> profiles;
    public final String ref;
    public final HatchAccountStatus status;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAccountSelectionAccount) {
                HatchAccountSelectionAccount hatchAccountSelectionAccount = (HatchAccountSelectionAccount) obj;
                if (!C7384Etj.areEqual(this.ref, hatchAccountSelectionAccount.ref) || !C7384Etj.areEqual(this.profiles, hatchAccountSelectionAccount.profiles) || this.status != hatchAccountSelectionAccount.status) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchAccountSelectionAccount copy$default(HatchAccountSelectionAccount hatchAccountSelectionAccount, String str, List list, HatchAccountStatus hatchAccountStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAccountSelectionAccount.ref;
        }
        if ((i & 2) != 0) {
            list = hatchAccountSelectionAccount.profiles;
        }
        if ((i & 4) != 0) {
            hatchAccountStatus = hatchAccountSelectionAccount.status;
        }
        return hatchAccountSelectionAccount.copy(str, list, hatchAccountStatus);
    }

    public final String component1() {
        return this.ref;
    }

    public final List<HatchAccountSelectionProfile> component2() {
        return this.profiles;
    }

    public final HatchAccountStatus component3() {
        return this.status;
    }

    public final List<HatchAccountSelectionProfile> getProfiles() {
        return this.profiles;
    }

    public final String getRef() {
        return this.ref;
    }

    public final HatchAccountStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.status, AnonymousClass005.A0F(this.profiles, AnonymousClass001.A0G(this.ref)));
    }

    public HatchAccountSelectionAccount(String str, List<HatchAccountSelectionProfile> list, HatchAccountStatus hatchAccountStatus) {
        AnonymousClass005.A0x(str, list, hatchAccountStatus);
        this.ref = str;
        this.profiles = list;
        this.status = hatchAccountStatus;
    }

    public final HatchAccountSelectionAccount copy(String str, List<HatchAccountSelectionProfile> list, HatchAccountStatus hatchAccountStatus) {
        AnonymousClass005.A0x(str, list, hatchAccountStatus);
        return new HatchAccountSelectionAccount(str, list, hatchAccountStatus);
    }

    public String toString() {
        return super.toString();
    }
}

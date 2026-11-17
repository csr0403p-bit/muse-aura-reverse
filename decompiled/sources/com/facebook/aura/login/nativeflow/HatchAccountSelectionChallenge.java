package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchAccountSelectionChallenge extends C06G {
    public final List<HatchAccountSelectionAccount> accounts;
    public final boolean museLinkTransparency;
    public final boolean showMuseTransparency;
    public final String state;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAccountSelectionChallenge) {
                HatchAccountSelectionChallenge hatchAccountSelectionChallenge = (HatchAccountSelectionChallenge) obj;
                if (!C7384Etj.areEqual(this.state, hatchAccountSelectionChallenge.state) || !C7384Etj.areEqual(this.accounts, hatchAccountSelectionChallenge.accounts) || this.museLinkTransparency != hatchAccountSelectionChallenge.museLinkTransparency || this.showMuseTransparency != hatchAccountSelectionChallenge.showMuseTransparency) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAccountSelectionChallenge copy$default(HatchAccountSelectionChallenge hatchAccountSelectionChallenge, String str, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAccountSelectionChallenge.state;
        }
        if ((i & 2) != 0) {
            list = hatchAccountSelectionChallenge.accounts;
        }
        if ((i & 4) != 0) {
            z = hatchAccountSelectionChallenge.museLinkTransparency;
        }
        if ((i & 8) != 0) {
            z2 = hatchAccountSelectionChallenge.showMuseTransparency;
        }
        AnonymousClass003.A0u(str, list);
        return new HatchAccountSelectionChallenge(str, list, z, z2);
    }

    public final String component1() {
        return this.state;
    }

    public final List<HatchAccountSelectionAccount> component2() {
        return this.accounts;
    }

    public final boolean component3() {
        return this.museLinkTransparency;
    }

    public final boolean component4() {
        return this.showMuseTransparency;
    }

    public final List<HatchAccountSelectionAccount> getAccounts() {
        return this.accounts;
    }

    public final boolean getMuseLinkTransparency() {
        return this.museLinkTransparency;
    }

    public final boolean getShowMuseTransparency() {
        return this.showMuseTransparency;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.accounts, AnonymousClass001.A0G(this.state)), this.museLinkTransparency), this.showMuseTransparency);
    }

    public HatchAccountSelectionChallenge(String str, List<HatchAccountSelectionAccount> list, boolean z, boolean z2) {
        AnonymousClass003.A0u(str, list);
        this.state = str;
        this.accounts = list;
        this.museLinkTransparency = z;
        this.showMuseTransparency = z2;
    }

    public final HatchAccountSelectionChallenge copy(String str, List<HatchAccountSelectionAccount> list, boolean z, boolean z2) {
        AnonymousClass003.A0u(str, list);
        return new HatchAccountSelectionChallenge(str, list, z, z2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAccountSelectionChallenge(String str, List list, boolean z, boolean z2, int i, C06H c06h) {
        this(str, list, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2));
    }
}

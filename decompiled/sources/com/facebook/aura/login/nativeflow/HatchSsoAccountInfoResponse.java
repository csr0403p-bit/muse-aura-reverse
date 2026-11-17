package com.facebook.aura.login.nativeflow;

import X.A3q;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class HatchSsoAccountInfoResponse extends C06G {
    public final HatchLandingPresentation landingPresentation;
    public final List<HatchSsoMetaAccount> metaAccounts;
    public final Set<String> supersededSavedAccountIds;
    public final boolean suppressesTosClause;
    public final HatchTosDisclosure tos;
    public final String zariCandidateRef;

    public final HatchSsoAccountInfoResponse copy(List<HatchSsoMetaAccount> list, HatchTosDisclosure hatchTosDisclosure, String str, Set<String> set, boolean z, HatchLandingPresentation hatchLandingPresentation) {
        AnonymousClass002.A1D(set, 3, hatchLandingPresentation);
        return new HatchSsoAccountInfoResponse(list, hatchTosDisclosure, str, set, z, hatchLandingPresentation);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSsoAccountInfoResponse) {
                HatchSsoAccountInfoResponse hatchSsoAccountInfoResponse = (HatchSsoAccountInfoResponse) obj;
                if (!C7384Etj.areEqual(this.metaAccounts, hatchSsoAccountInfoResponse.metaAccounts) || !C7384Etj.areEqual(this.tos, hatchSsoAccountInfoResponse.tos) || !C7384Etj.areEqual(this.zariCandidateRef, hatchSsoAccountInfoResponse.zariCandidateRef) || !C7384Etj.areEqual(this.supersededSavedAccountIds, hatchSsoAccountInfoResponse.supersededSavedAccountIds) || this.suppressesTosClause != hatchSsoAccountInfoResponse.suppressesTosClause || this.landingPresentation != hatchSsoAccountInfoResponse.landingPresentation) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchSsoAccountInfoResponse(List list, HatchTosDisclosure hatchTosDisclosure, String str, Set set, boolean z, HatchLandingPresentation hatchLandingPresentation, int i, C06H c06h) {
        this(list, hatchTosDisclosure, str, (i & 8) != 0 ? A3q.A00 : set, C3cI.A1S(i, z), (i & 32) != 0 ? HatchLandingPresentation.STANDARD : hatchLandingPresentation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchSsoAccountInfoResponse copy$default(HatchSsoAccountInfoResponse hatchSsoAccountInfoResponse, List list, HatchTosDisclosure hatchTosDisclosure, String str, Set set, boolean z, HatchLandingPresentation hatchLandingPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchSsoAccountInfoResponse.metaAccounts;
        }
        if ((i & 2) != 0) {
            hatchTosDisclosure = hatchSsoAccountInfoResponse.tos;
        }
        if ((i & 4) != 0) {
            str = hatchSsoAccountInfoResponse.zariCandidateRef;
        }
        if ((i & 8) != 0) {
            set = hatchSsoAccountInfoResponse.supersededSavedAccountIds;
        }
        if ((i & 16) != 0) {
            z = hatchSsoAccountInfoResponse.suppressesTosClause;
        }
        if ((i & 32) != 0) {
            hatchLandingPresentation = hatchSsoAccountInfoResponse.landingPresentation;
        }
        return hatchSsoAccountInfoResponse.copy(list, hatchTosDisclosure, str, set, z, hatchLandingPresentation);
    }

    public final List<HatchSsoMetaAccount> component1() {
        return this.metaAccounts;
    }

    public final HatchTosDisclosure component2() {
        return this.tos;
    }

    public final String component3() {
        return this.zariCandidateRef;
    }

    public final Set<String> component4() {
        return this.supersededSavedAccountIds;
    }

    public final boolean component5() {
        return this.suppressesTosClause;
    }

    public final HatchLandingPresentation component6() {
        return this.landingPresentation;
    }

    public final HatchLandingPresentation getLandingPresentation() {
        return this.landingPresentation;
    }

    public final List<HatchSsoMetaAccount> getMetaAccounts() {
        return this.metaAccounts;
    }

    public final Set<String> getSupersededSavedAccountIds() {
        return this.supersededSavedAccountIds;
    }

    public final boolean getSuppressesTosClause() {
        return this.suppressesTosClause;
    }

    public final HatchTosDisclosure getTos() {
        return this.tos;
    }

    public final String getZariCandidateRef() {
        return this.zariCandidateRef;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.landingPresentation, C0KA.A01(AnonymousClass005.A0F(this.supersededSavedAccountIds, ((((AnonymousClass006.A0D(this.metaAccounts) * 31) + AnonymousClass006.A0D(this.tos)) * 31) + AnonymousClass005.A0H(this.zariCandidateRef)) * 31), this.suppressesTosClause));
    }

    public String toString() {
        return super.toString();
    }

    public HatchSsoAccountInfoResponse(List<HatchSsoMetaAccount> list, HatchTosDisclosure hatchTosDisclosure, String str, Set<String> set, boolean z, HatchLandingPresentation hatchLandingPresentation) {
        AnonymousClass002.A1D(set, 3, hatchLandingPresentation);
        this.metaAccounts = list;
        this.tos = hatchTosDisclosure;
        this.zariCandidateRef = str;
        this.supersededSavedAccountIds = set;
        this.suppressesTosClause = z;
        this.landingPresentation = hatchLandingPresentation;
    }
}

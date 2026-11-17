package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchSsoMetaAccount extends C06G {
    public final HatchDisclosurePresentation disclosurePresentation;
    public final String displayLabel;
    public final boolean hasHatch;
    public final boolean hasMetaAi;
    public final boolean isF3;
    public final List<HatchSsoLinkedAccount> linkedAccounts;
    public final List<String> memberRefs;
    public final HatchMuseProfile museProfile;
    public final boolean oneTapLoginEligible;
    public final String primaryRef;
    public final boolean showMuseTransparency;
    public final boolean supersedesSavedAccount;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSsoMetaAccount) {
                HatchSsoMetaAccount hatchSsoMetaAccount = (HatchSsoMetaAccount) obj;
                if (!C7384Etj.areEqual(this.primaryRef, hatchSsoMetaAccount.primaryRef) || !C7384Etj.areEqual(this.memberRefs, hatchSsoMetaAccount.memberRefs) || !C7384Etj.areEqual(this.displayLabel, hatchSsoMetaAccount.displayLabel) || !C7384Etj.areEqual(this.linkedAccounts, hatchSsoMetaAccount.linkedAccounts) || this.oneTapLoginEligible != hatchSsoMetaAccount.oneTapLoginEligible || this.hasHatch != hatchSsoMetaAccount.hasHatch || this.hasMetaAi != hatchSsoMetaAccount.hasMetaAi || this.isF3 != hatchSsoMetaAccount.isF3 || !C7384Etj.areEqual(this.museProfile, hatchSsoMetaAccount.museProfile) || this.showMuseTransparency != hatchSsoMetaAccount.showMuseTransparency || this.disclosurePresentation != hatchSsoMetaAccount.disclosurePresentation || this.supersedesSavedAccount != hatchSsoMetaAccount.supersedesSavedAccount) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchSsoMetaAccount copy$default(HatchSsoMetaAccount hatchSsoMetaAccount, String str, List list, String str2, List list2, boolean z, boolean z2, boolean z3, boolean z4, HatchMuseProfile hatchMuseProfile, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSsoMetaAccount.primaryRef;
        }
        if ((i & 2) != 0) {
            list = hatchSsoMetaAccount.memberRefs;
        }
        if ((i & 4) != 0) {
            str2 = hatchSsoMetaAccount.displayLabel;
        }
        if ((i & 8) != 0) {
            list2 = hatchSsoMetaAccount.linkedAccounts;
        }
        if ((i & 16) != 0) {
            z = hatchSsoMetaAccount.oneTapLoginEligible;
        }
        if ((i & 32) != 0) {
            z2 = hatchSsoMetaAccount.hasHatch;
        }
        if ((i & 64) != 0) {
            z3 = hatchSsoMetaAccount.hasMetaAi;
        }
        if ((i & 128) != 0) {
            z4 = hatchSsoMetaAccount.isF3;
        }
        if ((i & 256) != 0) {
            hatchMuseProfile = hatchSsoMetaAccount.museProfile;
        }
        if ((i & 512) != 0) {
            z5 = hatchSsoMetaAccount.showMuseTransparency;
        }
        if ((i & 1024) != 0) {
            hatchDisclosurePresentation = hatchSsoMetaAccount.disclosurePresentation;
        }
        if ((i & 2048) != 0) {
            z6 = hatchSsoMetaAccount.supersedesSavedAccount;
        }
        return hatchSsoMetaAccount.copy(str, list, str2, list2, z, z2, z3, z4, hatchMuseProfile, z5, hatchDisclosurePresentation, z6);
    }

    public final String component1() {
        return this.primaryRef;
    }

    public final boolean component10() {
        return this.showMuseTransparency;
    }

    public final HatchDisclosurePresentation component11() {
        return this.disclosurePresentation;
    }

    public final boolean component12() {
        return this.supersedesSavedAccount;
    }

    public final List<String> component2() {
        return this.memberRefs;
    }

    public final String component3() {
        return this.displayLabel;
    }

    public final List<HatchSsoLinkedAccount> component4() {
        return this.linkedAccounts;
    }

    public final boolean component5() {
        return this.oneTapLoginEligible;
    }

    public final boolean component6() {
        return this.hasHatch;
    }

    public final boolean component7() {
        return this.hasMetaAi;
    }

    public final boolean component8() {
        return this.isF3;
    }

    public final HatchMuseProfile component9() {
        return this.museProfile;
    }

    public final HatchDisclosurePresentation getDisclosurePresentation() {
        return this.disclosurePresentation;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final boolean getHasHatch() {
        return this.hasHatch;
    }

    public final boolean getHasMetaAi() {
        return this.hasMetaAi;
    }

    public final List<HatchSsoLinkedAccount> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public final List<String> getMemberRefs() {
        return this.memberRefs;
    }

    public final HatchMuseProfile getMuseProfile() {
        return this.museProfile;
    }

    public final boolean getOneTapLoginEligible() {
        return this.oneTapLoginEligible;
    }

    public final String getPrimaryRef() {
        return this.primaryRef;
    }

    public final boolean getShowMuseTransparency() {
        return this.showMuseTransparency;
    }

    public final boolean getSupersedesSavedAccount() {
        return this.supersedesSavedAccount;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.disclosurePresentation, C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.linkedAccounts, AnonymousClass005.A0I(this.displayLabel, AnonymousClass005.A0F(this.memberRefs, AnonymousClass001.A0G(this.primaryRef)))), this.oneTapLoginEligible), this.hasHatch), this.hasMetaAi), this.isF3) + AnonymousClass006.A0D(this.museProfile)) * 31, this.showMuseTransparency)), this.supersedesSavedAccount);
    }

    public final boolean isF3() {
        return this.isF3;
    }

    public HatchSsoMetaAccount(String str, List<String> list, String str2, List<HatchSsoLinkedAccount> list2, boolean z, boolean z2, boolean z3, boolean z4, HatchMuseProfile hatchMuseProfile, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, boolean z6) {
        AnonymousClass005.A14(str, list, str2, list2);
        C7384Etj.A0Y(hatchDisclosurePresentation, 10);
        this.primaryRef = str;
        this.memberRefs = list;
        this.displayLabel = str2;
        this.linkedAccounts = list2;
        this.oneTapLoginEligible = z;
        this.hasHatch = z2;
        this.hasMetaAi = z3;
        this.isF3 = z4;
        this.museProfile = hatchMuseProfile;
        this.showMuseTransparency = z5;
        this.disclosurePresentation = hatchDisclosurePresentation;
        this.supersedesSavedAccount = z6;
    }

    public final HatchSsoMetaAccount copy(String str, List<String> list, String str2, List<HatchSsoLinkedAccount> list2, boolean z, boolean z2, boolean z3, boolean z4, HatchMuseProfile hatchMuseProfile, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, boolean z6) {
        AnonymousClass005.A14(str, list, str2, list2);
        C7384Etj.A0Y(hatchDisclosurePresentation, 10);
        return new HatchSsoMetaAccount(str, list, str2, list2, z, z2, z3, z4, hatchMuseProfile, z5, hatchDisclosurePresentation, z6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSsoMetaAccount(String str, List list, String str2, List list2, boolean z, boolean z2, boolean z3, boolean z4, HatchMuseProfile hatchMuseProfile, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, boolean z6, int i, C06H c06h) {
        this(str, list, str2, list2, z, z2, z3, z4, (i & 256) != 0 ? null : hatchMuseProfile, C3cG.A1K(i & 512, z5), (i & 1024) != 0 ? HatchDisclosurePresentation.INLINE : hatchDisclosurePresentation, C3cG.A1K(i & 2048, z6));
    }
}

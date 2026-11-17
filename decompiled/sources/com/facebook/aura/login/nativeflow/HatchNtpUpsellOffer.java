package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchNtpUpsellOffer extends C06G {
    public final HatchNtpUpsellAccount account;
    public final String contactPoint;
    public final boolean isF3;
    public final HatchLandingPresentation landingPresentation;
    public final String linkHandle;
    public final boolean showMuseTransparency;
    public final boolean suppressesTosClause;
    public final HatchTosDisclosure tos;

    public final HatchNtpUpsellOffer copy(String str, String str2, HatchNtpUpsellAccount hatchNtpUpsellAccount, HatchTosDisclosure hatchTosDisclosure, boolean z, boolean z2, boolean z3, HatchLandingPresentation hatchLandingPresentation) {
        AnonymousClass005.A11(str, hatchNtpUpsellAccount, hatchTosDisclosure, 0);
        C7384Etj.A0Y(hatchLandingPresentation, 7);
        return new HatchNtpUpsellOffer(str, str2, hatchNtpUpsellAccount, hatchTosDisclosure, z, z2, z3, hatchLandingPresentation);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNtpUpsellOffer) {
                HatchNtpUpsellOffer hatchNtpUpsellOffer = (HatchNtpUpsellOffer) obj;
                if (!C7384Etj.areEqual(this.linkHandle, hatchNtpUpsellOffer.linkHandle) || !C7384Etj.areEqual(this.contactPoint, hatchNtpUpsellOffer.contactPoint) || !C7384Etj.areEqual(this.account, hatchNtpUpsellOffer.account) || !C7384Etj.areEqual(this.tos, hatchNtpUpsellOffer.tos) || this.showMuseTransparency != hatchNtpUpsellOffer.showMuseTransparency || this.isF3 != hatchNtpUpsellOffer.isF3 || this.suppressesTosClause != hatchNtpUpsellOffer.suppressesTosClause || this.landingPresentation != hatchNtpUpsellOffer.landingPresentation) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchNtpUpsellOffer copy$default(HatchNtpUpsellOffer hatchNtpUpsellOffer, String str, String str2, HatchNtpUpsellAccount hatchNtpUpsellAccount, HatchTosDisclosure hatchTosDisclosure, boolean z, boolean z2, boolean z3, HatchLandingPresentation hatchLandingPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchNtpUpsellOffer.linkHandle;
        }
        if ((i & 2) != 0) {
            str2 = hatchNtpUpsellOffer.contactPoint;
        }
        if ((i & 4) != 0) {
            hatchNtpUpsellAccount = hatchNtpUpsellOffer.account;
        }
        if ((i & 8) != 0) {
            hatchTosDisclosure = hatchNtpUpsellOffer.tos;
        }
        if ((i & 16) != 0) {
            z = hatchNtpUpsellOffer.showMuseTransparency;
        }
        if ((i & 32) != 0) {
            z2 = hatchNtpUpsellOffer.isF3;
        }
        if ((i & 64) != 0) {
            z3 = hatchNtpUpsellOffer.suppressesTosClause;
        }
        if ((i & 128) != 0) {
            hatchLandingPresentation = hatchNtpUpsellOffer.landingPresentation;
        }
        return hatchNtpUpsellOffer.copy(str, str2, hatchNtpUpsellAccount, hatchTosDisclosure, z, z2, z3, hatchLandingPresentation);
    }

    public final String component1() {
        return this.linkHandle;
    }

    public final String component2() {
        return this.contactPoint;
    }

    public final HatchNtpUpsellAccount component3() {
        return this.account;
    }

    public final HatchTosDisclosure component4() {
        return this.tos;
    }

    public final boolean component5() {
        return this.showMuseTransparency;
    }

    public final boolean component6() {
        return this.isF3;
    }

    public final boolean component7() {
        return this.suppressesTosClause;
    }

    public final HatchLandingPresentation component8() {
        return this.landingPresentation;
    }

    public final HatchNtpUpsellAccount getAccount() {
        return this.account;
    }

    public final String getContactPoint() {
        return this.contactPoint;
    }

    public final HatchLandingPresentation getLandingPresentation() {
        return this.landingPresentation;
    }

    public final String getLinkHandle() {
        return this.linkHandle;
    }

    public final boolean getShowMuseTransparency() {
        return this.showMuseTransparency;
    }

    public final boolean getSuppressesTosClause() {
        return this.suppressesTosClause;
    }

    public final HatchTosDisclosure getTos() {
        return this.tos;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.landingPresentation, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.tos, AnonymousClass005.A0F(this.account, (AnonymousClass001.A0G(this.linkHandle) + AnonymousClass006.A0G(this.contactPoint)) * 31)), this.showMuseTransparency), this.isF3), this.suppressesTosClause));
    }

    public final boolean isF3() {
        return this.isF3;
    }

    public /* synthetic */ HatchNtpUpsellOffer(String str, String str2, HatchNtpUpsellAccount hatchNtpUpsellAccount, HatchTosDisclosure hatchTosDisclosure, boolean z, boolean z2, boolean z3, HatchLandingPresentation hatchLandingPresentation, int i, C06H c06h) {
        this(str, str2, hatchNtpUpsellAccount, hatchTosDisclosure, C3cI.A1S(i, z), z2, z3, (i & 128) != 0 ? HatchLandingPresentation.STANDARD : hatchLandingPresentation);
    }

    public String toString() {
        return super.toString();
    }

    public HatchNtpUpsellOffer(String str, String str2, HatchNtpUpsellAccount hatchNtpUpsellAccount, HatchTosDisclosure hatchTosDisclosure, boolean z, boolean z2, boolean z3, HatchLandingPresentation hatchLandingPresentation) {
        AnonymousClass005.A11(str, hatchNtpUpsellAccount, hatchTosDisclosure, 0);
        C7384Etj.A0Y(hatchLandingPresentation, 7);
        this.linkHandle = str;
        this.contactPoint = str2;
        this.account = hatchNtpUpsellAccount;
        this.tos = hatchTosDisclosure;
        this.showMuseTransparency = z;
        this.isF3 = z2;
        this.suppressesTosClause = z3;
        this.landingPresentation = hatchLandingPresentation;
    }
}

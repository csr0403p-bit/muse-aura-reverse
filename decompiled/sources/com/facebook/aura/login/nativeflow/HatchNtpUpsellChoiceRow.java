package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchNtpUpsellChoiceRow extends C06G {
    public final HatchTwoFactorMetaAccount metaAccount;
    public final HatchNtpUpsellOffer offer;
    public final String profilePictureUrl;
    public final HatchTwoFactorSourceApp sourceApp;
    public final HatchTwoFactorChallenge twoFactorChallenge;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNtpUpsellChoiceRow) {
                HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow = (HatchNtpUpsellChoiceRow) obj;
                if (this.sourceApp != hatchNtpUpsellChoiceRow.sourceApp || !C7384Etj.areEqual(this.offer, hatchNtpUpsellChoiceRow.offer) || !C7384Etj.areEqual(this.twoFactorChallenge, hatchNtpUpsellChoiceRow.twoFactorChallenge) || !C7384Etj.areEqual(this.profilePictureUrl, hatchNtpUpsellChoiceRow.profilePictureUrl) || !C7384Etj.areEqual(this.metaAccount, hatchNtpUpsellChoiceRow.metaAccount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchNtpUpsellChoiceRow copy$default(HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchNtpUpsellOffer hatchNtpUpsellOffer, HatchTwoFactorChallenge hatchTwoFactorChallenge, String str, HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchTwoFactorSourceApp = hatchNtpUpsellChoiceRow.sourceApp;
        }
        if ((i & 2) != 0) {
            hatchNtpUpsellOffer = hatchNtpUpsellChoiceRow.offer;
        }
        if ((i & 4) != 0) {
            hatchTwoFactorChallenge = hatchNtpUpsellChoiceRow.twoFactorChallenge;
        }
        if ((i & 8) != 0) {
            str = hatchNtpUpsellChoiceRow.profilePictureUrl;
        }
        if ((i & 16) != 0) {
            hatchTwoFactorMetaAccount = hatchNtpUpsellChoiceRow.metaAccount;
        }
        return hatchNtpUpsellChoiceRow.copy(hatchTwoFactorSourceApp, hatchNtpUpsellOffer, hatchTwoFactorChallenge, str, hatchTwoFactorMetaAccount);
    }

    public final HatchTwoFactorSourceApp component1() {
        return this.sourceApp;
    }

    public final HatchNtpUpsellOffer component2() {
        return this.offer;
    }

    public final HatchTwoFactorChallenge component3() {
        return this.twoFactorChallenge;
    }

    public final String component4() {
        return this.profilePictureUrl;
    }

    public final HatchTwoFactorMetaAccount component5() {
        return this.metaAccount;
    }

    public final HatchNtpUpsellChoiceRow copy(HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchNtpUpsellOffer hatchNtpUpsellOffer, HatchTwoFactorChallenge hatchTwoFactorChallenge, String str, HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount) {
        return new HatchNtpUpsellChoiceRow(hatchTwoFactorSourceApp, hatchNtpUpsellOffer, hatchTwoFactorChallenge, str, hatchTwoFactorMetaAccount);
    }

    public final HatchTwoFactorMetaAccount getMetaAccount() {
        return this.metaAccount;
    }

    public final HatchNtpUpsellOffer getOffer() {
        return this.offer;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final HatchTwoFactorSourceApp getSourceApp() {
        return this.sourceApp;
    }

    public final HatchTwoFactorChallenge getTwoFactorChallenge() {
        return this.twoFactorChallenge;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0D(this.sourceApp) * 31) + AnonymousClass006.A0D(this.offer)) * 31) + AnonymousClass006.A0D(this.twoFactorChallenge)) * 31) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31) + C3cH.A02(this.metaAccount);
    }

    public HatchNtpUpsellChoiceRow(HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchNtpUpsellOffer hatchNtpUpsellOffer, HatchTwoFactorChallenge hatchTwoFactorChallenge, String str, HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount) {
        this.sourceApp = hatchTwoFactorSourceApp;
        this.offer = hatchNtpUpsellOffer;
        this.twoFactorChallenge = hatchTwoFactorChallenge;
        this.profilePictureUrl = str;
        this.metaAccount = hatchTwoFactorMetaAccount;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchNtpUpsellChoiceRow(HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchNtpUpsellOffer hatchNtpUpsellOffer, HatchTwoFactorChallenge hatchTwoFactorChallenge, String str, HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount, int i, C06H c06h) {
        this(hatchTwoFactorSourceApp, hatchNtpUpsellOffer, hatchTwoFactorChallenge, str, (i & 16) != 0 ? null : hatchTwoFactorMetaAccount);
    }
}

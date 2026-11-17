package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmValuePropsVariant extends C06G {
    public final String bannerText;
    public final String joinedButtonText;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String subtitle;
    public final String title;

    public static /* synthetic */ ConfidentialVmValuePropsVariant copy$default(ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = confidentialVmValuePropsVariant.title;
        }
        if ((i & 2) != 0) {
            str8 = confidentialVmValuePropsVariant.subtitle;
        }
        if ((i & 4) != 0) {
            str9 = confidentialVmValuePropsVariant.primaryButtonText;
        }
        if ((i & 8) != 0) {
            str10 = confidentialVmValuePropsVariant.secondaryButtonText;
        }
        if ((i & 16) != 0) {
            str11 = confidentialVmValuePropsVariant.bannerText;
        }
        if ((i & 32) != 0) {
            str12 = confidentialVmValuePropsVariant.joinedButtonText;
        }
        AnonymousClass003.A0v(str7, str9);
        return new ConfidentialVmValuePropsVariant(str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValuePropsVariant) {
                ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant = (ConfidentialVmValuePropsVariant) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmValuePropsVariant.title) || !C7384Etj.areEqual(this.subtitle, confidentialVmValuePropsVariant.subtitle) || !C7384Etj.areEqual(this.primaryButtonText, confidentialVmValuePropsVariant.primaryButtonText) || !C7384Etj.areEqual(this.secondaryButtonText, confidentialVmValuePropsVariant.secondaryButtonText) || !C7384Etj.areEqual(this.bannerText, confidentialVmValuePropsVariant.bannerText) || !C7384Etj.areEqual(this.joinedButtonText, confidentialVmValuePropsVariant.joinedButtonText)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.primaryButtonText;
    }

    public final String component4() {
        return this.secondaryButtonText;
    }

    public final String component5() {
        return this.bannerText;
    }

    public final String component6() {
        return this.joinedButtonText;
    }

    public final String getBannerText() {
        return this.bannerText;
    }

    public final String getJoinedButtonText() {
        return this.joinedButtonText;
    }

    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.primaryButtonText, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.secondaryButtonText)) * 31) + AnonymousClass006.A0G(this.bannerText)) * 31) + AnonymousClass005.A0H(this.joinedButtonText);
    }

    public ConfidentialVmValuePropsVariant(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0v(str, str3);
        this.title = str;
        this.subtitle = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
        this.bannerText = str5;
        this.joinedButtonText = str6;
    }

    public final ConfidentialVmValuePropsVariant copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0v(str, str3);
        return new ConfidentialVmValuePropsVariant(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }
}

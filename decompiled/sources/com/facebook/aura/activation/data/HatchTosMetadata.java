package com.facebook.aura.activation.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchTosMetadata extends C06G {
    public final HatchUpsellCell cvmUpsellCell;
    public final String disclosureButtonText;
    public final List<HatchDisclosureEntity> disclosureEntities;
    public final List<HatchDisclosureSection> disclosureSections;
    public final String disclosureText;
    public final String disclosureTitle;
    public final String disclosureVersion;
    public final boolean hasAcceptedTos;
    public final HatchInfoBanner infoBanner;
    public final HatchDisclosureText subscriptionDisclosure;
    public final HatchUpsellCell subscriptionUpsellCell;

    public HatchTosMetadata(boolean z, String str, String str2, List<HatchDisclosureEntity> list, String str3, String str4, List<HatchDisclosureSection> list2, HatchUpsellCell hatchUpsellCell, HatchUpsellCell hatchUpsellCell2, HatchDisclosureText hatchDisclosureText, HatchInfoBanner hatchInfoBanner) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, list, str3, str4, 2);
        C7384Etj.A0Y(list2, 6);
        this.hasAcceptedTos = z;
        this.disclosureText = str;
        this.disclosureVersion = str2;
        this.disclosureEntities = list;
        this.disclosureTitle = str3;
        this.disclosureButtonText = str4;
        this.disclosureSections = list2;
        this.cvmUpsellCell = hatchUpsellCell;
        this.subscriptionUpsellCell = hatchUpsellCell2;
        this.subscriptionDisclosure = hatchDisclosureText;
        this.infoBanner = hatchInfoBanner;
    }

    public final HatchTosMetadata copy(boolean z, String str, String str2, List<HatchDisclosureEntity> list, String str3, String str4, List<HatchDisclosureSection> list2, HatchUpsellCell hatchUpsellCell, HatchUpsellCell hatchUpsellCell2, HatchDisclosureText hatchDisclosureText, HatchInfoBanner hatchInfoBanner) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, list, str3, str4, 2);
        C7384Etj.A0Y(list2, 6);
        return new HatchTosMetadata(z, str, str2, list, str3, str4, list2, hatchUpsellCell, hatchUpsellCell2, hatchDisclosureText, hatchInfoBanner);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTosMetadata) {
                HatchTosMetadata hatchTosMetadata = (HatchTosMetadata) obj;
                if (this.hasAcceptedTos != hatchTosMetadata.hasAcceptedTos || !C7384Etj.areEqual(this.disclosureText, hatchTosMetadata.disclosureText) || !C7384Etj.areEqual(this.disclosureVersion, hatchTosMetadata.disclosureVersion) || !C7384Etj.areEqual(this.disclosureEntities, hatchTosMetadata.disclosureEntities) || !C7384Etj.areEqual(this.disclosureTitle, hatchTosMetadata.disclosureTitle) || !C7384Etj.areEqual(this.disclosureButtonText, hatchTosMetadata.disclosureButtonText) || !C7384Etj.areEqual(this.disclosureSections, hatchTosMetadata.disclosureSections) || !C7384Etj.areEqual(this.cvmUpsellCell, hatchTosMetadata.cvmUpsellCell) || !C7384Etj.areEqual(this.subscriptionUpsellCell, hatchTosMetadata.subscriptionUpsellCell) || !C7384Etj.areEqual(this.subscriptionDisclosure, hatchTosMetadata.subscriptionDisclosure) || !C7384Etj.areEqual(this.infoBanner, hatchTosMetadata.infoBanner)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchTosMetadata copy$default(HatchTosMetadata hatchTosMetadata, boolean z, String str, String str2, List list, String str3, String str4, List list2, HatchUpsellCell hatchUpsellCell, HatchUpsellCell hatchUpsellCell2, HatchDisclosureText hatchDisclosureText, HatchInfoBanner hatchInfoBanner, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchTosMetadata.hasAcceptedTos;
        }
        if ((i & 2) != 0) {
            str = hatchTosMetadata.disclosureText;
        }
        if ((i & 4) != 0) {
            str2 = hatchTosMetadata.disclosureVersion;
        }
        if ((i & 8) != 0) {
            list = hatchTosMetadata.disclosureEntities;
        }
        if ((i & 16) != 0) {
            str3 = hatchTosMetadata.disclosureTitle;
        }
        if ((i & 32) != 0) {
            str4 = hatchTosMetadata.disclosureButtonText;
        }
        if ((i & 64) != 0) {
            list2 = hatchTosMetadata.disclosureSections;
        }
        if ((i & 128) != 0) {
            hatchUpsellCell = hatchTosMetadata.cvmUpsellCell;
        }
        if ((i & 256) != 0) {
            hatchUpsellCell2 = hatchTosMetadata.subscriptionUpsellCell;
        }
        if ((i & 512) != 0) {
            hatchDisclosureText = hatchTosMetadata.subscriptionDisclosure;
        }
        if ((i & 1024) != 0) {
            hatchInfoBanner = hatchTosMetadata.infoBanner;
        }
        return hatchTosMetadata.copy(z, str, str2, list, str3, str4, list2, hatchUpsellCell, hatchUpsellCell2, hatchDisclosureText, hatchInfoBanner);
    }

    public final boolean component1() {
        return this.hasAcceptedTos;
    }

    public final HatchDisclosureText component10() {
        return this.subscriptionDisclosure;
    }

    public final HatchInfoBanner component11() {
        return this.infoBanner;
    }

    public final String component2() {
        return this.disclosureText;
    }

    public final String component3() {
        return this.disclosureVersion;
    }

    public final List<HatchDisclosureEntity> component4() {
        return this.disclosureEntities;
    }

    public final String component5() {
        return this.disclosureTitle;
    }

    public final String component6() {
        return this.disclosureButtonText;
    }

    public final List<HatchDisclosureSection> component7() {
        return this.disclosureSections;
    }

    public final HatchUpsellCell component8() {
        return this.cvmUpsellCell;
    }

    public final HatchUpsellCell component9() {
        return this.subscriptionUpsellCell;
    }

    public final HatchUpsellCell getCvmUpsellCell() {
        return this.cvmUpsellCell;
    }

    public final String getDisclosureButtonText() {
        return this.disclosureButtonText;
    }

    public final List<HatchDisclosureEntity> getDisclosureEntities() {
        return this.disclosureEntities;
    }

    public final List<HatchDisclosureSection> getDisclosureSections() {
        return this.disclosureSections;
    }

    public final String getDisclosureText() {
        return this.disclosureText;
    }

    public final String getDisclosureTitle() {
        return this.disclosureTitle;
    }

    public final String getDisclosureVersion() {
        return this.disclosureVersion;
    }

    public final boolean getHasAcceptedTos() {
        return this.hasAcceptedTos;
    }

    public final HatchInfoBanner getInfoBanner() {
        return this.infoBanner;
    }

    public final HatchDisclosureText getSubscriptionDisclosure() {
        return this.subscriptionDisclosure;
    }

    public final HatchUpsellCell getSubscriptionUpsellCell() {
        return this.subscriptionUpsellCell;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.disclosureSections, AnonymousClass005.A0I(this.disclosureButtonText, AnonymousClass005.A0I(this.disclosureTitle, AnonymousClass005.A0F(this.disclosureEntities, AnonymousClass005.A0I(this.disclosureVersion, AnonymousClass005.A0I(this.disclosureText, C0KA.A02(this.hasAcceptedTos))))))) + AnonymousClass006.A0D(this.cvmUpsellCell)) * 31) + AnonymousClass006.A0D(this.subscriptionUpsellCell)) * 31) + AnonymousClass006.A0D(this.subscriptionDisclosure)) * 31) + C06G.A04(this.infoBanner);
    }

    public String toString() {
        return super.toString();
    }
}

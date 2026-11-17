package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BNt;
import X.C06G;
import X.C7384Etj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchItemizedConsent extends C06G {
    public final String agreeToAllLabel;
    public final String confirmLabel;
    public final String declineLabel;
    public final String footer;
    public final AHD<HatchConsentItem> items;
    public final String subtitle;
    public final String title;

    public final boolean allowsConfirm(List<Boolean> list) {
        C7384Etj.A0Y(list, 0);
        if (list.size() != this.items.size()) {
            return false;
        }
        Iterable iterableA12 = AbstractC0885AGm.A12(this.items);
        if (!(iterableA12 instanceof Collection) || !((Collection) iterableA12).isEmpty()) {
            Iterator<Integer> it = iterableA12.iterator();
            while (it.hasNext()) {
                int iA00 = ((BNt) it).A00();
                if (((HatchConsentItem) this.items.get(iA00)).mandatory && !AnonymousClass001.A1X(list.get(iA00))) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchItemizedConsent) {
                HatchItemizedConsent hatchItemizedConsent = (HatchItemizedConsent) obj;
                if (!C7384Etj.areEqual(this.items, hatchItemizedConsent.items) || !C7384Etj.areEqual(this.title, hatchItemizedConsent.title) || !C7384Etj.areEqual(this.subtitle, hatchItemizedConsent.subtitle) || !C7384Etj.areEqual(this.agreeToAllLabel, hatchItemizedConsent.agreeToAllLabel) || !C7384Etj.areEqual(this.footer, hatchItemizedConsent.footer) || !C7384Etj.areEqual(this.confirmLabel, hatchItemizedConsent.confirmLabel) || !C7384Etj.areEqual(this.declineLabel, hatchItemizedConsent.declineLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchItemizedConsent copy$default(HatchItemizedConsent hatchItemizedConsent, AHD ahd, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchItemizedConsent.items;
        }
        if ((i & 2) != 0) {
            str = hatchItemizedConsent.title;
        }
        if ((i & 4) != 0) {
            str2 = hatchItemizedConsent.subtitle;
        }
        if ((i & 8) != 0) {
            str3 = hatchItemizedConsent.agreeToAllLabel;
        }
        if ((i & 16) != 0) {
            str4 = hatchItemizedConsent.footer;
        }
        if ((i & 32) != 0) {
            str5 = hatchItemizedConsent.confirmLabel;
        }
        if ((i & 64) != 0) {
            str6 = hatchItemizedConsent.declineLabel;
        }
        return hatchItemizedConsent.copy(ahd, str, str2, str3, str4, str5, str6);
    }

    public final AHD<HatchConsentItem> component1() {
        return this.items;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.agreeToAllLabel;
    }

    public final String component5() {
        return this.footer;
    }

    public final String component6() {
        return this.confirmLabel;
    }

    public final String component7() {
        return this.declineLabel;
    }

    public final String getAgreeToAllLabel() {
        return this.agreeToAllLabel;
    }

    public final String getConfirmLabel() {
        return this.confirmLabel;
    }

    public final String getDeclineLabel() {
        return this.declineLabel;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final AHD<HatchConsentItem> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.confirmLabel, (AnonymousClass005.A0I(this.agreeToAllLabel, (AnonymousClass005.A0I(this.title, AnonymousClass005.A0E(this.items)) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.footer)) * 31) + AnonymousClass005.A0H(this.declineLabel);
    }

    public HatchItemizedConsent(AHD<HatchConsentItem> ahd, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A0y(ahd, str, str3);
        C7384Etj.A0Y(str5, 5);
        this.items = ahd;
        this.title = str;
        this.subtitle = str2;
        this.agreeToAllLabel = str3;
        this.footer = str4;
        this.confirmLabel = str5;
        this.declineLabel = str6;
    }

    public final HatchItemizedConsent copy(AHD<HatchConsentItem> ahd, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A0y(ahd, str, str3);
        C7384Etj.A0Y(str5, 5);
        return new HatchItemizedConsent(ahd, str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ComplimentaryRedeemPage extends C06G {
    public static final int $stable = 0;
    public final String action;
    public final String body;
    public final Disclaimer disclaimer;
    public final String offerId;
    public final String redeemLabel;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComplimentaryRedeemPage) {
                ComplimentaryRedeemPage complimentaryRedeemPage = (ComplimentaryRedeemPage) obj;
                if (!C7384Etj.areEqual(this.offerId, complimentaryRedeemPage.offerId) || !C7384Etj.areEqual(this.action, complimentaryRedeemPage.action) || !C7384Etj.areEqual(this.title, complimentaryRedeemPage.title) || !C7384Etj.areEqual(this.body, complimentaryRedeemPage.body) || !C7384Etj.areEqual(this.redeemLabel, complimentaryRedeemPage.redeemLabel) || !C7384Etj.areEqual(this.disclaimer, complimentaryRedeemPage.disclaimer)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ComplimentaryRedeemPage copy$default(ComplimentaryRedeemPage complimentaryRedeemPage, String str, String str2, String str3, String str4, String str5, Disclaimer disclaimer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = complimentaryRedeemPage.offerId;
        }
        if ((i & 2) != 0) {
            str2 = complimentaryRedeemPage.action;
        }
        if ((i & 4) != 0) {
            str3 = complimentaryRedeemPage.title;
        }
        if ((i & 8) != 0) {
            str4 = complimentaryRedeemPage.body;
        }
        if ((i & 16) != 0) {
            str5 = complimentaryRedeemPage.redeemLabel;
        }
        if ((i & 32) != 0) {
            disclaimer = complimentaryRedeemPage.disclaimer;
        }
        return complimentaryRedeemPage.copy(str, str2, str3, str4, str5, disclaimer);
    }

    public final String component1() {
        return this.offerId;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.body;
    }

    public final String component5() {
        return this.redeemLabel;
    }

    public final Disclaimer component6() {
        return this.disclaimer;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBody() {
        return this.body;
    }

    public final Disclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getRedeemLabel() {
        return this.redeemLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.disclaimer, AnonymousClass005.A0I(this.redeemLabel, AnonymousClass005.A0I(this.body, AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.action, AnonymousClass001.A0G(this.offerId))))));
    }

    public ComplimentaryRedeemPage(String str, String str2, String str3, String str4, String str5, Disclaimer disclaimer) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(disclaimer, 5);
        this.offerId = str;
        this.action = str2;
        this.title = str3;
        this.body = str4;
        this.redeemLabel = str5;
        this.disclaimer = disclaimer;
    }

    public final ComplimentaryRedeemPage copy(String str, String str2, String str3, String str4, String str5, Disclaimer disclaimer) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(disclaimer, 5);
        return new ComplimentaryRedeemPage(str, str2, str3, str4, str5, disclaimer);
    }

    public String toString() {
        return super.toString();
    }
}

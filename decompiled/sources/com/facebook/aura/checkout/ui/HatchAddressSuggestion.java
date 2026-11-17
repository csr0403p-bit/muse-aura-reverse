package com.facebook.aura.checkout.ui;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchAddressSuggestion extends C06G {
    public static final int $stable = 0;
    public final String city;
    public final String line1;
    public final String state;
    public final String subtitle;
    public final String title;
    public final String zip;

    public HatchAddressSuggestion(String str, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str3, str4, str5, str6, 2);
        this.title = str;
        this.subtitle = str2;
        this.line1 = str3;
        this.city = str4;
        this.state = str5;
        this.zip = str6;
    }

    public final HatchAddressSuggestion copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str3, str4, str5, str6, 2);
        return new HatchAddressSuggestion(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAddressSuggestion) {
                HatchAddressSuggestion hatchAddressSuggestion = (HatchAddressSuggestion) obj;
                if (!C7384Etj.areEqual(this.title, hatchAddressSuggestion.title) || !C7384Etj.areEqual(this.subtitle, hatchAddressSuggestion.subtitle) || !C7384Etj.areEqual(this.line1, hatchAddressSuggestion.line1) || !C7384Etj.areEqual(this.city, hatchAddressSuggestion.city) || !C7384Etj.areEqual(this.state, hatchAddressSuggestion.state) || !C7384Etj.areEqual(this.zip, hatchAddressSuggestion.zip)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAddressSuggestion copy$default(HatchAddressSuggestion hatchAddressSuggestion, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAddressSuggestion.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchAddressSuggestion.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = hatchAddressSuggestion.line1;
        }
        if ((i & 8) != 0) {
            str4 = hatchAddressSuggestion.city;
        }
        if ((i & 16) != 0) {
            str5 = hatchAddressSuggestion.state;
        }
        if ((i & 32) != 0) {
            str6 = hatchAddressSuggestion.zip;
        }
        return hatchAddressSuggestion.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.line1;
    }

    public final String component4() {
        return this.city;
    }

    public final String component5() {
        return this.state;
    }

    public final String component6() {
        return this.zip;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getState() {
        return this.state;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.zip, AnonymousClass005.A0I(this.state, AnonymousClass005.A0I(this.city, AnonymousClass005.A0I(this.line1, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31))));
    }

    public String toString() {
        return super.toString();
    }
}

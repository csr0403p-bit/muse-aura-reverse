package com.facebook.aura.rentalcars;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RentalCarResults extends C06G {
    public static final int $stable = 0;
    public final AHD<RentalCarRate> rates;
    public final String subtitle;
    public final String title;

    public RentalCarResults(String str, String str2, AHD<RentalCarRate> ahd) {
        C7384Etj.A0Y(ahd, 2);
        this.title = str;
        this.subtitle = str2;
        this.rates = ahd;
    }

    public final RentalCarResults copy(String str, String str2, AHD<RentalCarRate> ahd) {
        C7384Etj.A0Y(ahd, 2);
        return new RentalCarResults(str, str2, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarResults) {
                RentalCarResults rentalCarResults = (RentalCarResults) obj;
                if (!C7384Etj.areEqual(this.title, rentalCarResults.title) || !C7384Etj.areEqual(this.subtitle, rentalCarResults.subtitle) || !C7384Etj.areEqual(this.rates, rentalCarResults.rates)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RentalCarResults copy$default(RentalCarResults rentalCarResults, String str, String str2, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarResults.title;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarResults.subtitle;
        }
        if ((i & 4) != 0) {
            ahd = rentalCarResults.rates;
        }
        return rentalCarResults.copy(str, str2, ahd);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AHD<RentalCarRate> component3() {
        return this.rates;
    }

    public final AHD<RentalCarRate> getRates() {
        return this.rates;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rates, ((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.subtitle)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}

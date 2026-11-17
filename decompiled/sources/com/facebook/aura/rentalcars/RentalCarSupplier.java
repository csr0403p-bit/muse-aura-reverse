package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RentalCarSupplier extends C06G {
    public static final int $stable = 0;
    public final String logoUrl;
    public final String name;

    public RentalCarSupplier(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.logoUrl = str2;
    }

    public final RentalCarSupplier copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new RentalCarSupplier(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarSupplier) {
                RentalCarSupplier rentalCarSupplier = (RentalCarSupplier) obj;
                if (!C7384Etj.areEqual(this.name, rentalCarSupplier.name) || !C7384Etj.areEqual(this.logoUrl, rentalCarSupplier.logoUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarSupplier copy$default(RentalCarSupplier rentalCarSupplier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarSupplier.name;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarSupplier.logoUrl;
        }
        C7384Etj.A0Y(str, 0);
        return new RentalCarSupplier(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.logoUrl;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.logoUrl);
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.rentalcars;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RentalCarLocation extends C06G {
    public static final int $stable = 0;
    public final RentalCarAccess access;
    public final String address;
    public final String name;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarLocation) {
                RentalCarLocation rentalCarLocation = (RentalCarLocation) obj;
                if (!C7384Etj.areEqual(this.name, rentalCarLocation.name) || this.access != rentalCarLocation.access || !C7384Etj.areEqual(this.address, rentalCarLocation.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarLocation copy$default(RentalCarLocation rentalCarLocation, String str, RentalCarAccess rentalCarAccess, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarLocation.name;
        }
        if ((i & 2) != 0) {
            rentalCarAccess = rentalCarLocation.access;
        }
        if ((i & 4) != 0) {
            str2 = rentalCarLocation.address;
        }
        return new RentalCarLocation(str, rentalCarAccess, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final RentalCarAccess component2() {
        return this.access;
    }

    public final String component3() {
        return this.address;
    }

    public final RentalCarLocation copy(String str, RentalCarAccess rentalCarAccess, String str2) {
        return new RentalCarLocation(str, rentalCarAccess, str2);
    }

    public final RentalCarAccess getAccess() {
        return this.access;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0D(this.access)) * 31) + AnonymousClass005.A0H(this.address);
    }

    public RentalCarLocation(String str, RentalCarAccess rentalCarAccess, String str2) {
        this.name = str;
        this.access = rentalCarAccess;
        this.address = str2;
    }

    public String toString() {
        return super.toString();
    }
}

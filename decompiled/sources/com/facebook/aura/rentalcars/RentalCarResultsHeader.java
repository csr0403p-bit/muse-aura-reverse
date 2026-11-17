package com.facebook.aura.rentalcars;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.time.LocalDate;

/* loaded from: classes3.dex */
public final class RentalCarResultsHeader extends C06G {
    public static final int $stable = 8;
    public final LocalDate dropoffDate;
    public final String locationName;
    public final LocalDate pickupDate;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarResultsHeader) {
                RentalCarResultsHeader rentalCarResultsHeader = (RentalCarResultsHeader) obj;
                if (!C7384Etj.areEqual(this.locationName, rentalCarResultsHeader.locationName) || !C7384Etj.areEqual(this.pickupDate, rentalCarResultsHeader.pickupDate) || !C7384Etj.areEqual(this.dropoffDate, rentalCarResultsHeader.dropoffDate)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarResultsHeader copy$default(RentalCarResultsHeader rentalCarResultsHeader, String str, LocalDate localDate, LocalDate localDate2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarResultsHeader.locationName;
        }
        if ((i & 2) != 0) {
            localDate = rentalCarResultsHeader.pickupDate;
        }
        if ((i & 4) != 0) {
            localDate2 = rentalCarResultsHeader.dropoffDate;
        }
        return rentalCarResultsHeader.copy(str, localDate, localDate2);
    }

    public final String component1() {
        return this.locationName;
    }

    public final LocalDate component2() {
        return this.pickupDate;
    }

    public final LocalDate component3() {
        return this.dropoffDate;
    }

    public final LocalDate getDropoffDate() {
        return this.dropoffDate;
    }

    public final String getLocationName() {
        return this.locationName;
    }

    public final LocalDate getPickupDate() {
        return this.pickupDate;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.dropoffDate, AnonymousClass005.A0F(this.pickupDate, AnonymousClass006.A0G(this.locationName) * 31));
    }

    public RentalCarResultsHeader(String str, LocalDate localDate, LocalDate localDate2) {
        AnonymousClass003.A0x(localDate, localDate2);
        this.locationName = str;
        this.pickupDate = localDate;
        this.dropoffDate = localDate2;
    }

    public final RentalCarResultsHeader copy(String str, LocalDate localDate, LocalDate localDate2) {
        AnonymousClass003.A0x(localDate, localDate2);
        return new RentalCarResultsHeader(str, localDate, localDate2);
    }

    public String toString() {
        return super.toString();
    }
}

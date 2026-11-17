package com.facebook.aura.rentalcars;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.time.LocalDate;
import java.time.LocalTime;

/* loaded from: classes3.dex */
public final class RentalCarStop extends C06G {
    public static final int $stable = 8;
    public final LocalDate date;
    public final RentalCarLocation location;
    public final LocalTime time;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarStop) {
                RentalCarStop rentalCarStop = (RentalCarStop) obj;
                if (!C7384Etj.areEqual(this.date, rentalCarStop.date) || !C7384Etj.areEqual(this.time, rentalCarStop.time) || !C7384Etj.areEqual(this.location, rentalCarStop.location)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarStop copy$default(RentalCarStop rentalCarStop, LocalDate localDate, LocalTime localTime, RentalCarLocation rentalCarLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = rentalCarStop.date;
        }
        if ((i & 2) != 0) {
            localTime = rentalCarStop.time;
        }
        if ((i & 4) != 0) {
            rentalCarLocation = rentalCarStop.location;
        }
        return rentalCarStop.copy(localDate, localTime, rentalCarLocation);
    }

    public final LocalDate component1() {
        return this.date;
    }

    public final LocalTime component2() {
        return this.time;
    }

    public final RentalCarLocation component3() {
        return this.location;
    }

    public final LocalDate getDate() {
        return this.date;
    }

    public final RentalCarLocation getLocation() {
        return this.location;
    }

    public final LocalTime getTime() {
        return this.time;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.location, (AnonymousClass005.A0E(this.date) + AnonymousClass006.A0D(this.time)) * 31);
    }

    public RentalCarStop(LocalDate localDate, LocalTime localTime, RentalCarLocation rentalCarLocation) {
        AnonymousClass003.A0v(localDate, rentalCarLocation);
        this.date = localDate;
        this.time = localTime;
        this.location = rentalCarLocation;
    }

    public final RentalCarStop copy(LocalDate localDate, LocalTime localTime, RentalCarLocation rentalCarLocation) {
        AnonymousClass003.A0v(localDate, rentalCarLocation);
        return new RentalCarStop(localDate, localTime, rentalCarLocation);
    }

    public String toString() {
        return super.toString();
    }
}

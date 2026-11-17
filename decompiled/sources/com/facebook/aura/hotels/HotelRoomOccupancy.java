package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HotelRoomOccupancy extends C06G {
    public static final int $stable = 0;
    public final int adults;
    public final AHD<Integer> childAges;

    public HotelRoomOccupancy(int i, AHD<Integer> ahd) {
        C7384Etj.A0Y(ahd, 1);
        this.adults = i;
        this.childAges = ahd;
    }

    public final HotelRoomOccupancy copy(int i, AHD<Integer> ahd) {
        C7384Etj.A0Y(ahd, 1);
        return new HotelRoomOccupancy(i, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelRoomOccupancy) {
                HotelRoomOccupancy hotelRoomOccupancy = (HotelRoomOccupancy) obj;
                if (this.adults != hotelRoomOccupancy.adults || !C7384Etj.areEqual(this.childAges, hotelRoomOccupancy.childAges)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelRoomOccupancy copy$default(HotelRoomOccupancy hotelRoomOccupancy, int i, AHD ahd, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hotelRoomOccupancy.adults;
        }
        if ((i2 & 2) != 0) {
            ahd = hotelRoomOccupancy.childAges;
        }
        C7384Etj.A0Y(ahd, 1);
        return new HotelRoomOccupancy(i, ahd);
    }

    public final int component1() {
        return this.adults;
    }

    public final AHD<Integer> component2() {
        return this.childAges;
    }

    public final int getAdults() {
        return this.adults;
    }

    public final AHD<Integer> getChildAges() {
        return this.childAges;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.childAges, this.adults * 31);
    }

    public String toString() {
        return super.toString();
    }
}

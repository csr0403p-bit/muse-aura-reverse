package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.time.LocalDate;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class HotelTrip extends C06G {
    public static final int $stable = 0;
    public final LocalDate checkIn;
    public final LocalDate checkOut;
    public final AHD<HotelRoomOccupancy> rooms;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelTrip) {
                HotelTrip hotelTrip = (HotelTrip) obj;
                if (!C7384Etj.areEqual(this.checkIn, hotelTrip.checkIn) || !C7384Etj.areEqual(this.checkOut, hotelTrip.checkOut) || !C7384Etj.areEqual(this.rooms, hotelTrip.rooms)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelTrip copy$default(HotelTrip hotelTrip, LocalDate localDate, LocalDate localDate2, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = hotelTrip.checkIn;
        }
        if ((i & 2) != 0) {
            localDate2 = hotelTrip.checkOut;
        }
        if ((i & 4) != 0) {
            ahd = hotelTrip.rooms;
        }
        return hotelTrip.copy(localDate, localDate2, ahd);
    }

    public final LocalDate component1() {
        return this.checkIn;
    }

    public final LocalDate component2() {
        return this.checkOut;
    }

    public final AHD<HotelRoomOccupancy> component3() {
        return this.rooms;
    }

    public final int getAdults() {
        Iterator it = this.rooms.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((HotelRoomOccupancy) it.next()).adults;
        }
        return i;
    }

    public final LocalDate getCheckIn() {
        return this.checkIn;
    }

    public final LocalDate getCheckOut() {
        return this.checkOut;
    }

    public final int getChildren() {
        Iterator it = this.rooms.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((HotelRoomOccupancy) it.next()).childAges.size();
        }
        return size;
    }

    public final AHD<HotelRoomOccupancy> getRooms() {
        return this.rooms;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rooms, AnonymousClass005.A0F(this.checkOut, AnonymousClass005.A0E(this.checkIn)));
    }

    public HotelTrip(LocalDate localDate, LocalDate localDate2, AHD<HotelRoomOccupancy> ahd) {
        AnonymousClass005.A0x(localDate, localDate2, ahd);
        this.checkIn = localDate;
        this.checkOut = localDate2;
        this.rooms = ahd;
    }

    public final HotelTrip copy(LocalDate localDate, LocalDate localDate2, AHD<HotelRoomOccupancy> ahd) {
        AnonymousClass005.A0x(localDate, localDate2, ahd);
        return new HotelTrip(localDate, localDate2, ahd);
    }

    public String toString() {
        return super.toString();
    }
}

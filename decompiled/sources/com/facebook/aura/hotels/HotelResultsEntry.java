package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HotelResultsEntry extends C06G {
    public static final int $stable = 0;
    public final HotelResult hotel;
    public final String searchRef;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResultsEntry) {
                HotelResultsEntry hotelResultsEntry = (HotelResultsEntry) obj;
                if (!C7384Etj.areEqual(this.hotel, hotelResultsEntry.hotel) || !C7384Etj.areEqual(this.searchRef, hotelResultsEntry.searchRef)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelResultsEntry copy$default(HotelResultsEntry hotelResultsEntry, HotelResult hotelResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelResult = hotelResultsEntry.hotel;
        }
        if ((i & 2) != 0) {
            str = hotelResultsEntry.searchRef;
        }
        AnonymousClass003.A0u(hotelResult, str);
        return new HotelResultsEntry(hotelResult, str);
    }

    public final HotelResult component1() {
        return this.hotel;
    }

    public final String component2() {
        return this.searchRef;
    }

    public final HotelResult getHotel() {
        return this.hotel;
    }

    public final String getSearchRef() {
        return this.searchRef;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.searchRef, AnonymousClass005.A0E(this.hotel));
    }

    public HotelResultsEntry(HotelResult hotelResult, String str) {
        AnonymousClass003.A0u(hotelResult, str);
        this.hotel = hotelResult;
        this.searchRef = str;
    }

    public final HotelResultsEntry copy(HotelResult hotelResult, String str) {
        AnonymousClass003.A0u(hotelResult, str);
        return new HotelResultsEntry(hotelResult, str);
    }

    public String toString() {
        return super.toString();
    }
}

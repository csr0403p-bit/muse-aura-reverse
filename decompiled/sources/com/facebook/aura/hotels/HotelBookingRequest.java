package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class HotelBookingRequest extends C06G {
    public static final int $stable = 8;
    public final List<String> bedOptions;
    public final String hotelName;
    public final String roomName;
    public final HotelMoney total;
    public final HotelTrip trip;

    public HotelBookingRequest(String str, String str2, List<String> list, HotelTrip hotelTrip, HotelMoney hotelMoney) {
        AnonymousClass005.A11(str, list, hotelTrip, 0);
        C7384Etj.A0Y(hotelMoney, 4);
        this.hotelName = str;
        this.roomName = str2;
        this.bedOptions = list;
        this.trip = hotelTrip;
        this.total = hotelMoney;
    }

    public final HotelBookingRequest copy(String str, String str2, List<String> list, HotelTrip hotelTrip, HotelMoney hotelMoney) {
        AnonymousClass005.A11(str, list, hotelTrip, 0);
        C7384Etj.A0Y(hotelMoney, 4);
        return new HotelBookingRequest(str, str2, list, hotelTrip, hotelMoney);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelBookingRequest) {
                HotelBookingRequest hotelBookingRequest = (HotelBookingRequest) obj;
                if (!C7384Etj.areEqual(this.hotelName, hotelBookingRequest.hotelName) || !C7384Etj.areEqual(this.roomName, hotelBookingRequest.roomName) || !C7384Etj.areEqual(this.bedOptions, hotelBookingRequest.bedOptions) || !C7384Etj.areEqual(this.trip, hotelBookingRequest.trip) || !C7384Etj.areEqual(this.total, hotelBookingRequest.total)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelBookingRequest copy$default(HotelBookingRequest hotelBookingRequest, String str, String str2, List list, HotelTrip hotelTrip, HotelMoney hotelMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelBookingRequest.hotelName;
        }
        if ((i & 2) != 0) {
            str2 = hotelBookingRequest.roomName;
        }
        if ((i & 4) != 0) {
            list = hotelBookingRequest.bedOptions;
        }
        if ((i & 8) != 0) {
            hotelTrip = hotelBookingRequest.trip;
        }
        if ((i & 16) != 0) {
            hotelMoney = hotelBookingRequest.total;
        }
        return hotelBookingRequest.copy(str, str2, list, hotelTrip, hotelMoney);
    }

    public final String component1() {
        return this.hotelName;
    }

    public final String component2() {
        return this.roomName;
    }

    public final List<String> component3() {
        return this.bedOptions;
    }

    public final HotelTrip component4() {
        return this.trip;
    }

    public final HotelMoney component5() {
        return this.total;
    }

    public final List<String> getBedOptions() {
        return this.bedOptions;
    }

    public final String getHotelName() {
        return this.hotelName;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final HotelMoney getTotal() {
        return this.total;
    }

    public final HotelTrip getTrip() {
        return this.trip;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.total, AnonymousClass005.A0F(this.trip, AnonymousClass005.A0F(this.bedOptions, (AnonymousClass001.A0G(this.hotelName) + AnonymousClass006.A0G(this.roomName)) * 31)));
    }

    public String toString() {
        return super.toString();
    }
}

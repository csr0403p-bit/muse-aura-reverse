package com.facebook.aura.hotels;

import X.AGI;
import X.AHD;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.hotels.HotelReserveAction;
import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class HotelBrowseViewModelsKt {
    public static final HotelResultsCollection collection(HotelResults hotelResults, HotelResults hotelResults2) {
        AHD<HotelResult> ahd;
        C7384Etj.A0Y(hotelResults, 0);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        if (hotelResults2 != null && (ahd = hotelResults2.hotels) != null) {
            for (HotelResult hotelResult : ahd) {
                linkedHashMapA0j.put(HotelBookingFormattingKt.identityKey(hotelResult), new HotelResultsEntry(hotelResult, hotelResults2.searchRef));
            }
        }
        for (HotelResult hotelResult2 : hotelResults.hotels) {
            linkedHashMapA0j.put(HotelBookingFormattingKt.identityKey(hotelResult2), new HotelResultsEntry(hotelResult2, hotelResults.searchRef));
        }
        String str = hotelResults.location;
        if (str == null) {
            str = hotelResults2 != null ? hotelResults2.location : null;
        }
        HotelResults hotelResultsCopy$default = HotelResults.copy$default(hotelResults, null, null, null, null, null, null, null, null, null, false, null, null, null, null, str, 16383, null);
        Collection collectionValues = linkedHashMapA0j.values();
        C7384Etj.A0U(collectionValues);
        return new HotelResultsCollection(hotelResultsCopy$default, AGI.A07(collectionValues), false);
    }

    public static /* synthetic */ HotelResultsCollection collection$default(HotelResults hotelResults, HotelResults hotelResults2, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelResults2 = null;
        }
        return collection(hotelResults, hotelResults2);
    }

    public static final HotelReserveAction reserveAction(HotelSelection hotelSelection) {
        HotelPrice hotelPrice;
        HotelMoney hotelMoney;
        HotelBookingAction hotelBookingAction = hotelSelection.bookingAction;
        if ((hotelBookingAction != null ? hotelBookingAction.type : null) == HotelBookingActionType.REQUEST_BOOKING_REVIEW) {
            return HotelReserveAction.NativeReview.INSTANCE;
        }
        HotelTrip hotelTrip = hotelSelection.trip;
        if (hotelTrip == null || (hotelPrice = hotelSelection.price) == null || (hotelMoney = hotelPrice.total) == null) {
            return null;
        }
        return new HotelReserveAction.Chat(new HotelBookingRequest(hotelSelection.hotelName, hotelSelection.roomName, hotelSelection.bedOptions, hotelTrip, hotelMoney));
    }
}

package com.facebook.aura.hotels;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.hotels.HotelRefundability;

/* loaded from: classes4.dex */
public abstract class HotelBookingModelsKt {
    public static final String getPartialRefundPolicy(HotelCancellation hotelCancellation) {
        C7384Etj.A0Y(hotelCancellation, 0);
        HotelRefundability refundability = getRefundability(hotelCancellation);
        if ((refundability instanceof HotelRefundability.FullyRefundable) || (refundability instanceof HotelRefundability.FullRefundBefore)) {
            String str = hotelCancellation.description;
            if (str != null && hotelCancellation.hasPenalties) {
                return str;
            }
        } else if (!C7384Etj.areEqual(refundability, HotelRefundability.NonRefundable.INSTANCE) && refundability != null) {
            throw C3cG.A0q();
        }
        return null;
    }

    public static final HotelRefundability getRefundability(HotelCancellation hotelCancellation) {
        HotelRefundability fullRefundBefore;
        C7384Etj.A0Y(hotelCancellation, 0);
        if (AnonymousClass002.A1b(hotelCancellation.refundable, false)) {
            return HotelRefundability.NonRefundable.INSTANCE;
        }
        if (!AnonymousClass002.A1b(hotelCancellation.freeCancellation, true)) {
            return null;
        }
        if (hotelCancellation.hasPenalties) {
            String str = hotelCancellation.freeCancellationUntil;
            if (str == null) {
                return null;
            }
            fullRefundBefore = new HotelRefundability.FullRefundBefore(str);
        } else {
            fullRefundBefore = new HotelRefundability.FullyRefundable(hotelCancellation.freeCancellationUntil);
        }
        return fullRefundBefore;
    }
}

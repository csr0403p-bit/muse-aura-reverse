package com.facebook.aura.hotels;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.icu.text.ListFormatter;
import android.text.BidiFormatter;
import com.facebook.aura.R;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class HotelBookingFormattingKt {
    public static final String identityKey(HotelResult hotelResult) {
        C7384Etj.A0Y(hotelResult, 0);
        return AbstractC0878AGe.A0L("", "", "", Arrays.asList(hotelResult.hotelId, hotelResult.offerId, hotelResult.rateId), AnonymousClass1.INSTANCE);
    }

    public static final String roomSummary(HotelResult hotelResult) {
        String strA0e;
        C7384Etj.A0Y(hotelResult, 0);
        AHD<String> ahd = hotelResult.roomDetails;
        return (ahd.isEmpty() || (strA0e = C3cH.A0e(PairsDiscretionDocument.TERMINATOR, ahd)) == null) ? HotelResultModelsKt.hotelNonBlank(hotelResult.roomName) : strA0e;
    }

    /* renamed from: com.facebook.aura.hotels.HotelBookingFormattingKt$identityKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(String str) {
            int iA02 = C60R.A02(str);
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(iA02);
            return C60P.A1M(":", str, sbA0w);
        }
    }

    public static final String hotelBookingMessage(Context context, HotelBookingRequest hotelBookingRequest) {
        int i;
        Object[] objArr;
        String strUnicodeWrap;
        AnonymousClass003.A0u(context, hotelBookingRequest);
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        String strUnicodeWrap2 = bidiFormatter.unicodeWrap(hotelBookingRequest.hotelName);
        int adults = hotelBookingRequest.trip.getAdults() + hotelBookingRequest.trip.getChildren();
        String string = context.getString(R.string._name_removed__res_0x7f12034e, HotelResultsFormattingKt.dateRange$default(hotelBookingRequest.trip, null, null, 3, null), context.getResources().getQuantityString(R.plurals._name_removed__res_0x7f10000c, adults, Integer.valueOf(adults)));
        String str = HotelResultsFormattingKt.formatted(hotelBookingRequest.total, C60Q.A0w());
        String strHotelRoomLabel = hotelRoomLabel(hotelBookingRequest.roomName, hotelBookingRequest.bedOptions, C60Q.A0w());
        if (strHotelRoomLabel == null || (strUnicodeWrap = bidiFormatter.unicodeWrap(strHotelRoomLabel)) == null) {
            i = R.string._name_removed__res_0x7f120323;
            objArr = new Object[]{strUnicodeWrap2, string, str};
        } else {
            i = R.string._name_removed__res_0x7f120324;
            objArr = new Object[]{strUnicodeWrap2, strUnicodeWrap, string, str};
        }
        return context.getString(i, objArr);
    }

    public static final String hotelRoomLabel(String str, List<String> list, Locale locale) {
        AnonymousClass003.A0x(list, locale);
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(str);
        if (strHotelNonBlank != null) {
            return strHotelNonBlank;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strHotelNonBlank2 = HotelResultModelsKt.hotelNonBlank(AnonymousClass005.A0j(it));
            if (strHotelNonBlank2 != null) {
                arrayListA0h.add(strHotelNonBlank2);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return ListFormatter.getInstance(locale, ListFormatter.Type.OR, ListFormatter.Width.WIDE).format(arrayListA0h);
    }
}

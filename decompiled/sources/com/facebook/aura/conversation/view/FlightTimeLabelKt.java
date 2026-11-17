package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BBI;
import X.BFM;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;

/* loaded from: classes2.dex */
public abstract class FlightTimeLabelKt {
    public static final String flightFromPrice(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120a4c);
    }

    public static final String flightPricePerPerson(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120a51);
    }

    public static final String flightRoute(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        C7384Etj.A0Y(flightRowSlice, 0);
        if (flightRowSlice.from.length() <= 0 || flightRowSlice.to.length() <= 0) {
            AnonymousClass003.A0l(bfm, -158266186);
            return null;
        }
        bfm.AgE(-143655218);
        return C3cJ.A0H(bfm, flightRowSlice.from, flightRowSlice.to, R.string._name_removed__res_0x7f120a2e);
    }

    public static final String flightShortTime(FlightTimestamp flightTimestamp, BFM bfm, int i) {
        C7384Etj.A0Y(flightTimestamp, 0);
        if (flightTimestamp.dayOffset == 0) {
            AnonymousClass003.A0l(bfm, -521182601);
            return flightTimestamp.shortTimestampString;
        }
        bfm.AgE(-521181241);
        return C3cJ.A0H(bfm, flightTimestamp.shortTimestampString, Integer.valueOf(flightTimestamp.dayOffset), R.string._name_removed__res_0x7f120a54);
    }

    public static final String flightTimeRange(FlightRowSlice flightRowSlice, int i, BFM bfm, int i2) {
        BBI bbiA0M;
        C7384Etj.A0Y(flightRowSlice, 0);
        bfm.AgE(1835719467);
        FlightTimestamp flightTimestamp = flightRowSlice.depart;
        String strFlightShortTime = null;
        if (flightTimestamp == null) {
            bbiA0M = AnonymousClass002.A0M(bfm, 100178331);
        } else {
            bfm.AgE(100178332);
            String strFlightShortTime2 = flightShortTime(flightTimestamp, bfm, 0);
            bbiA0M = (BBI) bfm;
            BBI.A0R(bbiA0M, false);
            if (strFlightShortTime2 != null) {
                FlightTimestamp flightTimestamp2 = flightRowSlice.arrive;
                if (flightTimestamp2 == null) {
                    bfm.AgE(100250747);
                } else {
                    bfm.AgE(100250748);
                    strFlightShortTime = flightShortTime(flightTimestamp2, bfm, 0);
                }
                BBI.A0R(bbiA0M, false);
                if (strFlightShortTime == null) {
                    BBI.A0R(bbiA0M, false);
                    return strFlightShortTime2;
                }
                String strA0w = AnonymousClass006.A0w(bfm, strFlightShortTime2, strFlightShortTime, i);
                BBI.A0R(bbiA0M, false);
                return strA0w;
            }
        }
        BBI.A0R(bbiA0M, false);
        return null;
    }
}

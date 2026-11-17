package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BFM;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSlice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class FlightStopsLabelKt {
    public static final String flightStopsLabel(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        String strA0Y;
        C7384Etj.A0Y(flightRowSlice, 0);
        if (flightRowSlice.stops == 0) {
            bfm.AgE(-1186504609);
            strA0Y = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a50);
        } else {
            bfm.AgE(-1186502466);
            strA0Y = AnonymousClass007.A0Y(flightRowSlice.stops, bfm, R.plurals._name_removed__res_0x7f10002e);
        }
        AnonymousClass001.A1D(bfm);
        return strA0Y;
    }

    public static final String flightStopsWithAirports(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        C7384Etj.A0Y(flightRowSlice, 0);
        bfm.AgE(-1759273625);
        String strFlightStopsLabel = flightStopsLabel(flightRowSlice, bfm, i & 14);
        List listA0d = AbstractC0878AGe.A0d(flightRowSlice.segments, 1);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0d);
        Iterator it = listA0d.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((FlightRowSegment) it.next()).to);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = arrayListA0i.iterator();
        while (it2.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it2);
        }
        if (flightRowSlice.stops != 0 && arrayListA0h.size() == flightRowSlice.stops) {
            return C3cJ.A0H(bfm, strFlightStopsLabel, C3cH.A0e(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a4b), arrayListA0h), R.string._name_removed__res_0x7f120a53);
        }
        AnonymousClass001.A1D(bfm);
        return strFlightStopsLabel;
    }
}

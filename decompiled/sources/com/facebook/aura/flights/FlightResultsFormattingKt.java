package com.facebook.aura.flights;

import X.ADq;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC2271BQs;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BBI;
import X.BFM;
import X.BNt;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.FlightStopsLabelKt;
import com.facebook.aura.conversation.view.FlightTimeLabelKt;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class FlightResultsFormattingKt {
    public static final String compactRoute(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        C7384Etj.A0Y(flightRowSlice, 0);
        if (flightRowSlice.from.length() <= 0 || flightRowSlice.to.length() <= 0) {
            AnonymousClass003.A0l(bfm, -1705543172);
            return null;
        }
        bfm.AgE(-1440493244);
        return C3cJ.A0H(bfm, flightRowSlice.from, flightRowSlice.to, R.string._name_removed__res_0x7f120a3b);
    }

    public static final String flightResultsCardTitle(FlightResults flightResults, BFM bfm, int i) {
        int i2;
        C7384Etj.A0Y(flightResults, 0);
        bfm.AgE(2029451645);
        FlightRowData flightRowData = (FlightRowData) AbstractC0878AGe.A0F(flightResults.offers);
        FlightRowSlice flightRowSlice = (FlightRowSlice) AbstractC0878AGe.A0F(flightRowData.slices);
        C7384Etj.A0Y(flightRowSlice, 0);
        String strFlightRoute = FlightTimeLabelKt.flightRoute(flightRowSlice, bfm, 0);
        if (strFlightRoute == null) {
            String str = flightResults.listTitle;
            AnonymousClass001.A1D(bfm);
            return str;
        }
        if (flightResults.isOneWay()) {
            bfm.AgE(387885245);
            i2 = R.string._name_removed__res_0x7f120a37;
        } else if (flightResults.isMultiCity()) {
            bfm.AgE(387888563);
            i2 = R.string._name_removed__res_0x7f120a35;
            strFlightRoute = C3cH.A0e(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a3f), FlightResultsKt.tripStops(flightRowData));
        } else {
            if (flightResults.stage == FlightSelectionStage.COMPLETE && flightRowData.slices.size() != 2) {
                bfm.AgE(387899618);
                AnonymousClass006.A1N(bfm);
                return strFlightRoute;
            }
            bfm.AgE(387897120);
            i2 = R.string._name_removed__res_0x7f120a3a;
        }
        strFlightRoute = AnonymousClass001.A0t(bfm, strFlightRoute, i2);
        AnonymousClass006.A1N(bfm);
        return strFlightRoute;
    }

    public static final String flightResultsListSubtitle(FlightResults flightResults, BFM bfm, int i) {
        BBI bbiA0M;
        String strA0s;
        String strDetailPair;
        C7384Etj.A0Y(flightResults, 0);
        bfm.AgE(563443359);
        if (flightResults.isMultiCity()) {
            bfm.AgE(809015240);
            ArrayList arrayListA0Q = AbstractC0878AGe.A0Q(((FlightRowSlice) AbstractC0878AGe.A0H(((FlightRowData) AbstractC0878AGe.A0F(flightResults.offers)).slices)).to, FlightResultsKt.tripStops((FlightRowData) AbstractC0878AGe.A0F(flightResults.offers)));
            bfm.AgE(303195491);
            Iterator it = arrayListA0Q.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException(AnonymousClass000.A00(11));
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = AnonymousClass006.A0w(bfm, next, it.next(), R.string._name_removed__res_0x7f120a3b);
            }
            bbiA0M = C3cG.A07(bfm);
            strDetailPair = detailPair(flightResultsTripDates(flightResults, bfm, i & 14), (String) next, bfm, 0);
            BBI.A0R(bbiA0M, false);
        } else {
            bbiA0M = AnonymousClass002.A0M(bfm, 809287203);
            if (flightResults.isOneWay()) {
                bfm.AgE(303202034);
                strA0s = AnonymousClass001.A0s(bfm, bbiA0M, R.string._name_removed__res_0x7f120a36);
            } else {
                bfm.AgE(809383550);
                BBI.A0R(bbiA0M, false);
                strA0s = null;
            }
            strDetailPair = detailPair(sharedDepartDate(flightResults, flightResults.getFocusSliceIndex()), detailPair(compactRoute(flightResults.getFocusSlice(), bfm, 0), strA0s, bfm, 0), bfm, 0);
        }
        BBI.A0R(bbiA0M, false);
        return strDetailPair;
    }

    public static final String flightResultsPartySummary(FlightResults flightResults, BFM bfm, int i) {
        String strA00;
        C7384Etj.A0Y(flightResults, 0);
        int travelers = flightResults.getTravelers();
        Integer numValueOf = Integer.valueOf(travelers);
        if (travelers > 0) {
            bfm.AgE(1309873985);
            strA00 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f10002d, new Object[]{numValueOf}, bfm, travelers);
            AnonymousClass001.A1D(bfm);
        } else {
            AnonymousClass003.A0l(bfm, 1309873984);
            strA00 = null;
        }
        List<FlightRowData> list = flightResults.offers;
        ArrayList<FlightRowSlice> arrayListA0h = C3cG.A0h();
        Iterator<FlightRowData> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next().slices, arrayListA0h);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        for (FlightRowSlice flightRowSlice : arrayListA0h) {
            String str = flightRowSlice.cabin;
            if (str == null || flightRowSlice.cabinVaries || C7BY.A0j(str)) {
                str = null;
            }
            arrayListA0i.add(str);
        }
        return detailPair(strA00, (String) AbstractC0878AGe.A0K(C3cG.A0m(arrayListA0i)), bfm, 0);
    }

    public static final String flightResultsSummary(FlightResults flightResults, BFM bfm, int i) {
        C7384Etj.A0Y(flightResults, 0);
        return travelersSummary(flightResults, sharedDepartDate(flightResults, flightResults.getFocusSliceIndex()), bfm, i & 14);
    }

    public static final String flightResultsTitle(FlightResults flightResults, BFM bfm, int i) {
        C7384Etj.A0Y(flightResults, 0);
        FlightRowSlice focusSlice = flightResults.getFocusSlice();
        C7384Etj.A0Y(focusSlice, 0);
        String strFlightRoute = FlightTimeLabelKt.flightRoute(focusSlice, bfm, 0);
        return strFlightRoute == null ? flightResults.listTitle : strFlightRoute;
    }

    public static final String flightResultsTripDates(FlightResults flightResults, BFM bfm, int i) {
        C7384Etj.A0Y(flightResults, 0);
        int size = ((FlightRowData) AbstractC0878AGe.A0F(flightResults.offers)).slices.size();
        ADq aDqA0C = ATD.A0C(0, size);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Integer> it = aDqA0C.iterator();
        while (it.hasNext()) {
            String strSharedDepartDate = sharedDepartDate(flightResults, ((BNt) it).A00());
            if (strSharedDepartDate != null) {
                arrayListA0h.add(strSharedDepartDate);
            }
        }
        if (arrayListA0h.size() != size) {
            AnonymousClass003.A0l(bfm, 1991962737);
        } else {
            if (arrayListA0h.size() > 1) {
                bfm.AgE(1991964184);
                return C3cJ.A0H(bfm, AbstractC0878AGe.A0F(arrayListA0h), AbstractC0878AGe.A0H(arrayListA0h), R.string._name_removed__res_0x7f120a31);
            }
            AnonymousClass003.A0l(bfm, 1621441554);
            String str = (String) AbstractC0878AGe.A0G(arrayListA0h);
            if (str != null) {
                return str;
            }
        }
        return flightResults.listSubtitle;
    }

    public static final String timeRange(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        C7384Etj.A0Y(flightRowSlice, 0);
        return FlightTimeLabelKt.flightTimeRange(flightRowSlice, R.string._name_removed__res_0x7f120a40, bfm, i & 14);
    }

    public static final String detailPair(String str, String str2, BFM bfm, int i) {
        if (str == null || str2 == null) {
            AnonymousClass004.A1A(bfm, 92830949);
            return str == null ? str2 : str;
        }
        bfm.AgE(-1798123436);
        return C3cJ.A0H(bfm, str, str2, R.string._name_removed__res_0x7f120a34);
    }

    public static final String sharedDepartDate(FlightResults flightResults, int i) {
        FlightTimestamp flightTimestamp;
        List<FlightRowData> list = flightResults.offers;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<FlightRowData> it = list.iterator();
        while (it.hasNext()) {
            FlightRowSlice flightRowSlice = (FlightRowSlice) AbstractC0878AGe.A0A(i, it.next().slices);
            arrayListA0i.add((flightRowSlice == null || (flightTimestamp = flightRowSlice.depart) == null) ? null : flightTimestamp.dateString);
        }
        return (String) AbstractC0878AGe.A0K(C3cG.A0m(arrayListA0i));
    }

    public static final String flightNumbers(FlightRowSlice flightRowSlice, String str) {
        AnonymousClass003.A0u(flightRowSlice, str);
        List<FlightRowSegment> list = flightRowSlice.segments;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<FlightRowSegment> it = list.iterator();
        while (it.hasNext()) {
            String str2 = it.next().flight;
            if (str2 != null) {
                arrayListA0h.add(str2);
            }
        }
        String strA0L = AbstractC0878AGe.A0L(str, "", "", arrayListA0h, null);
        if (strA0L.length() > 0) {
            return strA0L;
        }
        return null;
    }

    public static final String route(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        return FlightTimeLabelKt.flightRoute(flightRowSlice, bfm, AnonymousClass006.A0E(flightRowSlice, i));
    }

    public static final String stopsLabel(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        return FlightStopsLabelKt.flightStopsLabel(flightRowSlice, bfm, AnonymousClass006.A0E(flightRowSlice, i));
    }

    public static final String stopsWithAirports(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        return FlightStopsLabelKt.flightStopsWithAirports(flightRowSlice, bfm, AnonymousClass006.A0E(flightRowSlice, i));
    }

    public static final String travelersSummary(FlightResults flightResults, String str, BFM bfm, int i) {
        int travelers = flightResults.getTravelers();
        Integer numValueOf = Integer.valueOf(travelers);
        String strA0Y = null;
        if (travelers <= 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            bfm.AgE(-150408799);
        } else {
            bfm.AgE(-150408798);
            strA0Y = AnonymousClass007.A0Y(numValueOf.intValue(), bfm, R.plurals._name_removed__res_0x7f10002d);
        }
        AnonymousClass001.A1D(bfm);
        if (str == null) {
            str = flightResults.listSubtitle;
        }
        return detailPair(str, strA0Y, bfm, 0);
    }
}

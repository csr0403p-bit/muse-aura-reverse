package com.facebook.aura.flights;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;
import com.facebook.aura.model.GenericListPresentation;
import com.facebook.aura.model.GenericListRow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class FlightResultsKt {
    public static final FlightResults flightResults(GenericListPresentation genericListPresentation, String str) {
        AnonymousClass003.A0u(genericListPresentation, str);
        if (!isFlightResults(genericListPresentation)) {
            return null;
        }
        List<GenericListRow> list = genericListPresentation.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<GenericListRow> it = list.iterator();
        while (it.hasNext()) {
            FlightRowData flightRowData = it.next().flight;
            if (flightRowData != null) {
                arrayListA0h.add(flightRowData);
            }
        }
        return new FlightResults(str, genericListPresentation.title, genericListPresentation.subtitle, arrayListA0h, selectionStage(arrayListA0h));
    }

    public static final boolean isFlightResults(GenericListPresentation genericListPresentation) {
        C7384Etj.A0Y(genericListPresentation, 0);
        if (!genericListPresentation.items.isEmpty()) {
            List<GenericListRow> list = genericListPresentation.items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<GenericListRow> it = list.iterator();
                while (it.hasNext()) {
                    FlightRowData flightRowData = it.next().flight;
                    if (flightRowData == null || !isListable(flightRowData)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean isMultiCity(FlightRowData flightRowData) {
        C7384Etj.A0Y(flightRowData, 0);
        return flightRowData.slices.size() > 2 || (flightRowData.slices.size() == 2 && !C7384Etj.areEqual(((FlightRowSlice) AbstractC0878AGe.A0H(flightRowData.slices)).to, ((FlightRowSlice) AbstractC0878AGe.A0F(flightRowData.slices)).from));
    }

    public static final boolean isSameFlightAs(FlightRowSlice flightRowSlice, FlightRowSlice flightRowSlice2) {
        boolean zA1a = AnonymousClass002.A1a(flightRowSlice, flightRowSlice2);
        if (!flightRowSlice.segments.isEmpty()) {
            List<FlightRowSegment> list = flightRowSlice.segments;
            ArrayList arrayListA0m = AnonymousClass002.A0m(list);
            Iterator<FlightRowSegment> it = list.iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                FlightRowSegment next = it.next();
                String str2 = next.flight;
                FlightTimestamp flightTimestamp = next.depart;
                if (flightTimestamp != null) {
                    str = flightTimestamp.longTimestampString;
                }
                AnonymousClass002.A1J(str2, str, arrayListA0m);
            }
            List<FlightRowSegment> list2 = flightRowSlice2.segments;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
            for (FlightRowSegment flightRowSegment : list2) {
                String str3 = flightRowSegment.flight;
                FlightTimestamp flightTimestamp2 = flightRowSegment.depart;
                AnonymousClass002.A1J(str3, flightTimestamp2 != null ? flightTimestamp2.longTimestampString : null, arrayListA0m2);
            }
            if (arrayListA0m.equals(arrayListA0m2)) {
                return zA1a;
            }
        }
        return false;
    }

    public static final boolean isListable(FlightRowData flightRowData) {
        return flightRowData.id.length() > 0 && !flightRowData.slices.isEmpty() && flightRowData.sliceIndex == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        if (r5 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.flights.FlightSelectionStage selectionStage(java.util.List<com.facebook.aura.model.FlightRowData> r6) {
        /*
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto Ld
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Ld
        La:
            com.facebook.aura.flights.FlightSelectionStage r0 = com.facebook.aura.flights.FlightSelectionStage.DEPARTING
            return r0
        Ld:
            java.util.Iterator r2 = r6.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La
            java.lang.Object r0 = r2.next()
            com.facebook.aura.model.FlightRowData r0 = (com.facebook.aura.model.FlightRowData) r0
            com.facebook.aura.model.FlightRowSelectionStage r1 = r0.selectionStage
            com.facebook.aura.model.FlightRowSelectionStage r0 = com.facebook.aura.model.FlightRowSelectionStage.OUTBOUND
            if (r1 == r0) goto L11
            if (r5 == 0) goto L2e
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L2e
        L2b:
            com.facebook.aura.flights.FlightSelectionStage r0 = com.facebook.aura.flights.FlightSelectionStage.RETURNING
            return r0
        L2e:
            java.util.Iterator r4 = r6.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r2 = r4.next()
            com.facebook.aura.model.FlightRowData r2 = (com.facebook.aura.model.FlightRowData) r2
            com.facebook.aura.model.FlightRowSelectionStage r1 = r2.selectionStage
            com.facebook.aura.model.FlightRowSelectionStage r0 = com.facebook.aura.model.FlightRowSelectionStage.RETURN
            r3 = 1
            if (r1 != r0) goto L4e
            java.util.List<com.facebook.aura.model.FlightRowSlice> r0 = r2.slices
            int r0 = r0.size()
            if (r0 <= r3) goto L4e
            goto L32
        L4e:
            if (r5 == 0) goto L5d
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L5d
        L56:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L77
            goto La
        L5d:
            java.util.Iterator r1 = r6.iterator()
        L61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r1.next()
            com.facebook.aura.model.FlightRowData r0 = (com.facebook.aura.model.FlightRowData) r0
            com.facebook.aura.model.FlightRowSelectionStage r0 = r0.selectionStage
            if (r0 == 0) goto L61
        L71:
            com.facebook.aura.flights.FlightSelectionStage r0 = com.facebook.aura.flights.FlightSelectionStage.COMPLETE
            return r0
        L74:
            if (r5 == 0) goto L77
            goto L56
        L77:
            java.util.Iterator r2 = r6.iterator()
        L7b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La
            java.lang.Object r1 = r2.next()
            com.facebook.aura.model.FlightRowData r1 = (com.facebook.aura.model.FlightRowData) r1
            java.util.List<com.facebook.aura.model.FlightRowSlice> r0 = r1.slices
            int r0 = r0.size()
            if (r0 != r3) goto L71
            java.lang.String r0 = r1.price
            if (r0 != 0) goto L71
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.flights.FlightResultsKt.selectionStage(java.util.List):com.facebook.aura.flights.FlightSelectionStage");
    }

    public static final List<String> tripStops(FlightRowData flightRowData) {
        ArrayList arrayListA0y = C3cI.A0y(flightRowData);
        for (FlightRowSlice flightRowSlice : flightRowData.slices) {
            if (!C7384Etj.areEqual(AbstractC0878AGe.A0I(arrayListA0y), flightRowSlice.from)) {
                arrayListA0y.add(flightRowSlice.from);
            }
            arrayListA0y.add(flightRowSlice.to);
        }
        if (arrayListA0y.size() > 1 && C7384Etj.areEqual(AbstractC0878AGe.A0H(arrayListA0y), AbstractC0878AGe.A0F(arrayListA0y))) {
            arrayListA0y.remove(arrayListA0y.size() - 1);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0y.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return arrayListA0h;
    }
}

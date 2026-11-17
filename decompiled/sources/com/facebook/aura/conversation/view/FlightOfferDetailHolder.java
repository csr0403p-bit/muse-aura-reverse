package com.facebook.aura.conversation.view;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.memory.AuraMemoryBudget;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSlice;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FlightOfferDetailHolder {
    public static final int $stable = 0;
    public static final FlightOfferDetailHolder INSTANCE = new FlightOfferDetailHolder();
    public static final AuraByteLruCache<String, FlightRowData> cache;

    public final FlightRowData get(String str) {
        C7384Etj.A0Y(str, 0);
        return cache.get(str);
    }

    public final void put(FlightRowData flightRowData) {
        C7384Etj.A0Y(flightRowData, 0);
        String str = flightRowData.id;
        if (str.length() != 0) {
            cache.put(str, flightRowData);
        }
    }

    static {
        long j = 0;
        cache = new AuraByteLruCache<>(8, 262144L, j, true, j, FlightOfferDetailHolder$cache$1.INSTANCE, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long estimatedWeightBytes(FlightRowData flightRowData) {
        Iterator it = Arrays.asList(flightRowData.id, flightRowData.airline, flightRowData.price, flightRowData.duration, flightRowData.responseMessage, flightRowData.flightLink, flightRowData.ctaText).iterator();
        long jStringBytes = 0;
        while (it.hasNext()) {
            jStringBytes += AuraMemoryBudget.INSTANCE.stringBytes(AnonymousClass005.A0j(it));
        }
        long j = jStringBytes + 256;
        Iterator<String> it2 = flightRowData.icons.iterator();
        long jStringBytes2 = 0;
        while (it2.hasNext()) {
            jStringBytes2 += AuraMemoryBudget.INSTANCE.stringBytes(AnonymousClass005.A0j(it2));
        }
        long j2 = j + jStringBytes2;
        long j3 = 0;
        for (FlightRowSlice flightRowSlice : flightRowData.slices) {
            Iterator it3 = Arrays.asList(flightRowSlice.from, flightRowSlice.to, flightRowSlice.duration, flightRowSlice.cabin, flightRowSlice.fareBrand).iterator();
            long jStringBytes3 = 0;
            while (it3.hasNext()) {
                jStringBytes3 += AuraMemoryBudget.INSTANCE.stringBytes(AnonymousClass005.A0j(it3));
            }
            long j4 = 256 + jStringBytes3;
            long j5 = 0;
            for (FlightRowSegment flightRowSegment : flightRowSlice.segments) {
                Iterator it4 = Arrays.asList(flightRowSegment.from, flightRowSegment.to, flightRowSegment.duration, flightRowSegment.flight, flightRowSegment.carrier, flightRowSegment.airlineIcon, flightRowSegment.operatingCarrier, flightRowSegment.operatingFlight).iterator();
                long jStringBytes4 = 0;
                while (it4.hasNext()) {
                    jStringBytes4 += AuraMemoryBudget.INSTANCE.stringBytes(AnonymousClass005.A0j(it4));
                }
                j5 += 256 + jStringBytes4;
            }
            j3 += j4 + j5;
        }
        return j2 + j3;
    }

    public final void clear() {
        cache.clear();
    }
}

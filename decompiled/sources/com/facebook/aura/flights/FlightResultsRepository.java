package com.facebook.aura.flights;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSlice;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class FlightResultsRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AuraByteLruCache<String, FlightResults> cache;

    public final FlightResults departingOptionsFor(FlightRowSlice flightRowSlice) {
        Object objPrevious;
        C7384Etj.A0Y(flightRowSlice, 0);
        ListIterator listIteratorA0n = C3cG.A0n(this.cache.values());
        loop0: while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIteratorA0n.previous();
            FlightResults flightResults = (FlightResults) objPrevious;
            if (flightResults.stage == FlightSelectionStage.DEPARTING) {
                List<FlightRowData> list = flightResults.offers;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<FlightRowData> it = list.iterator();
                    while (it.hasNext()) {
                        FlightRowSlice flightRowSlice2 = (FlightRowSlice) AbstractC0878AGe.A0G(it.next().slices);
                        if (flightRowSlice2 != null && FlightResultsKt.isSameFlightAs(flightRowSlice2, flightRowSlice)) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (FlightResults) objPrevious;
    }

    public final FlightResults get(String str) {
        C7384Etj.A0Y(str, 0);
        return this.cache.get(str);
    }

    public final void put(FlightResults flightResults) {
        C7384Etj.A0Y(flightResults, 0);
        this.cache.put(flightResults.presentationId, flightResults);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cache.close();
    }

    public final class Companion {
        public final FlightResultsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (FlightResultsRepository) abstractC3358CGz.A03(FlightResultsRepository.class, FlightResultsRepository$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ FlightResultsRepository(C06H c06h) {
        this();
    }

    public FlightResultsRepository() {
        long j = 0;
        this.cache = new AuraByteLruCache<>(8, 524288L, j, true, j, FlightResultsRepository$cache$1.INSTANCE, 20, null);
    }
}

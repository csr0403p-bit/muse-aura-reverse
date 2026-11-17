package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelResultsCollection extends C06G {
    public static final int $stable = 0;
    public final AHD<HotelResultsEntry> entries;
    public final boolean refreshFailed;
    public final HotelResults results;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResultsCollection) {
                HotelResultsCollection hotelResultsCollection = (HotelResultsCollection) obj;
                if (!C7384Etj.areEqual(this.results, hotelResultsCollection.results) || !C7384Etj.areEqual(this.entries, hotelResultsCollection.entries) || this.refreshFailed != hotelResultsCollection.refreshFailed) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelResultsCollection copy$default(HotelResultsCollection hotelResultsCollection, HotelResults hotelResults, AHD ahd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelResults = hotelResultsCollection.results;
        }
        if ((i & 2) != 0) {
            ahd = hotelResultsCollection.entries;
        }
        if ((i & 4) != 0) {
            z = hotelResultsCollection.refreshFailed;
        }
        return hotelResultsCollection.copy(hotelResults, ahd, z);
    }

    public final HotelResults component1() {
        return this.results;
    }

    public final AHD<HotelResultsEntry> component2() {
        return this.entries;
    }

    public final boolean component3() {
        return this.refreshFailed;
    }

    public final AHD<HotelResultsEntry> getEntries() {
        return this.entries;
    }

    public final boolean getRefreshFailed() {
        return this.refreshFailed;
    }

    public final HotelResults getResults() {
        return this.results;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.entries, AnonymousClass005.A0E(this.results)), this.refreshFailed);
    }

    public HotelResultsCollection(HotelResults hotelResults, AHD<HotelResultsEntry> ahd, boolean z) {
        AnonymousClass003.A0u(hotelResults, ahd);
        this.results = hotelResults;
        this.entries = ahd;
        this.refreshFailed = z;
    }

    public final HotelResultsCollection copy(HotelResults hotelResults, AHD<HotelResultsEntry> ahd, boolean z) {
        AnonymousClass003.A0u(hotelResults, ahd);
        return new HotelResultsCollection(hotelResults, ahd, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelResultsCollection(HotelResults hotelResults, AHD ahd, boolean z, int i, C06H c06h) {
        this(hotelResults, ahd, AnonymousClass005.A1O(i, z));
    }
}

package com.facebook.aura.flights;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.model.FlightRowData;
import java.util.Map;

/* loaded from: classes2.dex */
public final class FlightDetail extends C06G {
    public static final int $stable = 0;
    public final Map<Integer, String> changeTargets;
    public final int displayedSliceIndex;
    public final FlightFarePrice farePrice;
    public final FlightRowData offer;
    public final FlightDetailPrimaryAction primaryAction;
    public final FlightResults results;
    public final boolean showsDetails;

    public static /* synthetic */ FlightDetail copy$default(FlightDetail flightDetail, FlightResults flightResults, FlightRowData flightRowData, FlightDetailPrimaryAction flightDetailPrimaryAction, Map map, int i, FlightFarePrice flightFarePrice, boolean z, int i2, Object obj) {
        FlightResults flightResults2 = flightResults;
        FlightRowData flightRowData2 = flightRowData;
        FlightDetailPrimaryAction flightDetailPrimaryAction2 = flightDetailPrimaryAction;
        Map map2 = map;
        int i3 = i;
        FlightFarePrice flightFarePrice2 = flightFarePrice;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            flightResults2 = flightDetail.results;
        }
        if ((i2 & 2) != 0) {
            flightRowData2 = flightDetail.offer;
        }
        if ((i2 & 4) != 0) {
            flightDetailPrimaryAction2 = flightDetail.primaryAction;
        }
        if ((i2 & 8) != 0) {
            map2 = flightDetail.changeTargets;
        }
        if ((i2 & 16) != 0) {
            i3 = flightDetail.displayedSliceIndex;
        }
        if ((i2 & 32) != 0) {
            flightFarePrice2 = flightDetail.farePrice;
        }
        if ((i2 & 64) != 0) {
            z2 = flightDetail.showsDetails;
        }
        AnonymousClass005.A0y(flightResults2, flightRowData2, map2);
        return new FlightDetail(flightResults2, flightRowData2, flightDetailPrimaryAction2, map2, i3, flightFarePrice2, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightDetail) {
                FlightDetail flightDetail = (FlightDetail) obj;
                if (!C7384Etj.areEqual(this.results, flightDetail.results) || !C7384Etj.areEqual(this.offer, flightDetail.offer) || !C7384Etj.areEqual(this.primaryAction, flightDetail.primaryAction) || !C7384Etj.areEqual(this.changeTargets, flightDetail.changeTargets) || this.displayedSliceIndex != flightDetail.displayedSliceIndex || !C7384Etj.areEqual(this.farePrice, flightDetail.farePrice) || this.showsDetails != flightDetail.showsDetails) {
                }
            }
            return false;
        }
        return true;
    }

    public final FlightResults component1() {
        return this.results;
    }

    public final FlightRowData component2() {
        return this.offer;
    }

    public final FlightDetailPrimaryAction component3() {
        return this.primaryAction;
    }

    public final Map<Integer, String> component4() {
        return this.changeTargets;
    }

    public final int component5() {
        return this.displayedSliceIndex;
    }

    public final FlightFarePrice component6() {
        return this.farePrice;
    }

    public final boolean component7() {
        return this.showsDetails;
    }

    public final Map<Integer, String> getChangeTargets() {
        return this.changeTargets;
    }

    public final int getDisplayedSliceIndex() {
        return this.displayedSliceIndex;
    }

    public final FlightFarePrice getFarePrice() {
        return this.farePrice;
    }

    public final FlightRowData getOffer() {
        return this.offer;
    }

    public final FlightDetailPrimaryAction getPrimaryAction() {
        return this.primaryAction;
    }

    public final FlightResults getResults() {
        return this.results;
    }

    public final boolean getShowsDetails() {
        return this.showsDetails;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0F(this.changeTargets, (AnonymousClass005.A0F(this.offer, AnonymousClass005.A0E(this.results)) + AnonymousClass006.A0D(this.primaryAction)) * 31) + this.displayedSliceIndex) * 31) + C3cH.A02(this.farePrice)) * 31, this.showsDetails);
    }

    public FlightDetail(FlightResults flightResults, FlightRowData flightRowData, FlightDetailPrimaryAction flightDetailPrimaryAction, Map<Integer, String> map, int i, FlightFarePrice flightFarePrice, boolean z) {
        AnonymousClass005.A0y(flightResults, flightRowData, map);
        this.results = flightResults;
        this.offer = flightRowData;
        this.primaryAction = flightDetailPrimaryAction;
        this.changeTargets = map;
        this.displayedSliceIndex = i;
        this.farePrice = flightFarePrice;
        this.showsDetails = z;
    }

    public final FlightDetail copy(FlightResults flightResults, FlightRowData flightRowData, FlightDetailPrimaryAction flightDetailPrimaryAction, Map<Integer, String> map, int i, FlightFarePrice flightFarePrice, boolean z) {
        AnonymousClass005.A0y(flightResults, flightRowData, map);
        return new FlightDetail(flightResults, flightRowData, flightDetailPrimaryAction, map, i, flightFarePrice, z);
    }

    public String toString() {
        return super.toString();
    }
}

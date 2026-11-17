package com.facebook.aura.flights;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSlice;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class FlightResults extends C06G {
    public static final int $stable = 0;
    public final String listSubtitle;
    public final String listTitle;
    public final List<FlightRowData> offers;
    public final String presentationId;
    public final FlightSelectionStage stage;

    public FlightResults(String str, String str2, String str3, List<FlightRowData> list, FlightSelectionStage flightSelectionStage) {
        AnonymousClass005.A12(str, list, flightSelectionStage, 0);
        this.presentationId = str;
        this.listTitle = str2;
        this.listSubtitle = str3;
        this.offers = list;
        this.stage = flightSelectionStage;
    }

    public final FlightResults copy(String str, String str2, String str3, List<FlightRowData> list, FlightSelectionStage flightSelectionStage) {
        AnonymousClass005.A12(str, list, flightSelectionStage, 0);
        return new FlightResults(str, str2, str3, list, flightSelectionStage);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightResults) {
                FlightResults flightResults = (FlightResults) obj;
                if (!C7384Etj.areEqual(this.presentationId, flightResults.presentationId) || !C7384Etj.areEqual(this.listTitle, flightResults.listTitle) || !C7384Etj.areEqual(this.listSubtitle, flightResults.listSubtitle) || !C7384Etj.areEqual(this.offers, flightResults.offers) || this.stage != flightResults.stage) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightResults copy$default(FlightResults flightResults, String str, String str2, String str3, List list, FlightSelectionStage flightSelectionStage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightResults.presentationId;
        }
        if ((i & 2) != 0) {
            str2 = flightResults.listTitle;
        }
        if ((i & 4) != 0) {
            str3 = flightResults.listSubtitle;
        }
        if ((i & 8) != 0) {
            list = flightResults.offers;
        }
        if ((i & 16) != 0) {
            flightSelectionStage = flightResults.stage;
        }
        return flightResults.copy(str, str2, str3, list, flightSelectionStage);
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component2() {
        return this.listTitle;
    }

    public final String component3() {
        return this.listSubtitle;
    }

    public final List<FlightRowData> component4() {
        return this.offers;
    }

    public final FlightSelectionStage component5() {
        return this.stage;
    }

    public final FlightRowSlice getDepartingSlice() {
        Object objA0F = AbstractC0878AGe.A0F(((FlightRowData) AbstractC0878AGe.A0F(this.offers)).slices);
        if (this.stage != FlightSelectionStage.RETURNING) {
            objA0F = null;
        }
        return (FlightRowSlice) objA0F;
    }

    public final FlightRowSlice getFocusSlice() {
        return ((FlightRowData) AbstractC0878AGe.A0F(this.offers)).slices.get(getFocusSliceIndex());
    }

    public final int getFocusSliceIndex() {
        return AnonymousClass002.A1Z(this.stage, FlightSelectionStage.RETURNING) ? 1 : 0;
    }

    public final String getListSubtitle() {
        return this.listSubtitle;
    }

    public final String getListTitle() {
        return this.listTitle;
    }

    public final List<FlightRowData> getOffers() {
        return this.offers;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final FlightSelectionStage getStage() {
        return this.stage;
    }

    public final int getTravelers() {
        Iterator<FlightRowData> it = this.offers.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i = it.next().passengerCount;
        while (true) {
            int i2 = i;
            while (it.hasNext()) {
                i = it.next().passengerCount;
                if (i2 < i) {
                    break;
                }
            }
            return i2;
        }
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.stage, AnonymousClass005.A0F(this.offers, (((AnonymousClass001.A0G(this.presentationId) + AnonymousClass006.A0G(this.listTitle)) * 31) + AnonymousClass005.A0H(this.listSubtitle)) * 31));
    }

    public final boolean isMultiCity() {
        return this.stage == FlightSelectionStage.COMPLETE && FlightResultsKt.isMultiCity((FlightRowData) AbstractC0878AGe.A0F(this.offers));
    }

    public final boolean isOneWay() {
        if (this.stage != FlightSelectionStage.COMPLETE) {
            return false;
        }
        List<FlightRowData> list = this.offers;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<FlightRowData> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().slices.size() != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }
}

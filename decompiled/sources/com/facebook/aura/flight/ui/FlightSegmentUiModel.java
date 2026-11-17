package com.facebook.aura.flight.ui;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class FlightSegmentUiModel extends C06G {
    public static final int $stable = 0;
    public final String airlineIconUrl;
    public final String arriving;
    public final String departing;
    public final List<FlightDetailRow> detailRows;
    public final List<String> secondaryLines;
    public final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    public FlightSegmentUiModel() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, null, null, c0881AGi, c0881AGi, null);
    }

    public final FlightSegmentUiModel copy(String str, String str2, String str3, List<String> list, List<FlightDetailRow> list2, String str4) {
        AnonymousClass002.A1C(list, 3, list2);
        return new FlightSegmentUiModel(str, str2, str3, list, list2, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightSegmentUiModel) {
                FlightSegmentUiModel flightSegmentUiModel = (FlightSegmentUiModel) obj;
                if (!C7384Etj.areEqual(this.title, flightSegmentUiModel.title) || !C7384Etj.areEqual(this.departing, flightSegmentUiModel.departing) || !C7384Etj.areEqual(this.arriving, flightSegmentUiModel.arriving) || !C7384Etj.areEqual(this.secondaryLines, flightSegmentUiModel.secondaryLines) || !C7384Etj.areEqual(this.detailRows, flightSegmentUiModel.detailRows) || !C7384Etj.areEqual(this.airlineIconUrl, flightSegmentUiModel.airlineIconUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSegmentUiModel copy$default(FlightSegmentUiModel flightSegmentUiModel, String str, String str2, String str3, List list, List list2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightSegmentUiModel.title;
        }
        if ((i & 2) != 0) {
            str2 = flightSegmentUiModel.departing;
        }
        if ((i & 4) != 0) {
            str3 = flightSegmentUiModel.arriving;
        }
        if ((i & 8) != 0) {
            list = flightSegmentUiModel.secondaryLines;
        }
        if ((i & 16) != 0) {
            list2 = flightSegmentUiModel.detailRows;
        }
        if ((i & 32) != 0) {
            str4 = flightSegmentUiModel.airlineIconUrl;
        }
        return flightSegmentUiModel.copy(str, str2, str3, list, list2, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.departing;
    }

    public final String component3() {
        return this.arriving;
    }

    public final List<String> component4() {
        return this.secondaryLines;
    }

    public final List<FlightDetailRow> component5() {
        return this.detailRows;
    }

    public final String component6() {
        return this.airlineIconUrl;
    }

    public final String getAirlineIconUrl() {
        return this.airlineIconUrl;
    }

    public final String getArriving() {
        return this.arriving;
    }

    public final String getDeparting() {
        return this.departing;
    }

    public final List<FlightDetailRow> getDetailRows() {
        return this.detailRows;
    }

    public final boolean getHasRenderableContent() {
        return (this.title == null && this.departing == null && this.arriving == null && this.secondaryLines.isEmpty() && this.detailRows.isEmpty() && this.airlineIconUrl == null) ? false : true;
    }

    public final List<String> getSecondaryLines() {
        return this.secondaryLines;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.detailRows, AnonymousClass005.A0F(this.secondaryLines, ((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.departing)) * 31) + AnonymousClass006.A0G(this.arriving)) * 31)) + AnonymousClass005.A0H(this.airlineIconUrl);
    }

    public String toString() {
        return super.toString();
    }

    public FlightSegmentUiModel(String str, String str2, String str3, List<String> list, List<FlightDetailRow> list2, String str4) {
        AnonymousClass002.A1C(list, 3, list2);
        this.title = str;
        this.departing = str2;
        this.arriving = str3;
        this.secondaryLines = list;
        this.detailRows = list2;
        this.airlineIconUrl = str4;
    }

    public /* synthetic */ FlightSegmentUiModel(String str, String str2, String str3, List list, List list2, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? C0881AGi.A00 : list2, (i & 32) != 0 ? null : str4);
    }
}

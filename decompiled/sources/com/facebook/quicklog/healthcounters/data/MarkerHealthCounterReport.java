package com.facebook.quicklog.healthcounters.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class MarkerHealthCounterReport extends C06G {
    public final List<MarkerHealthCounter> counters;
    public final long lossCount;

    public MarkerHealthCounterReport(List<MarkerHealthCounter> list, long j) {
        C7384Etj.A0Y(list, 0);
        this.counters = list;
        this.lossCount = j;
    }

    public final MarkerHealthCounterReport copy(List<MarkerHealthCounter> list, long j) {
        C7384Etj.A0Y(list, 0);
        return new MarkerHealthCounterReport(list, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarkerHealthCounterReport) {
                MarkerHealthCounterReport markerHealthCounterReport = (MarkerHealthCounterReport) obj;
                if (!C7384Etj.areEqual(this.counters, markerHealthCounterReport.counters) || this.lossCount != markerHealthCounterReport.lossCount) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarkerHealthCounterReport copy$default(MarkerHealthCounterReport markerHealthCounterReport, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = markerHealthCounterReport.counters;
        }
        if ((i & 2) != 0) {
            j = markerHealthCounterReport.lossCount;
        }
        C7384Etj.A0Y(list, 0);
        return new MarkerHealthCounterReport(list, j);
    }

    public final List<MarkerHealthCounter> component1() {
        return this.counters;
    }

    public final long component2() {
        return this.lossCount;
    }

    public final List<MarkerHealthCounter> getCounters() {
        return this.counters;
    }

    public final long getLossCount() {
        return this.lossCount;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.lossCount, AnonymousClass005.A0E(this.counters));
    }

    public String toString() {
        return super.toString();
    }
}

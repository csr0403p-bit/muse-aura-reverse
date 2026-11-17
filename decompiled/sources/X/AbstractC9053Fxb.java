package X;

import android.health.connect.AggregateRecordsRequest;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.ReadRecordsRequestUsingFilters;
import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.TimeRangeFilter;
import android.health.connect.changelog.ChangeLogTokenRequest;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.Record;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Fxb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9053Fxb {
    public static final AggregateRecordsRequest<Object> A00(C9029FxA c9029FxA) {
        C7384Etj.A0Y(c9029FxA, 0);
        AggregateRecordsRequest.Builder builder = new AggregateRecordsRequest.Builder(A03(c9029FxA.A00));
        Iterator<C9012Fwp> it = c9029FxA.A02.iterator();
        while (it.hasNext()) {
            builder.addDataOriginsFilter(AbstractC9083FyA.A00(it.next()));
        }
        Set<C8993FwW<?>> set = c9029FxA.A03;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<C8993FwW<?>> it2 = set.iterator();
        while (it2.hasNext()) {
            AbstractC7610F5x.A1P(arrayListA0h, it2);
        }
        Iterator it3 = arrayListA0h.iterator();
        while (it3.hasNext()) {
            builder.addAggregationType(A05((C8993FwW) it3.next()));
        }
        AggregateRecordsRequest<Object> aggregateRecordsRequestBuild = builder.build();
        C7384Etj.A0U(aggregateRecordsRequestBuild);
        return aggregateRecordsRequestBuild;
    }

    public static final AggregateRecordsRequest<Object> A01(C9031FxC c9031FxC) {
        C7384Etj.A0Y(c9031FxC, 0);
        AggregateRecordsRequest.Builder builder = new AggregateRecordsRequest.Builder(A03(c9031FxC.A00));
        Iterator<C9012Fwp> it = c9031FxC.A01.iterator();
        while (it.hasNext()) {
            builder.addDataOriginsFilter(AbstractC9083FyA.A00(it.next()));
        }
        Set<C8993FwW<?>> set = c9031FxC.A02;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<C8993FwW<?>> it2 = set.iterator();
        while (it2.hasNext()) {
            AbstractC7610F5x.A1P(arrayListA0h, it2);
        }
        Iterator it3 = arrayListA0h.iterator();
        while (it3.hasNext()) {
            builder.addAggregationType(A05((C8993FwW) it3.next()));
        }
        AggregateRecordsRequest<Object> aggregateRecordsRequestBuild = builder.build();
        C7384Etj.A0U(aggregateRecordsRequestBuild);
        return aggregateRecordsRequestBuild;
    }

    public static final ReadRecordsRequestUsingFilters<? extends Record> A02(C9042FxO<? extends InterfaceC9011Fwo> c9042FxO) {
        C7384Etj.A0Y(c9042FxO, 0);
        ReadRecordsRequestUsingFilters.Builder pageSize = new ReadRecordsRequestUsingFilters.Builder(AbstractC9045FxR.A00(c9042FxO.A05)).setTimeRangeFilter(A03(c9042FxO.A02)).setPageSize(c9042FxO.A01);
        Iterator<C9012Fwp> it = c9042FxO.A04.iterator();
        while (it.hasNext()) {
            pageSize.addDataOrigins(AbstractC9083FyA.A00(it.next()));
        }
        String str = c9042FxO.A03;
        if (str != null) {
            pageSize.setPageToken(Long.parseLong(str));
        } else {
            pageSize.setAscending(c9042FxO.A06);
        }
        ReadRecordsRequestUsingFilters<? extends Record> readRecordsRequestUsingFiltersBuild = pageSize.build();
        C7384Etj.A0U(readRecordsRequestUsingFiltersBuild);
        return readRecordsRequestUsingFiltersBuild;
    }

    public static final ChangeLogTokenRequest A04(FvW fvW) {
        C7384Etj.A0Y(fvW, 0);
        ChangeLogTokenRequest.Builder builder = new ChangeLogTokenRequest.Builder();
        Iterator<C9012Fwp> it = fvW.A00.iterator();
        while (it.hasNext()) {
            builder.addDataOriginFilter(AbstractC9083FyA.A00(it.next()));
        }
        Iterator<C9uG<? extends InterfaceC9011Fwo>> it2 = fvW.A01.iterator();
        while (it2.hasNext()) {
            builder.addRecordType(AbstractC9045FxR.A00(it2.next()));
        }
        ChangeLogTokenRequest changeLogTokenRequestBuild = builder.build();
        C7384Etj.A0U(changeLogTokenRequestBuild);
        return changeLogTokenRequestBuild;
    }

    public static final AggregationType<Object> A05(C8993FwW<? extends Object> c8993FwW) {
        C7384Etj.A0Y(c8993FwW, 0);
        AggregationType<Double> aggregationType = AbstractC9047FxV.A00.get(c8993FwW);
        if (aggregationType == null && (aggregationType = (AggregationType) AbstractC9047FxV.A01.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A02.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A03.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A05.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A06.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A04.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A07.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A08.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A09.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A0A.get(c8993FwW)) == null && (aggregationType = (AggregationType) AbstractC9047FxV.A0B.get(c8993FwW)) == null) {
            throw C60Q.A0U("Unsupported aggregation type ", c8993FwW.A03());
        }
        return aggregationType;
    }

    public static final TimeRangeFilter A03(C9025Fx3 c9025Fx3) {
        LocalDateTime localDateTime = c9025Fx3.A03;
        TimeRangeFilter timeRangeFilterBuild = (localDateTime == null && c9025Fx3.A02 == null) ? new TimeInstantRangeFilter.Builder().setStartTime(c9025Fx3.A01).setEndTime(c9025Fx3.A00).build() : new LocalTimeRangeFilter.Builder().setStartTime(localDateTime).setEndTime(c9025Fx3.A02).build();
        C7384Etj.A0U(timeRangeFilterBuild);
        return timeRangeFilterBuild;
    }
}

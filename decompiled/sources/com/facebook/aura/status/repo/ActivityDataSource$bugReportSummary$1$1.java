package com.facebook.aura.status.repo;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ActivityDataSource$bugReportSummary$1$1 extends AbstractC7559F3s implements G0U<Map.Entry<? extends ActivityAction.ActivityStatus, ? extends Integer>, CharSequence> {
    public static final ActivityDataSource$bugReportSummary$1$1 INSTANCE = new ActivityDataSource$bugReportSummary$1$1();

    public ActivityDataSource$bugReportSummary$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<? extends ActivityAction.ActivityStatus, Integer> entry) {
        C7384Etj.A0Y(entry, 0);
        ActivityAction.ActivityStatus key = entry.getKey();
        int iA0F = AnonymousClass001.A0F(entry.getValue());
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(key);
        return C60P.A1O(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, sbA0w, iA0F);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends ActivityAction.ActivityStatus, ? extends Integer> entry) {
        return invoke2((Map.Entry<? extends ActivityAction.ActivityStatus, Integer>) entry);
    }
}

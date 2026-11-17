package X;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import java.util.Set;

/* renamed from: X.FyN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9096FyN extends C7438Evz implements G0U<AggregationType<Object>, Set<DataOrigin>> {
    public C9096FyN(Object obj) {
        super(1, obj, AggregateRecordsGroupedByDurationResponse.class, "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Set<DataOrigin> invoke(AggregationType<Object> aggregationType) {
        AggregationType<Object> aggregationType2 = aggregationType;
        return ((AggregateRecordsGroupedByDurationResponse) AnonymousClass006.A0o(aggregationType2, this)).getDataOrigins(aggregationType2);
    }
}

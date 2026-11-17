package X;

import android.health.connect.AggregateRecordsResponse;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import java.util.Set;

/* renamed from: X.FyO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9097FyO extends C7438Evz implements G0U<AggregationType<Object>, Set<DataOrigin>> {
    public C9097FyO(Object obj) {
        super(1, obj, AggregateRecordsResponse.class, "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Set<DataOrigin> invoke(AggregationType<Object> aggregationType) {
        AggregationType<Object> aggregationType2 = aggregationType;
        return ((AggregateRecordsResponse) AnonymousClass006.A0o(aggregationType2, this)).getDataOrigins(aggregationType2);
    }
}

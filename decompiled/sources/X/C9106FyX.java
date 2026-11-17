package X;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.datatypes.AggregationType;

/* renamed from: X.FyX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9106FyX extends C7438Evz implements G0U<AggregationType<Object>, Object> {
    public C9106FyX(Object obj) {
        super(1, obj, AggregateRecordsGroupedByDurationResponse.class, "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(AggregationType<Object> aggregationType) {
        AggregationType<Object> aggregationType2 = aggregationType;
        return ((AggregateRecordsGroupedByDurationResponse) AnonymousClass006.A0o(aggregationType2, this)).get(aggregationType2);
    }
}

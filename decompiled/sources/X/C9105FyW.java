package X;

import android.health.connect.AggregateRecordsResponse;
import android.health.connect.datatypes.AggregationType;

/* renamed from: X.FyW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9105FyW extends C7438Evz implements G0U<AggregationType<Object>, Object> {
    public C9105FyW(Object obj) {
        super(1, obj, AggregateRecordsResponse.class, "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(AggregationType<Object> aggregationType) {
        AggregationType<Object> aggregationType2 = aggregationType;
        return ((AggregateRecordsResponse) AnonymousClass006.A0o(aggregationType2, this)).get(aggregationType2);
    }
}

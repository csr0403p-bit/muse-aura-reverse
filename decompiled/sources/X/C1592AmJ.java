package X;

import android.content.Context;
import android.view.GestureDetector;
import kotlin.Unit;

/* renamed from: X.AmJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1592AmJ {
    public int A00 = 0;
    public boolean A01;
    public final GestureDetector A02;
    public final G0U<C1529Aki, Unit> A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C1592AmJ(Context context, G0U<? super C1529Aki, Unit> g0u) {
        this.A03 = g0u;
        this.A02 = new GestureDetector(context, new GestureDetectorOnGestureListenerC1591AmI(this));
    }
}

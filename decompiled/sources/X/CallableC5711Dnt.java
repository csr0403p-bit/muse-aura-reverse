package X;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.Dnt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC5711Dnt<V> implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public CallableC5711Dnt(float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = z;
        this.A05 = z2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A04 = z3;
        this.A03 = z4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        HashMap mapA0u = BV4.A0u();
        boolean z = this.A06;
        boolean z2 = this.A05;
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        boolean z3 = this.A04;
        boolean z4 = this.A03;
        BV9.A07(mapA0u, f, f2, z, z2);
        BV6.A1D("speed", mapA0u, f3);
        BV4.A1G("below_threshold_adjust", mapA0u, false);
        BV4.A1G("below_threshold_regular", mapA0u, z3);
        BV4.A1G("above_threshold_between_speeds", mapA0u, z4);
        return mapA0u;
    }
}

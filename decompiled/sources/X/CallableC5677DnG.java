package X;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.DnG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC5677DnG<V> implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ C1051ASv A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public CallableC5677DnG(C1051ASv c1051ASv, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A07 = z;
        this.A06 = z2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A05 = z3;
        this.A04 = z4;
        this.A03 = c1051ASv;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        HashMap mapA0u = BV4.A0u();
        boolean z = this.A07;
        boolean z2 = this.A06;
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        boolean z3 = this.A05;
        boolean z4 = this.A04;
        C1051ASv c1051ASv = this.A03;
        BV9.A07(mapA0u, f, f2, z, z2);
        BV6.A1D("speed", mapA0u, f3);
        BV4.A1G("below_threshold_adjust", mapA0u, false);
        BV4.A1G("below_threshold_regular", mapA0u, z3);
        BV4.A1G("above_threshold_between_speeds", mapA0u, z4);
        mapA0u.put("set_speed", Float.valueOf(c1051ASv.element));
        return mapA0u;
    }
}

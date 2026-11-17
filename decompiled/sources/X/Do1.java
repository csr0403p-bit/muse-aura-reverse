package X;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class Do1<V> implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public Do1(float f, float f2, float f3, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = z2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        HashMap mapA0u = BV4.A0u();
        boolean z = this.A04;
        boolean z2 = this.A03;
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        BV9.A07(mapA0u, f, f2, z, z2);
        BV6.A1D("speed", mapA0u, f3);
        BV4.A1G("below_threshold_adjust", mapA0u, true);
        return mapA0u;
    }
}

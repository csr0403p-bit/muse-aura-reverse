package X;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class C11 {
    public final float A00;
    public final int A01;
    public final long A02;
    public final Comparator<C0J> A03;
    public final Map<String, Long> A04 = BV4.A0u();
    public final Map<String, TreeSet<C0J>> A05 = BV4.A0u();

    /* JADX WARN: Incorrect types in method signature: (FJILjava/util/Comparator<LX/C0J;>;)V */
    public C11(Comparator comparator, float f, int i, long j) {
        this.A01 = i;
        this.A03 = comparator;
        this.A00 = (f <= 0.0f || f > 1.0f) ? 0.1f : f;
        this.A02 = j <= 0 ? 104857600L : j;
    }
}

package X;

/* loaded from: classes5.dex */
public final class EHU<V> {
    public long A00;
    public final long A01;
    public final V A02;

    public EHU(V v, long j) {
        this.A02 = v;
        long jNanoTime = System.nanoTime();
        this.A00 = jNanoTime;
        this.A01 = jNanoTime + j;
    }
}

package X;

/* loaded from: classes6.dex */
public abstract class GB6 implements Runnable, Comparable<GB6>, HsS, GBD {
    public static final String __redex_internal_original_name = "EventLoopImplBase$DelayedTask";
    public int A00;
    public long A01;
    public volatile Object _heap;

    @Override // X.HsS
    public final void dispose() {
        GBB gbb;
        synchronized (this) {
            Object obj = this._heap;
            HrH hrH = GBC.A01;
            if (obj != hrH) {
                if ((obj instanceof GBB) && (gbb = (GBB) obj) != null) {
                    synchronized (gbb) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof GB5) && ((GB5) obj2) != null) {
                            gbb.A02(this.A00);
                        }
                    }
                }
                this._heap = hrH;
            }
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(GB6 gb6) {
        long j = this.A01 - gb6.A01;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("Delayed[nanos=");
        sbA0x.append(this.A01);
        return BV5.A0o(sbA0x);
    }
}

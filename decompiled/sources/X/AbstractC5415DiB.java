package X;

/* renamed from: X.DiB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5415DiB extends AbstractC5411Di6 {
    public final long A00;

    public AbstractC5415DiB(C6154Dwx c6154Dwx, C1J c1j, C1O c1o, Object obj, int i, long j, long j2, long j3) {
        super(c6154Dwx, c1j, c1o, obj, 1, i, j, j2);
        c6154Dwx.getClass();
        this.A00 = j3;
    }

    public final long A00() {
        long j;
        long j2;
        if (this instanceof C5418DiE) {
            C5418DiE c5418DiE = (C5418DiE) this;
            j = ((AbstractC5415DiB) c5418DiE).A00;
            j2 = c5418DiE.A02;
        } else {
            j = this.A00;
            if (j == -1) {
                return -1L;
            }
            j2 = 1;
        }
        return j + j2;
    }

    public final boolean A01() {
        return this instanceof C5420DiG ? ((C5420DiG) this).A00 : ((C5418DiE) this).A01;
    }
}

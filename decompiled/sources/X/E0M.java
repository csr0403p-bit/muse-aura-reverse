package X;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class E0M extends AbstractC6252Dyv implements E0T {
    public long A00;
    public E0T A01;

    @Override // X.E0T
    public final List<E0J> AEJ(long j) {
        E0T e0t = this.A01;
        e0t.getClass();
        return e0t.AEJ(j - this.A00);
    }

    @Override // X.E0T
    public final long AFN(int i) {
        E0T e0t = this.A01;
        e0t.getClass();
        return e0t.AFN(i) + this.A00;
    }

    @Override // X.E0T
    public final int AFO() {
        E0T e0t = this.A01;
        e0t.getClass();
        return e0t.AFO();
    }

    @Override // X.E0T
    public final int AI2(long j) {
        E0T e0t = this.A01;
        e0t.getClass();
        return e0t.AI2(j - this.A00);
    }

    @Override // X.AbstractC6252Dyv
    public final void A02() {
        super.A02();
        this.A01 = null;
    }
}

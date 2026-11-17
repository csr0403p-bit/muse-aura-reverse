package X;

import X.AbstractC3582CVd;
import X.AbstractC3584CVf;

/* loaded from: classes5.dex */
public final class DM2<R extends AbstractC3582CVd<R>, S extends AbstractC3584CVf<R>> {
    public R A00;
    public R A01;
    public boolean A02;
    public final R A03;
    public final S A04;

    public DM2(S s) {
        R r = (R) s.A01();
        R r2 = (R) s.A01();
        R r3 = (R) s.A01();
        this.A02 = true;
        this.A04 = s;
        this.A00 = r;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = s.A02(r2) & true;
    }
}

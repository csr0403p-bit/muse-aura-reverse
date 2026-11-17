package X;

import kotlin.Unit;

/* renamed from: X.3uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C05593uc<T> extends AbstractC05583ub<T> {
    public final G0V<HyO<? super T>, HtJ<? super Unit>, Object> A00;

    @Override // X.AbstractC05583ub
    public Object A00(HyO<? super T> hyO, HtJ<? super Unit> htJ) {
        return C3cG.A0U(this.A00.invoke(hyO, htJ));
    }

    @Override // X.AbstractC05583ub
    public final String toString() {
        StringBuilder sb = new StringBuilder("block[");
        sb.append(this.A00);
        sb.append("] -> ");
        return AnonymousClass001.A0v(super.toString(), sb);
    }

    public C05593uc(Integer num, C78T c78t, G0V g0v, int i) {
        super(num, c78t, i);
        this.A00 = g0v;
    }
}

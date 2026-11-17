package X;

import java.util.Iterator;
import kotlin.Unit;

/* renamed from: X.3ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C05573ua<T> extends AbstractC05583ub<T> {
    public final Iterable<C20Q<T>> A00;

    @Override // X.AbstractC05583ub
    public final Object A00(HyO<? super T> hyO, HtJ<? super Unit> htJ) {
        C05613uf c05613uf = new C05613uf(hyO);
        Iterator<C20Q<T>> it = this.A00.iterator();
        while (it.hasNext()) {
            C60C c60c = new C60C((HtJ) null, it.next(), c05613uf);
            GAo.A02(C79.A00, C6ys.A00, c60c, hyO);
        }
        return Unit.INSTANCE;
    }

    @Override // X.AbstractC05583ub
    public final HxV<T> A01(C3UX c3ux) {
        C78T c78t = this.A02;
        int i = super.A00;
        G0V c60c = new C60C(this, (C1531Akn) null, (HtJ<? super C60C>) 3);
        Integer num = C79.A00;
        HuI huI = new HuI(GAr.A02(c78t, c3ux), AbstractC10623Hzj.A00(num, i));
        huI.A0U(num, huI, c60c);
        return huI;
    }

    public C05573ua(Integer num, Iterable iterable, C78T c78t, int i) {
        super(num, c78t, i);
        this.A00 = iterable;
    }
}

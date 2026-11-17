package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Bs3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3016Bs3<T> extends C2934BpC<T> {
    public C5304Dfn<AbstractC5306Dfp<?>, Bs2<?>> A00 = new C5304Dfn<>();

    @Override // X.AbstractC5306Dfp
    public void A03() {
        Iterator<Map.Entry<AbstractC5306Dfp<?>, Bs2<?>>> it = this.A00.iterator();
        while (it.hasNext()) {
            Bs2 bs2 = (Bs2) BV7.A0s(it);
            bs2.A01.A08(bs2);
        }
    }

    @Override // X.AbstractC5306Dfp
    public void A04() {
        Iterator<Map.Entry<AbstractC5306Dfp<?>, Bs2<?>>> it = this.A00.iterator();
        while (it.hasNext()) {
            Bs2 bs2 = (Bs2) BV7.A0s(it);
            bs2.A01.A07(bs2);
        }
    }

    public <S> void A0B(AbstractC5306Dfp<S> abstractC5306Dfp, Bs1<? super S> bs1) {
        if (abstractC5306Dfp == null) {
            throw BV4.A0a("source cannot be null");
        }
        Bs2<?> bs2 = new Bs2<>(abstractC5306Dfp, bs1);
        Bs2<?> bs2A02 = this.A00.A02(abstractC5306Dfp, bs2);
        if (bs2A02 != null) {
            if (bs2A02.A02 != bs1) {
                throw C60O.A0i("This source was already added with the different observer");
            }
        } else if (super.A00 > 0) {
            bs2.A01.A08(bs2);
        }
    }
}

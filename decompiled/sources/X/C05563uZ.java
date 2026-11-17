package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;

/* renamed from: X.3uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C05563uZ<T> extends AbstractC05583ub<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C05563uZ.class, "consumed$volatile");
    public final HxV<T> A00;
    public final boolean A01;
    public volatile /* synthetic */ int consumed$volatile;

    @Override // X.AbstractC05583ub
    public final Object A00(HyO<? super T> hyO, HtJ<? super Unit> htJ) throws Throwable {
        Object objA00 = Hu1.A00(htJ, this.A00, new C05613uf(hyO), this.A01);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    @Override // X.AbstractC05583ub
    public final HxV<T> A01(C3UX c3ux) {
        if (this.A01 && A02.getAndSet(this, 1) == 1) {
            throw C3cG.A0Q("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return super.A00 == -3 ? this.A00 : super.A01(c3ux);
    }

    @Override // X.AbstractC05583ub
    public final C20Q<T> A02() {
        HxV<T> hxV = this.A00;
        boolean z = this.A01;
        return new C05563uZ(C79.A00, C6ys.A00, hxV, -3, z);
    }

    @Override // X.AbstractC05583ub, X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<? super Unit> htJ) throws Throwable {
        Object objCollect;
        if (super.A00 == -3) {
            boolean z = this.A01;
            if (z && A02.getAndSet(this, 1) == 1) {
                throw C3cG.A0Q("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            objCollect = Hu1.A00(htJ, this.A00, c20z, z);
        } else {
            objCollect = super.collect(c20z, htJ);
        }
        return C3cG.A0U(objCollect);
    }

    public C05563uZ(Integer num, C78T c78t, HxV hxV, int i, boolean z) {
        super(num, c78t, i);
        this.A00 = hxV;
        this.A01 = z;
    }
}

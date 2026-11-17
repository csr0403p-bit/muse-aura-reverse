package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes6.dex */
public abstract class GBK extends HqU implements InterfaceC10590Hxd {
    public static final C9252GBf Key = new C9252GBf();

    public abstract void dispatch(C78T c78t, Runnable runnable);

    @Override // X.HqU, X.C78X, X.C78T
    public /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        E e;
        C7384Etj.A0Y(c78i, 1);
        if (c78i instanceof AbstractC9255GBi) {
            AbstractC9255GBi abstractC9255GBi = (AbstractC9255GBi) c78i;
            C78I<?> c78i2 = this.key;
            C7384Etj.A0Y(c78i2, 0);
            if ((c78i2 == abstractC9255GBi || abstractC9255GBi.A00 == c78i2) && (e = (E) abstractC9255GBi.A01.invoke(this)) != null) {
                return e;
            }
        } else if (InterfaceC10590Hxd.A00 == c78i) {
            return this;
        }
        return null;
    }

    @Deprecated(level = Hs1.A03, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @ReplaceWith(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ GBK limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // X.HqU, X.C78T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ X.C78T minusKey(X.C78I<?> r3) {
        /*
            r2 = this;
            r0 = 1
            X.C7384Etj.A0Y(r3, r0)
            boolean r0 = r3 instanceof X.AbstractC9255GBi
            if (r0 == 0) goto L23
            X.GBi r3 = (X.AbstractC9255GBi) r3
            X.78I<?> r1 = r2.key
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            if (r1 == r3) goto L16
            X.78I<?> r0 = r3.A00
            if (r0 != r1) goto L20
        L16:
            X.G0U<X.78X, E extends B> r0 = r3.A01
            java.lang.Object r0 = r0.invoke(r2)
            if (r0 == 0) goto L20
        L1e:
            X.6ys r2 = X.C6ys.A00
        L20:
            X.78T r2 = (X.C78T) r2
            return r2
        L23:
            X.Hx7 r0 = X.InterfaceC10590Hxd.A00
            if (r0 != r3) goto L20
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBK.minusKey(X.78I):X.78T");
    }

    public GBK() {
        super(InterfaceC10590Hxd.A00);
    }

    public static /* synthetic */ GBK limitedParallelism$default(GBK gbk, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return gbk.limitedParallelism(i, str);
    }

    public final <T> HtJ<T> interceptContinuation(HtJ<? super T> htJ) {
        return new GBJ(htJ, this);
    }

    public boolean isDispatchNeeded(C78T c78t) {
        return true;
    }

    @Deprecated(level = Hs1.A02, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final GBK plus(GBK gbk) {
        return gbk;
    }

    @Override // X.InterfaceC10590Hxd
    public final void releaseInterceptedContinuation(HtJ<?> htJ) {
        GBL gbl;
        C7384Etj.A0Z(htJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBJ.A04;
        while (atomicReferenceFieldUpdater.get(htJ) == GBI.A00) {
        }
        Object obj = atomicReferenceFieldUpdater.get(htJ);
        if (!(obj instanceof GBL) || (gbl = (GBL) obj) == null) {
            return;
        }
        gbl.A0H();
    }

    public String toString() {
        return FGI.A0O(C3cI.A0Y(this), BV7.A0x(this), '@');
    }

    public void dispatchYield(C78T c78t, Runnable runnable) {
        GBI.A01(runnable, c78t, this);
    }

    public GBK limitedParallelism(int i, String str) {
        GBA.A00(i);
        return new GBQ(str, this, i);
    }
}

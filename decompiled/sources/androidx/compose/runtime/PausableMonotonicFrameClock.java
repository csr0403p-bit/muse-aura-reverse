package androidx.compose.runtime;

import X.BQr;
import X.C7384Etj;
import X.C78I;
import X.C78T;
import X.C78W;
import X.C78X;
import X.C7Hd;
import X.G0V;

/* loaded from: classes3.dex */
public final class PausableMonotonicFrameClock implements BQr {
    public final C7Hd A00 = new C7Hd();
    public final BQr A01;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.BQr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object AiS(X.G0U<? super java.lang.Long, ? extends R> r9, X.HtJ<? super R> r10) {
        /*
            r8 = this;
            r3 = 0
            boolean r0 = r10 instanceof X.C8iP
            if (r0 == 0) goto Ld
            r0 = r10
            X.8iP r0 = (X.C8iP) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L30
            r5 = r10
            X.8iP r5 = (X.C8iP) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r5.A00 = r2
        L1e:
            java.lang.Object r1 = r5.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L3e
            if (r0 == r7) goto L78
            if (r0 != r6) goto L36
            X.Hwg.A00(r1)
            return r1
        L30:
            X.8iP r5 = new X.8iP
            r5.<init>(r8, r10, r3)
            goto L1e
        L36:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3e:
            X.Hwg.A00(r1)
            X.7Hd r3 = r8.A00
            r5.A01 = r9
            r5.A00 = r7
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r2)
            if (r0 != 0) goto L73
            java.lang.String r0 = X.GBL.__redex_internal_original_name
            X.HtJ r0 = X.C7Bm.A02(r5)
            X.GBL r1 = new X.GBL
            r1.<init>(r7, r0)
            r1.A0I()
            monitor-enter(r2)
            java.util.List<X.HtJ<kotlin.Unit>> r0 = r3.A00     // Catch: java.lang.Throwable -> L8d
            r0.add(r1)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r2)
            X.8i8 r0 = new X.8i8
            r0.<init>(r7, r3, r1)
            r1.AO2(r0)
            java.lang.Object r0 = r1.A0F()
            if (r0 != r4) goto L73
            goto L75
        L73:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L75:
            if (r0 != r4) goto L7f
        L77:
            return r4
        L78:
            java.lang.Object r9 = r5.A01
            X.G0U r9 = (X.G0U) r9
            X.Hwg.A00(r1)
        L7f:
            X.BQr r1 = r8.A01
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            java.lang.Object r0 = r1.AiS(r9, r5)
            if (r0 == r4) goto L77
            return r0
        L8d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.AiS(X.G0U, X.HtJ):java.lang.Object");
    }

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public final /* synthetic */ C78I getKey() {
        return BQr.A00;
    }

    public PausableMonotonicFrameClock(BQr bQr) {
        this.A01 = bQr;
    }

    @Override // X.C78X, X.C78T
    public final /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}

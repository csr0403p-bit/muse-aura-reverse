package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public abstract class EsN {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(java.util.Collection<? extends X.HoC> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C7369EsO
            if (r0 == 0) goto L54
            r7 = r9
            X.EsO r7 = (X.C7369EsO) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 != r4) goto L5d
            int r3 = r7.I$0
            java.lang.Object r2 = r7.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.Hwg.A00(r1)
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            X.HoC r1 = (X.HoC) r1
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r2
            r7.L$3 = r0
            r7.L$4 = r0
            r7.I$0 = r3
            r7.I$1 = r5
            r7.label = r4
            java.lang.Object r0 = r1.APQ(r7)
            if (r0 != r6) goto L27
            return r6
        L4b:
            X.Hwg.A00(r1)
            java.util.Iterator r2 = r8.iterator()
            r3 = 0
            goto L27
        L54:
            X.EsO r7 = new X.EsO
            r7.<init>(r9)
            goto L12
        L5a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EsN.A01(java.util.Collection, X.HtJ):java.lang.Object");
    }

    public static final <T> Object A00(Collection<? extends C27k<? extends T>> collection, HtJ<? super List<? extends T>> htJ) {
        if (collection.isEmpty()) {
            return C0881AGi.A00;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = EsK.A01;
        return new EsK((C27k[]) collection.toArray(new C27k[0])).A00(htJ);
    }
}

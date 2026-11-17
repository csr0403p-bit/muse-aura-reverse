package X;

import kotlin.Unit;

/* renamed from: X.3uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C05653uk<T> extends C05593uc<T> {
    public final G0V<HyO<? super T>, HtJ<? super Unit>, Object> A00;

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    @Override // X.C05593uc, X.AbstractC05583ub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.HyO<? super T> r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = r7 instanceof X.AnonymousClass609
            if (r0 == 0) goto L3f
            r3 = r7
            X.609 r3 = (X.AnonymousClass609) r3
            int r0 = r3.$t
            if (r0 != r4) goto L3f
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r2 = r3.A02
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            if (r0 == 0) goto L31
            if (r0 != r4) goto L4c
            java.lang.Object r6 = r3.A01
            X.HxO r6 = (X.HxO) r6
            X.Hwg.A00(r2)
        L28:
            boolean r0 = r6.AOF()
            if (r0 == 0) goto L45
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L31:
            X.Hwg.A00(r2)
            r3.A01 = r6
            r3.A00 = r4
            java.lang.Object r0 = super.A00(r6, r3)
            if (r0 != r1) goto L28
            return r1
        L3f:
            X.609 r3 = new X.609
            r3.<init>(r5, r7, r4)
            goto L17
        L45:
            java.lang.String r0 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05653uk.A00(X.HyO, X.HtJ):java.lang.Object");
    }

    public C05653uk(Integer num, C78T c78t, G0V g0v, int i) {
        super(num, c78t, g0v, i);
        this.A00 = g0v;
    }
}

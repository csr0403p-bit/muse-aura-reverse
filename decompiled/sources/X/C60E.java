package X;

import kotlin.Unit;

/* renamed from: X.60E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60E extends AbstractC07127nr implements G0W {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60E(Object obj, G0V<? super T, ? super HtJ<? super R>, ? extends Object> g0v, HtJ<? super C60E> htJ) {
        super(3, g0v);
        this.$t = htJ;
        this.A04 = obj;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C60E c60e = new C60E(this.A04, (HtJ) obj3, this.$t != 0 ? 1 : 0);
        c60e.A01 = obj;
        c60e.A02 = obj2;
        return c60e.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r0 != 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r7 = (X.C20Z) r8.A03;
        X.Hwg.A00(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        X.Hwg.A00(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.$t
            java.lang.Object r7 = r8.A01
            X.20Z r7 = (X.C20Z) r7
            if (r0 == 0) goto L1c
            java.lang.Object r1 = r8.A02
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L3e
            if (r0 == r4) goto L5a
        L16:
            X.Hwg.A00(r9)
        L19:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L1c:
            java.lang.Object r3 = r8.A02
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L5a
            goto L16
        L29:
            X.Hwg.A00(r9)
            java.lang.Object r1 = r8.A04
            X.G0V r1 = (X.G0V) r1
            r0 = 0
            r8.A01 = r0
            r8.A02 = r0
            r8.A03 = r7
            r8.A00 = r2
            java.lang.Object r9 = r1.invoke(r3, r8)
            goto L57
        L3e:
            X.Hwg.A00(r9)
            java.lang.Object r3 = r8.A04
            X.G0W r3 = (X.G0W) r3
            r0 = 0
            r2 = r1[r0]
            r1 = r1[r4]
            r0 = 0
            r8.A01 = r0
            r8.A02 = r0
            r8.A03 = r7
            r8.A00 = r4
            java.lang.Object r9 = r3.invoke(r2, r1, r8)
        L57:
            if (r9 != r6) goto L61
            return r6
        L5a:
            java.lang.Object r7 = r8.A03
            X.20Z r7 = (X.C20Z) r7
            X.Hwg.A00(r9)
        L61:
            r0 = 0
            r8.A01 = r0
            r8.A02 = r0
            r8.A03 = r0
            r8.A00 = r5
            java.lang.Object r0 = r7.emit(r9, r8)
            if (r0 != r6) goto L19
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

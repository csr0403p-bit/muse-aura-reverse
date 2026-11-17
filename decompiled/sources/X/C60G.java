package X;

import kotlin.Unit;

/* renamed from: X.60G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60G extends AbstractC07127nr implements G0W {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60G(Object obj, HtJ htJ, int i) {
        super(3, htJ);
        this.$t = i;
        this.A04 = obj;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.$t;
        HtJ htJ = (HtJ) obj3;
        Object obj4 = this.A04;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        C60G c60g = new C60G(obj4, htJ, i);
        c60g.A01 = obj;
        c60g.A02 = obj2;
        return c60g.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r4 != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        if (r4 == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        X.Hwg.A00(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r3 = (X.C20Z) r12.A03;
        X.Hwg.A00(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.$t
            java.lang.Object r3 = r12.A01
            X.20Z r3 = (X.C20Z) r3
            java.lang.Object r0 = r12.A02
            switch(r1) {
                case 0: goto L39;
                case 1: goto L62;
                default: goto Lb;
            }
        Lb:
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            X.Hji r2 = X.EnumC10460Hji.A02
            int r4 = r12.A00
            r1 = 2
            r5 = 1
            if (r4 != 0) goto L8b
            X.Hwg.A00(r13)
            java.lang.Object r6 = r12.A04
            X.G2l r6 = (X.G2l) r6
            r4 = 0
            r7 = r0[r4]
            r8 = r0[r5]
            r9 = r0[r1]
            r4 = 3
            r10 = r0[r4]
            r4 = 4
            r11 = r0[r4]
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A03 = r3
            r12.A00 = r5
            java.lang.Object r13 = r6.invoke(r7, r8, r9, r10, r11, r12)
        L36:
            if (r13 != r2) goto L9a
            return r2
        L39:
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            X.Hji r2 = X.EnumC10460Hji.A02
            int r4 = r12.A00
            r1 = 2
            r8 = 1
            if (r4 == 0) goto L46
            if (r4 == r8) goto L93
            goto L8d
        L46:
            X.Hwg.A00(r13)
            java.lang.Object r7 = r12.A04
            X.G2j r7 = (X.G2j) r7
            r4 = 0
            r6 = r0[r4]
            r5 = r0[r8]
            r4 = r0[r1]
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A03 = r3
            r12.A00 = r8
            java.lang.Object r13 = r7.invoke(r6, r5, r4, r12)
            goto L36
        L62:
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            X.Hji r2 = X.EnumC10460Hji.A02
            int r4 = r12.A00
            r1 = 2
            r5 = 1
            if (r4 != 0) goto L8b
            X.Hwg.A00(r13)
            java.lang.Object r7 = r12.A04
            X.G2k r7 = (X.G2k) r7
            r4 = 0
            r8 = r0[r4]
            r9 = r0[r5]
            r10 = r0[r1]
            r4 = 3
            r11 = r0[r4]
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A03 = r3
            r12.A00 = r5
            java.lang.Object r13 = r7.invoke(r8, r9, r10, r11, r12)
            goto L36
        L8b:
            if (r4 == r5) goto L93
        L8d:
            X.Hwg.A00(r13)
        L90:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L93:
            java.lang.Object r3 = r12.A03
            X.20Z r3 = (X.C20Z) r3
            X.Hwg.A00(r13)
        L9a:
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A03 = r0
            r12.A00 = r1
            java.lang.Object r0 = r3.emit(r13, r12)
            if (r0 != r2) goto L90
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

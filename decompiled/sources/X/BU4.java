package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU4 extends AbstractC07127nr implements G0V {
    public final int $t = 1;
    public int A00;
    public int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AvP;ILX/HtJ<-LX/BU4;>;)V */
    public BU4(AvP avP, HtJ htJ, int i) {
        super(2, htJ);
        this.A02 = avP;
        this.A00 = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t == 0) {
            return new BU4((AvP) this.A02, htJ, this.A00);
        }
        BU4 bu4 = new BU4((C1864Asd) this.A02, htJ);
        bu4.A00 = AnonymousClass001.A0F(obj);
        return bu4;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        HtJ<Unit> htJA1E;
        if (this.$t != 0) {
            htJA1E = create(Integer.valueOf(AnonymousClass001.A0F(obj)), (HtJ) obj2);
        } else {
            htJA1E = C8j3.A1E(obj2, obj, this);
        }
        return ((BU4) htJA1E).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r1 = r5.$t
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A01
            if (r1 == 0) goto L2d
            r3 = 1
            if (r0 != 0) goto L42
            X.Hwg.A00(r6)
            int r0 = r5.A00
            int r0 = java.lang.Math.abs(r0)
            if (r0 != r3) goto L45
            java.lang.Object r0 = r5.A02
            X.Asd r0 = (X.C1864Asd) r0
            X.BPp r2 = r0.A05
            if (r2 == 0) goto L45
            r5.A01 = r3
            r1 = 0
            X.8ib r0 = new X.8ib
            r0.<init>(r2, r1, r3)
            java.lang.Object r0 = X.Hxb.A00(r0, r5)
        L2a:
            if (r0 != r4) goto L45
            return r4
        L2d:
            r2 = 1
            if (r0 != 0) goto L42
            X.Hwg.A00(r6)
            java.lang.Object r0 = r5.A02
            X.AvP r0 = (X.AvP) r0
            X.AxI r1 = r0.A01
            int r0 = r5.A00
            r5.A01 = r2
            java.lang.Object r0 = r1.AcI(r0, r5)
            goto L2a
        L42:
            X.Hwg.A00(r6)
        L45:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BU4(C1864Asd c1864Asd, HtJ<? super BU4> htJ) {
        super(2, htJ);
        this.A02 = c1864Asd;
    }
}

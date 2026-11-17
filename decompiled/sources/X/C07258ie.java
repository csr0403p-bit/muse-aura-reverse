package X;

import kotlin.Unit;

/* renamed from: X.8ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07258ie extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07258ie(EIN ein, EIN ein2, boolean z, boolean z2, G0U<? super EJV, ? extends R> g0u, HtJ<? super C07258ie> htJ) {
        super(2, ein2);
        this.$t = z2 ? 1 : 0;
        this.A02 = ein;
        if (z2) {
            this.A04 = g0u;
            this.A03 = htJ;
        } else {
            this.A03 = g0u;
            this.A04 = htJ;
        }
        this.A01 = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        boolean z;
        boolean z2;
        G0U g0u;
        int i;
        int i2 = this.$t;
        EIN ein = (EIN) this.A02;
        if (i2 != 0) {
            z = this.A04;
            z2 = this.A03;
            g0u = (G0U) this.A01;
            i = 1;
        } else {
            z = this.A03;
            z2 = this.A04;
            g0u = (G0U) this.A01;
            i = 0;
        }
        return new C07258ie(ein, htJ, g0u, i, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r4 = r16
            r2 = r15
            int r3 = r15.$t
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r15.A00
            r7 = 1
            if (r3 == 0) goto L2c
            if (r0 != 0) goto L5a
            X.Hwg.A00(r4)
            java.lang.Object r4 = r15.A02
            X.EIN r4 = (X.EIN) r4
            boolean r9 = r15.A04
            boolean r8 = r15.A03
            r5 = 0
            java.lang.Object r6 = r15.A01
            X.G0U r6 = (X.G0U) r6
            X.EZA r3 = new X.EZA
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L23:
            r2.A00 = r7
            java.lang.Object r4 = r4.useConnection(r9, r3, r2)
            if (r4 == r1) goto L59
            return r4
        L2c:
            if (r0 != 0) goto L5a
            X.Hwg.A00(r4)
            java.lang.Object r4 = r15.A02
            X.EIN r4 = (X.EIN) r4
            boolean r0 = r4.inCompatibilityMode()
            if (r0 == 0) goto L41
            boolean r0 = r4.inTransaction()
            if (r0 != 0) goto L46
        L41:
            boolean r0 = r15.A03
            r15 = 1
            if (r0 != 0) goto L47
        L46:
            r15 = 0
        L47:
            boolean r9 = r2.A04
            java.lang.Object r13 = r2.A01
            X.G0U r13 = (X.G0U) r13
            r12 = 0
            r14 = 0
            X.EZA r3 = new X.EZA
            r10 = r3
            r11 = r4
            r16 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L23
        L59:
            return r1
        L5a:
            X.Hwg.A00(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07258ie.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07258ie) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}

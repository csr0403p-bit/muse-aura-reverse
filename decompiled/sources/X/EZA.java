package X;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EZA extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZA(EIN ein, HtJ htJ, G0U g0u, int i, boolean z, boolean z2) {
        super(2, htJ);
        this.$t = i;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = ein;
        this.A03 = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        int i = this.$t;
        EZA eza = new EZA((EIN) this.A04, htJ, (G0U) this.A03, i != 0 ? 1 : 0, this.A05, this.A06);
        eza.A01 = obj;
        return eza;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[PHI: r7
  0x001f: PHI (r7v5 java.lang.Object) = (r7v2 java.lang.Object), (r7v7 java.lang.Object) binds: [B:45:0x00d1, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EZA) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}

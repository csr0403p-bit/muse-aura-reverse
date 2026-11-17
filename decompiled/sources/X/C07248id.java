package X;

import kotlin.Unit;

/* renamed from: X.8id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07248id extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07248id(Object obj, GOz gOz, boolean z, HtJ<? super C07248id> htJ) {
        super(2, gOz);
        this.$t = z ? 1 : 0;
        this.A02 = obj;
        this.A03 = htJ;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        int i = this.$t;
        C07248id c07248id = new C07248id(this.A02, htJ, i != 0 ? 1 : 0, this.A03);
        c07248id.A01 = obj;
        return c07248id;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.$t
            java.lang.Object r5 = r6.A01
            if (r0 == 0) goto L24
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient r5 = (com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient) r5
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 != 0) goto L41
            X.Hwg.A00(r7)
            java.lang.Object r2 = r6.A02
            X.GOz r2 = (X.GOz) r2
            boolean r1 = r6.A03
            r0 = 0
            r6.A01 = r0
            r6.A00 = r3
            java.lang.Object r7 = r5.AYy(r2, r6, r1)
        L21:
            if (r7 == r4) goto L40
            return r7
        L24:
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient r5 = (com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient) r5
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 != 0) goto L41
            X.Hwg.A00(r7)
            java.lang.Object r2 = r6.A02
            X.Hkg r2 = (X.Hkg) r2
            boolean r1 = r6.A03
            r0 = 0
            r6.A01 = r0
            r6.A00 = r3
            java.lang.Object r7 = r5.AYx(r2, r6, r1)
            goto L21
        L40:
            return r4
        L41:
            X.Hwg.A00(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07248id.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07248id) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}

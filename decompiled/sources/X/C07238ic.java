package X;

import androidx.glance.session.SessionWorker;
import kotlin.Unit;

/* renamed from: X.8ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07238ic extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07238ic(Object obj, C77Q c77q, SessionWorker sessionWorker, HtJ<? super C07238ic> htJ) {
        super(1, sessionWorker);
        this.$t = htJ;
        this.A01 = c77q;
        this.A02 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        int i2;
        switch (this.$t) {
            case 0:
                obj = this.A01;
                obj2 = this.A02;
                i = 0;
                break;
            case 1:
                obj = this.A01;
                obj2 = this.A02;
                i = 1;
                break;
            case 2:
                obj3 = this.A02;
                obj4 = this.A01;
                i2 = 2;
                return new C07238ic(obj3, obj4, htJ, i2);
            case 3:
                obj3 = this.A02;
                obj4 = this.A01;
                i2 = 3;
                return new C07238ic(obj3, obj4, htJ, i2);
            default:
                obj3 = this.A02;
                obj4 = this.A01;
                i2 = 4;
                return new C07238ic(obj3, obj4, htJ, i2);
        }
        return new C07238ic(obj2, obj, htJ, i);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C07238ic) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.$t
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L5b;
                case 2: goto L72;
                case 3: goto L22;
                default: goto L5;
            }
        L5:
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 != 0) goto L91
            X.Hwg.A00(r5)
            java.lang.Object r0 = r4.A02
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient r0 = (com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient) r0
            X.HuC r1 = r0.A02
            java.lang.Object r0 = r4.A01
            X.Hz2 r0 = (X.Hz2) r0
            r4.A00 = r2
            java.lang.Object r5 = r1.A6z(r0, r4)
        L1f:
            if (r5 != r3) goto L94
            return r3
        L22:
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 != 0) goto L91
            X.Hwg.A00(r5)
            java.lang.Object r0 = r4.A02
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient r0 = (com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient) r0
            X.HuC r1 = r0.A02
            java.lang.Object r0 = r4.A01
            X.Hz2 r0 = (X.Hz2) r0
            r4.A00 = r2
            java.lang.Object r5 = r1.A2s(r0, r4)
            goto L1f
        L3d:
            int r0 = r4.A00
            if (r0 != 0) goto L56
            X.Hwg.A00(r5)
            java.lang.Object r2 = r4.A01
            X.77Q r2 = (X.C77Q) r2
            java.lang.Object r0 = r4.A02
            androidx.glance.session.SessionWorker r0 = (androidx.glance.session.SessionWorker) r0
            X.77e r0 = r0.A02
            long r0 = r0.A01
            r2.AgM(r0)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L5b:
            int r0 = r4.A00
            if (r0 != 0) goto L6d
            X.Hwg.A00(r5)
            java.lang.Object r1 = r4.A01
            X.G0U r1 = (X.G0U) r1
            java.lang.Object r0 = r4.A02
            java.lang.Object r3 = r1.invoke(r0)
            return r3
        L6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L72:
            r1 = r5
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L7e
            X.Hwg.A00(r5)
            return r1
        L7e:
            X.Hwg.A00(r5)
            java.lang.Object r1 = r4.A02
            X.G0V r1 = (X.G0V) r1
            java.lang.Object r0 = r4.A01
            r4.A00 = r2
            java.lang.Object r1 = r1.invoke(r0, r4)
            if (r1 != r3) goto L90
            return r3
        L90:
            return r1
        L91:
            X.Hwg.A00(r5)
        L94:
            X.HoG r5 = (X.InterfaceC10512HoG) r5
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            X.FH5 r1 = new X.FH5
            r1.<init>(r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07238ic.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

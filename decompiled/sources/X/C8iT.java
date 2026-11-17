package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.auto.AutoConnectionManager;
import com.facebook.payments.dcp.xapp.billingclient.impl.auto.DcpAutoBillingClient;

/* renamed from: X.8iT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iT extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iT(Object obj, AutoConnectionManager autoConnectionManager, HtJ<? super C8iT> htJ) {
        super(autoConnectionManager);
        this.$t = htJ;
        this.A05 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return i != 0 ? DcpAutoBillingClient.A00((DcpAutoBillingClient) this.A05, this, null, null, false) : AutoConnectionManager.A00(null, (AutoConnectionManager) this.A05, this, false);
    }
}

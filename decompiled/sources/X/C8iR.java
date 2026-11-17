package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader;

/* renamed from: X.8iR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iR extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public boolean A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iR(Object obj, DcpRetriableBillingClient dcpRetriableBillingClient, HtJ<? super C8iR> htJ) {
        super(dcpRetriableBillingClient);
        this.$t = htJ;
        this.A03 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return ((DcpRetriableBillingClient) this.A03).A01(false, null, this);
            case 1:
                return ((DcpRetriableBillingClient) this.A03).AYx(null, this, false);
            case 2:
                return ((DcpRetriableBillingClient) this.A03).AYy(null, this, false);
            default:
                return DcpProductDetailsLoader.A01(null, (DcpProductDetailsLoader) this.A03, this, false);
        }
    }
}

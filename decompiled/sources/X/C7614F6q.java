package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import kotlin.Unit;

/* renamed from: X.F6q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7614F6q extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7614F6q(String str, Object obj, int i) {
        super(1);
        this.$t = i;
        this.A00 = obj;
        this.A01 = str;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.$t != 0) {
            G0U g0u = (G0U) obj;
            C7384Etj.A0Y(g0u, 0);
            ((DcpRetriableBillingClient) this.A00).A02.ACo(new F8N(g0u), this.A01);
        } else {
            DcpRetriableBillingClient dcpRetriableBillingClient = (DcpRetriableBillingClient) obj;
            C7384Etj.A0Y(dcpRetriableBillingClient, 0);
            dcpRetriableBillingClient.ACo((HyF) this.A00, this.A01);
        }
        return Unit.INSTANCE;
    }
}

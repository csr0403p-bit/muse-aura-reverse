package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.auto.AutoConnectionManager;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import kotlin.Unit;

/* renamed from: X.79Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79Z extends AbstractC7559F3s implements G0U<DcpRetriableBillingClient, Unit> {
    public final /* synthetic */ C79Y $currentGeneration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79Z(C79Y c79y) {
        super(1);
        this.$currentGeneration = c79y;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(DcpRetriableBillingClient dcpRetriableBillingClient) {
        C79Y c79y = this.$currentGeneration;
        AutoConnectionManager autoConnectionManager = c79y.A04;
        synchronized (c79y) {
            if (!c79y.A00) {
                c79y.A03.AAa();
                c79y.A03 = autoConnectionManager.A02.invoke();
                InterfaceC10560Hsz<InterfaceC10512HoG> andSet = c79y.A01.getAndSet(null);
                if (andSet != null) {
                    andSet.A5w(null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}

package X;

import androidx.datastore.core.SingleProcessDataStore;
import com.facebook.payments.dcp.xapp.controller.purchase.IapPrePaymentController;
import com.meta.health.healthconnect.HealthConnectPlugin;

/* renamed from: X.FtM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8904FtM extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8904FtM(Object obj, SingleProcessDataStore<T> singleProcessDataStore, HtJ<? super C8904FtM> htJ) {
        super(singleProcessDataStore);
        this.$t = htJ;
        this.A08 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return SingleProcessDataStore.A01((SingleProcessDataStore) this.A08, this);
            case 1:
                return IapPrePaymentController.A00((IapPrePaymentController) this.A08, null, null, null, this);
            case 2:
                return ((HealthConnectPlugin) this.A08).AB8(null, null, null, this);
            default:
                return HealthConnectPlugin.A07(null, null, (HealthConnectPlugin) this.A08, null, null, null, null, this);
        }
    }
}
